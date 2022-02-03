import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
         * eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile
         * aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı,
         * lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
         *
         */

        String userName, password;
        int select;


        Scanner inp = new Scanner(System.in);

        System.out.print("Your Username : ");
        userName = inp.nextLine();

        System.out.print("Your password : ");
        password = inp.nextLine();

        if (userName.equals("Gaxtan") && password.equals("1234")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Your informations are wrong. Do you want to reset your password ?  ");
            System.out.println("If you want to reset password please press '1'");
            System.out.println("If you don't want to reset password please press '2'");
            System.out.print("Your choose : ");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Please create new password");
                    System.out.print("Your new password : ");
                    password = inp.nextLine();

                    if (password.equals("1234")) {
                        System.out.println("Your new password can't be same ! ");
                    } else {
                        System.out.println("Your password created ! ");
                    }
                    break;
                case 2:
                    System.out.println("Please try again !");
                    break;
            }
        }
    }
}
