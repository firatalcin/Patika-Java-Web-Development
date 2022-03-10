package com.company;

import java.util.Scanner;

public class Main {
/*
    Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

    Ödev
    Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
    değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/
    public static void main(String[] args) {

        //Pratik

        Scanner scanner = new Scanner(System.in);

        int sayi,toplam = 0;
        do {
            System.out.println("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            if(sayi% 2 ==1){
                toplam+=sayi;
            }
        } while (sayi >= 0);

        System.out.println("Toplam: " + toplam);

        //Ödev
        toplam = 0;
        do {
            System.out.println("Bir sayi giriniz: ");
            sayi = scanner.nextInt();
            if(sayi % 2 == 0 && sayi % 4 == 0){
                toplam+=sayi;
            }
        }while (sayi%2==0);

        System.out.println("Toplam: " + toplam);
    }
}
