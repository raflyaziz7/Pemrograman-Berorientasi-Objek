
import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students mahasiswa = new Students();

        System.out.print("Masukkan NPM: ");
        mahasiswa.setNPM(input.nextInt());
        input.nextLine();

        System.out.print("Masukkan nama lengkap: ");
        mahasiswa.setFullname(input.nextLine());

        System.out.print("Masukkan nama kelas: ");
        mahasiswa.setClassName(input.nextLine());

        System.out.print("Masukkan semester: ");
        mahasiswa.setSemester(input.nextInt());

        System.out.print("Masukkan IPK: ");
        mahasiswa.setGPA(input.nextFloat());

        System.out.println("\nDATA MAHASISWA");
        System.out.println("NPM          : " + mahasiswa.NPM);
        System.out.println("Nama Lengkap : " + mahasiswa.Fullname);
        System.out.println("Nama Kelas   : " + mahasiswa.ClassName);
        System.out.println("Semester     : " + mahasiswa.Semester);
        System.out.println("IPK          : " + mahasiswa.GPA);

        input.close();
    }
}

