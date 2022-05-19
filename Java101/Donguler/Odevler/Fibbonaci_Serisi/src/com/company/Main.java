package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir index giriniz: ");
        int index = scanner.nextInt();
        int number1=0,number2=1,sum = 0;

        for (int i = 1;i<index;i++){
            sum = number1+number2;
            System.out.println(number1 + " + " + number2 + " = " + sum);
            number1 = number2;
            number2 = sum;
        }
    }
}
