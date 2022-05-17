package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();
        int s1=1,max=0,min=0;
        for(int i = 1; i<=n; i++){
            System.out.print(i + ". sayıyı giriniz: ");
            s1 = scanner.nextInt();
            if(s1 > max) {
                max = s1;
            }else if(s1 < min){
                min = s1;
            }
        }
        System.out.println("En büyük değer: " + max);
        System.out.println("En küçük değer: " + min);
    }
}
