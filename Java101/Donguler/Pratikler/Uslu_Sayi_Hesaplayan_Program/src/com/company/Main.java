package com.company;

import java.util.Scanner;

public class Main {
/*
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

    Ödev
    Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pratik

        System.out.println("Üslü alınacak sayısı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("Üslü değerini giriniz: ");
        int uslu = scanner.nextInt();

//        int deger = uslu;
//        int toplam = 1;
//        while (uslu > 0){
//            toplam *= sayi;
//            uslu--;
//        }
//
//        System.out.println(sayi + "^" + deger + " = " + toplam);

        int deger = uslu;
        int toplam = 1;
        for(int i = 0; i< uslu; i++){
            toplam *= sayi;
        }
        System.out.println(sayi + "^" + deger + " = " + toplam);
    }
}
