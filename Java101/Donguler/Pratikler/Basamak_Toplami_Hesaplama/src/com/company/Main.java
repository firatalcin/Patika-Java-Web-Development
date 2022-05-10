package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz: ");
        int number = scanner.nextInt();
        int temp = number;
        int sum = 0;
        while (temp > 0){
            sum += temp % 10;
            temp /=10;
        }

        System.out.println(number + " sayısının basamakları toplamı: " + sum);

    }
}
