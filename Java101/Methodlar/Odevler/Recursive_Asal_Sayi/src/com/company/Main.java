package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();
        if(isPrime(number,2)){
            System.out.println(number + " sayısı ASAL sayıdır.");
        }
        else{
            System.out.println(number + " sayısı ASAL sayı değildir");
        }
    }

    static boolean isPrime(int n,int m) {
        if(n <= 2){
            return (n == 2) ? true : false;
        }
        if(m == n){
            return true;
        }
        if(n % m == 0){
            return false;
        }


        return isPrime(n,m+1);
    }
}
