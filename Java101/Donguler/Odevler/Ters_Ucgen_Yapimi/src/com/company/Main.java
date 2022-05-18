package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Üçgeniniz kaç basamaklı olsun = ");
        int line = scanner.nextInt(),space = 1;
        int star = line;

        for(int i=1; i<=line; i++){
            for (int j = 1; j<space; j++){
                System.out.print(" ");
            }
            for(int k =((star * 2) - 1) ; k >= 1; k--){
                System.out.print("*");
            }
            space++;
            star--;
            System.out.println();
        }
    }
}
