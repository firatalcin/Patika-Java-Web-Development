package com.company;

import java.util.Scanner;

public class Main {
/*
    Java ile faktöriyel hesaplayan program yazıyoruz.

    Ödev
    N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
    n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    Kombinasyon formülü
    C(n,r) = n! / (r! * (n-r)!)
*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pratik

        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int fac = 1;
        for (int i = 1; i<=sayi; i++){
            fac *= i;
        }

        System.out.println("Faktoriyel: " + fac);

        //Ödev
        System.out.print("n giriniz: ");
        int n = scanner.nextInt();
        System.out.print("r giriniz: ");
        int r = scanner.nextInt();

        int fark = n-r;

        int n_fac = 1;
        for (int i = 1; i<=n; i++){
            n_fac *= i;
        }

        int r_fac = 1;
        for (int i = 1; i<=r; i++){
            r_fac *= i;
        }

        int fark_fac = 1;
        for (int i = 1; i<=fark; i++){
            fark_fac *= i;
        }

        //C(n,r) = n! / (r! * (n-r)!)
        System.out.println("Kombinasyon: " + (n_fac / (r_fac * (fark_fac))) );
    }
}
