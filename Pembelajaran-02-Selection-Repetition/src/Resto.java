

import java.util.Scanner;

public class Resto {

    private long Harga;
    private int pilihan;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\n===== MENU SARAPAN =====");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Bubur Ayam");
        System.out.println("3. Soto Ayam");
        System.out.print("Pilih menu: ");

        pilihan = input.nextInt();

        Harga = getPrices();

        switch (pilihan) {
            case 1:
                System.out.println(
                    "Anda memesan Nasi Goreng dengan harga Rp 22.000,-"
                );
                break;

            case 2:
                System.out.println(
                    "Anda memesan Bubur Ayam dengan harga Rp 15.000,-"
                );
                break;

            case 3:
                System.out.println(
                    "Anda memesan Soto Ayam dengan harga Rp 25.000,-"
                );
                break;

            default:
                System.out.println(
                    "Maaf menu yang anda masukan salah."
                );
                break;
        }
    }

    private Long getPrices() {
        switch (pilihan) {
            case 1:
                return 22000L;

            case 2:
                return 15000L;

            case 3:
                return 25000L;

            default:
                return 0L;
        }
    }
}
