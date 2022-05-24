package com.company;

import java.util.Scanner;

public class Main {

    // 0+1= 1  - 1+2
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = scanner.nextInt();
        System.out.println("sonuc: " + rec_fib(number));

    }

    public static int rec_fib(int n) {
        if(n == 1 || n == 2){
            return 1;
        }
        return rec_fib(n-1) + rec_fib(n-2);
    }
}
