package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        if(number == isPalidrom(number)){
            System.out.println("Bu bir Palidrom sayısıdır.");
        }
        else{
            System.out.println("Kurallara Uymadı");
        }


    }

    public static int isPalidrom(int k){
        int temp = k, reservedNumber = 0;
        while(k > 0){
            temp = k % 10;
            reservedNumber = temp + (reservedNumber * 10);
            k /= 10;
        }
        return reservedNumber;
    }
}
