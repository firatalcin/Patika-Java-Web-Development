import java.util.Scanner;

public class Main {
/*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();

        double index = kilo / (boy * boy);

        System.out.println("Vücut kitle indeksiniz: " + index);
    }
}
