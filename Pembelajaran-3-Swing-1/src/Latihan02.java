import javax.swing.JOptionPane;

public class Latihan02 {

    public static void main(String[] args) {

        Biodata data = new Biodata();

        String fullname = JOptionPane.showInputDialog(
                "Masukkan Fullname:");

        String usiaInput = JOptionPane.showInputDialog(
                "Masukkan Usia:");

        String alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat:");

        int usia = Integer.parseInt(usiaInput);

        data.simpanBiodata(fullname, usia, alamat);

        JOptionPane.showMessageDialog(null,
                "BIODATA MAHASISWA\n\n"
                + "Fullname : " + data.getFullname()
                + "\nUsia : " + data.getUsia()
                + "\nAlamat : " + data.getAlamat(),
                "Informasi Biodata",
                JOptionPane.INFORMATION_MESSAGE);
    }
}