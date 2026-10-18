
import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan firstname: ");
        String firstname = input.nextLine();

        System.out.print("Masukkan lastname: ");
        String lastname = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        String hasil = "" + usia + firstname + lastname + npm;

        System.out.println("Hasil CONCAT: " + hasil);

        input.close();
    }
}