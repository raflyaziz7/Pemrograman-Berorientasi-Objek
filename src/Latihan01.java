


public class Latihan01 {
    public static void main(String[] args) {

        double celcius = 30;

        double fahrenheit = (celcius * 9 / 5) + 32;
        double reamur = celcius * 4 / 5;
        double kelvin = celcius + 273.15;

        System.out.println("Konversi Suhu");
        System.out.println("Celsius    : " + celcius);
        System.out.println("Fahrenheit : " + fahrenheit);
        System.out.println("Reamur     : " + reamur);
        System.out.println("Kelvin     : " + kelvin);
    }
}