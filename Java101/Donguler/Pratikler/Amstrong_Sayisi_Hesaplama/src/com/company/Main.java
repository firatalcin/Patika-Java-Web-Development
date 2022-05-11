package com.company;

import java.util.Scanner;

public class Main {

    //Amstrong Sayısı

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int temp = sayi, basamak_sayisi = 0, basamak = 0, toplam = 0;

        while (temp > 0){
            temp /= 10;
            basamak_sayisi++;
        }

        temp = sayi;

        while (temp > 0){
            basamak = temp % 10;
            temp /= 10;
            toplam += UstAlma(basamak,basamak_sayisi);
        }

        if(toplam == sayi){
            System.out.println("Bu sayi Amstrong sayısıdır");
        }
        else{
            System.out.println("Bu sayi Amstrong sayısı değildir");
        }
    }

    static int UstAlma(int a, int b){
        int toplam = 1;
        for (int i = 1; i <= b; i++){
            toplam *= a;
        }
        return toplam;

    }
}
