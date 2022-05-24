package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = scanner.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int power = scanner.nextInt();

        System.out.println(ref(base,power));

    }

    static int ref(int base, int power) {
        if(power == 0){
            return 1;
        }
        return base * ref(base,power - 1);
    }
}
