import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen 0-100 arasında tahmininizi giriniz: ");
            selected = scanner.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                continue;
            }
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin, Tahmin ettiğiniz sayı: " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Tahmininiz yanlış!");
                if (selected > number) {
                    System.out.println("Değerin üstünde tahmin");
                } else {
                    System.out.println("Değerin altında tahmin");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hak: " + (5 - right));
            }
        }

        if (isWin == false) {
            System.out.println("Kaybettiniz!");
        }
    }
}