package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int number = scanner.nextInt();
        design(number,number);
    }

    static boolean design(int n,int m){
        System.out.print(n + " ");
        if(n <= 0){
            while (n != m){
                n+=5;
                System.out.print(n + " ");
            }
            return true;
        }
        if(n > 0){
            n -= 5;
        }
        return design(n,m);
    }


}
