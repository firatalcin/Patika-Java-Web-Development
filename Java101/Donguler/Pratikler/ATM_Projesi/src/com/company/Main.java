package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int passwordCheck = 1234;
        String userNameCheck = "firatalcin";
        int right = 3;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            String userName = scanner.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            int password = scanner.nextInt();
            int select = 0, balance = 0, price = 0;

            if (userName.equals(userNameCheck)  && password == passwordCheck) {
                System.out.println("Bankamıza Hoşgeldiniz...");
                while (select != 4) {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış yap");
                    System.out.println();
                    System.out.print("Bir seçim yapınız: ");
                    select = scanner.nextInt();

                    switch (select) {
                        case 1:
                            System.out.println("Yatırılacak miktarı giriniz: ");
                            price = scanner.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekilecek miktar: ");
                            price = scanner.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiyeniz yetersizdir");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış yapılıyor...");
                            break;
                        default:
                            System.out.println("Geçersiz Giriş");
                            break;
                    }
                }
            }
            else {
                right--;
                if(right > 0){
                    System.out.println("Girdiğiniz bilgiler yanlış, tekrar deneyiniz. Kalan giriş hakkınız: " + right);
                }
                else{
                    System.out.println("Giriş hakkınız kalmamıştır\nSistemden çıkarılıyorsunuz.");
                }
            }
        }
    }
}
