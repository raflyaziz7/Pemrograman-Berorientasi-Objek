

import java.util.Scanner;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan minimal 20: ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Bilangan tidak boleh kurang dari 20.");
        } else {
            System.out.print("NPM genap atau ganjil? (G/Gj): ");
            String jenis = input.next();

            if (jenis.equalsIgnoreCase("G")) {
                System.out.print("ASC: Faktor " + angka + " adalah ");
                for (int i = 1; i <= angka; i++) {
                    if (angka % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            } else {
                System.out.print("DESC: Faktor " + angka + " adalah ");
                for (int i = angka; i >= 1; i--) {
                    if (angka % i == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }

        input.close();
    }
}

