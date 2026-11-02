import javax.swing.JOptionPane;

public class Latihan03 {

    public static void main(String[] args) {

        Biodata data = new Biodata();

        // Input Fullname
        String fullname;

        while (true) {
            fullname = JOptionPane.showInputDialog(
                    "Masukkan Fullname:");

            if (fullname == null || fullname.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field fullname tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }

        // Input Usia
        String usiaInput;
        int usia = 0;

        while (true) {
            usiaInput = JOptionPane.showInputDialog(
                    "Masukkan Usia:");

            if (usiaInput == null || usiaInput.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field usia tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                continue;
            }

            try {
                usia = Integer.parseInt(usiaInput);

                if (usia < 0) {
                    throw new NumberFormatException();
                }

                break;

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Isian usia harus angka",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }

        // Input Alamat
        String alamat;

        while (true) {
            alamat = JOptionPane.showInputDialog(
                    "Masukkan Alamat:");

            if (alamat == null || alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Field alamat tidak boleh kosong",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);

            } else if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning",
                        JOptionPane.WARNING_MESSAGE);

            } else {
                break;
            }
        }

        // Simpan Biodata
        data.simpanBiodata(fullname, usia, alamat);

        // Tampilkan hasil
        JOptionPane.showMessageDialog(null,
                "BIODATA MAHASISWA\n\n"
                + "Fullname : " + data.getFullname()
                + "\nUsia : " + data.getUsia()
                + "\nAlamat : " + data.getAlamat(),
                "Informasi Biodata",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
