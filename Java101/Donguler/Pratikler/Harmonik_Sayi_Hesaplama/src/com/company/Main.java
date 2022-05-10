package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        double sum = 0;

        for (int i = 1; i <= number; i++){
            sum += (1.0/i);
        }

        System.out.println("Girilen sayının harmonik ortalaması: " + sum);
    }
}
