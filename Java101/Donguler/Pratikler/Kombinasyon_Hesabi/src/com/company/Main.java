package com.company;

import java.util.Scanner;

public class Main {
   // C(n,r) = n! / (r! * (n-r)!)
    public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

        System.out.print("Gruptaki adet sayısı: ");
        int n = scanner.nextInt();
        System.out.print("Seçilim sayısı: ");
        int r = scanner.nextInt();
        int comb = 0;

        comb = fact(n) / (fact(r) * fact(n-r));

        System.out.println("Kombinasyon Sonucu: " + comb);
    }

    static int fact(int a){
        int sum =1;
        for(int i = 1; i<=a; i++){
            sum *= i;
        }
        return sum;
    }
}
