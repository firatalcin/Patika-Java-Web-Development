import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int a = scanner.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        int b = scanner.nextInt();

        System.out.println("******************************************");
        System.out.println("1.Toplama\n2.Çıkarma\n3.Çarpma\n4.Bölme");
        System.out.println("Lütfen bir işlem giriniz: ");
        int secim = scanner.nextInt();
        System.out.println("******************************************");

        switch (secim){
            case 1:
                System.out.println(a + " + " + b  + " = " + (a+b));
                break;
            case 2:
                System.out.println(a + " - " + b  + " = " + (a-b));
                break;
            case 3:
                System.out.println(a + " * " + b  + " = " + (a*b));
                break;
            case 4:
                System.out.println(a + " / " + b  + " = " + (a/b));
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız.");
                break;
        }


    }
}
