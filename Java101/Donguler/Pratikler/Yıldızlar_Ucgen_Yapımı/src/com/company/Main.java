package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır sayısı giriniz: ");
        int line = scanner.nextInt();
        int space = line, star = 1;

        for (int i = 1; i <= line; i++) {
            for (int j = space; j > 1; j--) {
                System.out.print(" ");
            }
            space--;
            for (int k = 1; k <= star; k++) {
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }

        star -= 3;
        space = 1;

        for (int i = 1; i < line; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            space++;
            for (int k = star; k > 1; k--) {
                System.out.print("*");
            }
            star -= 2;
            System.out.println();
        }
    }
}
