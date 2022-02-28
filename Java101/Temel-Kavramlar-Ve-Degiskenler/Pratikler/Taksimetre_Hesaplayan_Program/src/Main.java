import java.util.Scanner;

public class Main {
/*
    Taksimetre Programı
    Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilen mesafeyi(km) giriniz: ");
        double km = scanner.nextDouble();

        double hesap = km * 2.20 + 10.0;

        double tutar = ((hesap) <= 20.0) ? 20.0 : hesap;

        System.out.println("Taksimetre Tutarı: " + tutar);


    }
}
