import javax.swing.JOptionPane;

public class Latihan04 {

    // Method untuk input dengan konfirmasi keluar
    public static String inputData(String pesan) {

        while (true) {

            String hasil = JOptionPane.showInputDialog(pesan);

            if (hasil == null) {

                int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "Apakah anda ingin keluar ?",
                        "Konfirmasi",
                        JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }

                continue;
            }

            return hasil;
        }
    }

    public static void main(String[] args) {

        while (true) {

            Biodata data = new Biodata();

            // Input Fullname
            String fullname;

            while (true) {

                fullname = inputData("Masukkan Fullname:");

                if (fullname.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Field fullname tidak boleh kosong",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    break;
                }
            }

            // Input Usia
            int usia = 0;

            while (true) {

                String usiaInput = inputData("Masukkan Usia:");

                if (usiaInput.trim().isEmpty()) {
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

                alamat = inputData("Masukkan Alamat:");

                if (alamat.trim().isEmpty()) {
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

            // Tampilkan Biodata
            JOptionPane.showMessageDialog(null,
                    "BIODATA MAHASISWA\n\n"
                    + "Fullname : " + data.getFullname()
                    + "\nUsia : " + data.getUsia()
                    + "\nAlamat : " + data.getAlamat(),
                    "Informasi Biodata",
                    JOptionPane.INFORMATION_MESSAGE);

            // Konfirmasi setelah informasi ditampilkan
            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Apakah anda ingin keluar ?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                System.exit(0);
            }

            // Jika NO, perulangan kembali ke Fullname
        }
    }
}
