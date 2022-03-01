package com.company;

import java.util.Scanner;

public class Main {
/*
    Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
    Ödev
    Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını giriniz: ");
        int hava = scanner.nextInt();

        if(hava < 5){
            System.out.println("Kayak yapabilirsiniz.");
        }
        else if(hava >= 5 && hava < 15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }
        else if(hava >= 15 && hava < 25){
            System.out.println("Piknik yapabilirsiniz.");
        }
        else{
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
