import java.util.Scanner;

public class Latihan03 {

    static int digitTerakhirNPM;

    static double luasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    static double volumeKerucut(double r, double tinggi) {
        return Math.PI * r * r * tinggi / 3;
    }

    static double volumeTabung(double r, double tinggi) {
        return Math.PI * r * r * tinggi;
    }

    static double luasLayang(double d1, double d2) {
        return 0.5 * d1 * d2;
    }

    static double volumePrisma(double luasAlas, double tinggi) {
        return luasAlas * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan digit terakhir NPM: ");
        digitTerakhirNPM = input.nextInt();

        if (digitTerakhirNPM % 2 != 0) {
            double alas = 10;
            double tinggi = 8;
            double r = 7;
            double tinggiRuang = 12;

            System.out.println("Luas segitiga: "
                    + luasSegitiga(alas, tinggi));
            System.out.println("Volume kerucut: "
                    + volumeKerucut(r, tinggiRuang));
            System.out.println("Volume tabung: "
                    + volumeTabung(r, tinggiRuang));

        } else {
            double d1 = 12;
            double d2 = 8;
            double luasAlas = 0.5 * 6 * 4;
            double tinggiPrisma = 10;

            System.out.println("Luas layang-layang: "
                    + luasLayang(d1, d2));
            System.out.println("Volume prisma segitiga: "
                    + volumePrisma(luasAlas, tinggiPrisma));
        }

        input.close();
    }
}