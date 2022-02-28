import java.util.Scanner;

public class Main {

    /*

      Not Ortalaması Hesaplayan Program
      Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
      * ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

      Ödev
      Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" ,
      * küçük ise "Sınıfta Kaldı" yazsın.

      Not : If ve Else kullanılmayacak...

     */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz: ");
        double matematik = scan.nextDouble();
        System.out.println("Fizik notunu giriniz: ");
        double fizik = scan.nextDouble();
        System.out.println("Kimya notunu giriniz: ");
        double kimya = scan.nextDouble();
        System.out.println("Türkçe notunu giriniz: ");
        double turkce = scan.nextDouble();
        System.out.println("Tarih notunu giriniz: ");
        double tarih = scan.nextDouble();
        System.out.println("Müzik notunu giriniz: ");
        double muzik = scan.nextDouble();

        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;

        System.out.println("Ortalama : " + ortalama);
    }
}
