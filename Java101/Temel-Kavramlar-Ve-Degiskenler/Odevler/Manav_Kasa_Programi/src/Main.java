import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double adet1 = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        double adet2 = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        double adet3 = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        double adet4 = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        double adet5 = scanner.nextDouble();

        double toplam = (armut * adet1) + (elma * adet2) + (domates * adet3) + (muz * adet4) + (patlıcan * adet5);
        System.out.println("Toplam Tutar: " + toplam);

    }
}
