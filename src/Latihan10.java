

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students mahasiswa = new Students();

        System.out.print("Masukkan nama member: ");
        mahasiswa.setFullname(input.nextLine());

        System.out.print("Masukkan jumlah roti: ");
        int jumlah = input.nextInt();

        int harga = 6300;
        int subtotal = jumlah * harga;
        double diskon = 0;

        if (jumlah % 3 == 0) {
            diskon = subtotal * 0.05;
        }

        double total = subtotal - diskon;

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        System.out.println("\nTOKO SERBAGUNA IBIK");
        System.out.println("Tanggal : " + waktu.format(format));
        System.out.println("------------------------------");
        System.out.println("Nama Barang : ROTI ENAK");
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Subtotal    : Rp" + subtotal);
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Total       : Rp" + total);
        System.out.println("Member Name : " + mahasiswa.Fullname);
        System.out.println("------------------------------");

        input.close();
    }
}
