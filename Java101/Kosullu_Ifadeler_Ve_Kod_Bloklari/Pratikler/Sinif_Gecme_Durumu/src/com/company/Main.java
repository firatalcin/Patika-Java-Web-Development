package com.company;

import java.util.Scanner;

public class Main {
    /*
    Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

    Geçme Notu : 55

    Ödev
    Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int ders_sayisi = 0;

        System.out.println("Matematik notunuzu giriniz: ");
        int matematik = scanner.nextInt();
        if(matematik >= 0 &&  matematik <= 100){
            toplam += matematik;
            ders_sayisi += 1;
        }

        System.out.println("Fizik notunuzu giriniz: ");
        int fizik = scanner.nextInt();
        if(fizik >= 0 &&  fizik <= 100){
            toplam += fizik;
            ders_sayisi += 1;
        }

        System.out.println("Türkçe notunuzu giriniz: ");
        int turkce = scanner.nextInt();
        if(turkce >= 0 &&  turkce <= 100){
            toplam += turkce;
            ders_sayisi += 1;
        }

        System.out.println("Kimya notunuzu giriniz: ");
        int kimya = scanner.nextInt();
        if(kimya >= 0 &&  kimya <= 100){
            toplam += kimya;
            ders_sayisi += 1;
        }

        System.out.println("Müzik notunuzu giriniz: ");
        int muzik = scanner.nextInt();
        if(muzik >= 0 &&  muzik <= 100){
            toplam += muzik;
            ders_sayisi += 1;
        }

        int sonuc = toplam / ders_sayisi;

        if (sonuc >= 55){
            System.out.println("Sınıfı Geçtiniz. Ortalamanız: " + sonuc);
        }
        else{
            System.out.println("Sınıfta Kaldınız. Ortalamanız: " + sonuc);
        }
    }
}
