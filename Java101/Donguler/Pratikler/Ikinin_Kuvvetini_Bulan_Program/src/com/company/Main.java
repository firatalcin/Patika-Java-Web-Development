package com.company;

import java.util.Scanner;

public class Main {

    /*
     Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.

     Ödev
     Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pratik

        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int toplam = 1;



        toplam = 1;
        while (toplam < sayi){
            toplam *=2;
            if(toplam >= sayi){
                continue;
            }
            System.out.print(toplam + ", ");
        }

        System.out.println();

        //Ödev

        toplam = 1;
        while (toplam < sayi){
            toplam *=4;
            if(toplam >= sayi){
                continue;
            }
            System.out.print(toplam + ", ");
        }

        System.out.println();

        toplam = 1;
        while (toplam < sayi){
            toplam *=5;
            if(toplam >= sayi){
                continue;
            }
            System.out.print(toplam + ", ");
        }

    }
}
