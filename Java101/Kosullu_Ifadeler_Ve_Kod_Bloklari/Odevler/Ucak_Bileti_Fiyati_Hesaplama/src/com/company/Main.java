package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilecek mesafe (KM): ");
        double km = scanner.nextDouble();
        if (km < 1) {
            System.out.println("Hatalı Veri Girdiniz. pozitif sayı giriniz: ");
            km = scanner.nextDouble();
        }
        System.out.println("Yaşınız kaç : ");
        int age = scanner.nextInt();
        if (age < 1) {
            System.out.println("Hatalı Veri Girdiniz. Pozitif sayı giriniz: ");
            age = scanner.nextInt();
        }
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        int direction = scanner.nextInt();
        if (direction != 1 && direction != 2) {
            System.out.println("Hatalı Veri Girdiniz. 1 veya 2 seçeneklerinden birini seçiniz: ");
            direction = scanner.nextInt();
        }

        double indirimliFiyat = 0, toplam = 0;
        double indirimsizFiyat = km * 0.10;

        if (age < 12) {
            indirimliFiyat = indirimsizFiyat / 2.0;
        } else if (age >= 12 && age <= 24) {
            indirimliFiyat = indirimsizFiyat - indirimsizFiyat * 0.10;
        } else if (age > 65) {
            indirimliFiyat = indirimsizFiyat - indirimsizFiyat * 0.30;
        } else {
            toplam = indirimsizFiyat;
        }

        if (direction == 2) {
            toplam = indirimliFiyat - indirimliFiyat * 0.20;
            System.out.println("Toplam Tutar: " + toplam * 2);
        } else {
            System.out.println("Toplam Tutar: " + toplam);
        }


    }
}
