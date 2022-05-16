package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int number1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int number2 = scanner.nextInt();
        int n1 = number1;
        int n2 = number2;

        int i = 2, ebob = 1;

        while (number1 % i == 0 && number2 % i == 0) {
            ebob *= i;
            number1 /= i;
            number2 /= i;

            if (number1 % i == 0 && number2 % i == 0) {
                i--;
            }
            i++;
        }

        System.out.println("----------------------------");
        System.out.println("EBOB: " + ebob);
        System.out.println("----------------------------");
        System.out.println("EKOK: " + ((n1 * n2) / ebob));
    }
}
