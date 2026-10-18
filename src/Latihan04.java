
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga = 6300;

        System.out.print("Masukkan jumlah produk yang dibeli: ");
        int qty = input.nextInt();

        int total = qty * harga;
        double diskon = 0;

        if (qty > 0 && qty % 3 == 0) {
            diskon = total * 0.05;
        }

        double subtotal = total - diskon;

        LocalDateTime waktu = LocalDateTime.now();
        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("\n==========================================");
        System.out.println("        TOKO SERBAGUNA IBIK");
        System.out.println("==========================================");
        System.out.println(waktu.format(format));
        System.out.println("ITEM       QTY    HARGA       TOTAL");
        System.out.println("------------------------------------------");

        System.out.printf("%-10s %-6d Rp %-8s Rp %,.0f%n",
            "ROTI ENAK", qty,
            String.format("%,d", harga), (double) total);

        System.out.println("------------------------------------------");
        System.out.printf("Diskon   : Rp %,.0f%n", diskon);
        System.out.printf("Sub Total: Rp %,.0f%n", subtotal);
        System.out.println("==========================================");

        input.close();
    }
}