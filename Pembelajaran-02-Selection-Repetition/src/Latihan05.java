

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of row: ");
        int n = input.nextInt();
        int ukuran = 2 * n + 1;


for (int baris = 0; baris < ukuran; baris++) {
    for (int kolom = 0; kolom < ukuran; kolom++) {
        if (baris == 0 || baris == ukuran - 1
            || kolom == 0 || kolom == ukuran - 1
            || kolom == baris
            || kolom == ukuran - 1 - baris) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }
    }
    System.out.println();
}


        input.close();
    }
}
