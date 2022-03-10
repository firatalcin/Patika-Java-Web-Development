package com.company;

import java.util.Scanner;

public class Main {
/*
    Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

    Ödev
    Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
    tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }

        System.out.println();

        //Ödev
        int toplam = 0,count = 0;
        double ortalama = 0;

        for (int i = 0; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                toplam += i;
                count++;
            }
        }
        ortalama = toplam / count;
        System.out.println("Ortalama: " + ortalama);


    }
}
