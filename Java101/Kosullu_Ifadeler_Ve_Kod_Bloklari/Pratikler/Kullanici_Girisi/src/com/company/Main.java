package com.company;

import java.util.Scanner;

public class Main {
/*
    Ödev
    Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
    eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
    aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, " +
        "lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userName = "Fırat";
        int userPassword = 12345;

        System.out.println("Şifrenizi giriniz: ");
        int password1 = scanner.nextInt();

        if(userPassword != password1){
            System.out.println("Girdiğiniz şifre hatalı, değiştirmek ister misiniz ? 1- Evet - 2- Hayır");
            int secim1 = scanner.nextInt();
            if (secim1 == 1){
                System.out.println("Yeni şifrenizi giriniz: ");
                int password2 = scanner.nextInt();

                if(password2 == userPassword){
                    System.out.println("Yeni şifreniz eski şifrenizle aynı, lütfen farklı şifre giriniz.");
                }
                else{
                    System.out.println("Şifreniz başarıyla değiştirildi.");
                }
            }
            else{
                System.out.println("Şifreniz değiştirilmedi.");
            }
        }
        else{
            System.out.println("Giriş Başarılı");
        }

    }
}
