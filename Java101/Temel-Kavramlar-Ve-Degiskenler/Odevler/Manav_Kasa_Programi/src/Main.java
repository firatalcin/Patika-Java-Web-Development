import java.util.Scanner;

public class Main {
/*
    Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        double armut = scanner.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        double elma = scanner.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        double domates = scanner.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        double muz = scanner.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        double patlican = scanner.nextDouble();

        double toplam = ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0));

        System.out.print("Toplam Tutar: " + toplam);

    }
}
