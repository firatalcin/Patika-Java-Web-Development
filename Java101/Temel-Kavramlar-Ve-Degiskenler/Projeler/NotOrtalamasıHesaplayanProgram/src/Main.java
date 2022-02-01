import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        int matematik = input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        int fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        int kimya = input.nextInt();
        System.out.print("Turkçe notunuzu giriniz: ");
        int turkce = input.nextInt();
        System.out.print("Tarih notunuzu giriniz: ");
        int tarih = input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        int muzik = input.nextInt();

        double ortalama = ((matematik + fizik + kimya + turkce + tarih + muzik)*1.0) / 6.0;

        System.out.println("Ders ortalaması: " + ortalama);

        String sonuc = (ortalama > 60) ? "Sınıf Geçti" : "Sınıfta Kaldı";

        System.out.println("Sonuc: " + sonuc);

    }
}
