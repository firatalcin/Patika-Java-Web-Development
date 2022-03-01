package com.company;

import java.util.Scanner;

/*
        Ödev
        Videodaki hesap makinesini switch-case kullanarak yapınız.
*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.println("1- Toplama İşlemi\n2- Çıkarma İşlemi\n3- Çarpma İşlemi\n4- Bölme İşlemi");
        System.out.println("Bir işlem türü seçiniz: ");
        int secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlış secim yaptınız.");
                break;
        }

    }
}
