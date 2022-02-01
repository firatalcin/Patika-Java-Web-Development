import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Tutarı giriniz: ");
        double para = input.nextDouble();

        double kdv_tutari = 0;
        kdv_tutari = (para >= 0 && para <= 1000) ? 0.18 : (para > 1000) ? 0.08 : 0;

        System.out.println("KDV'siz Fiyat: " + para);
        System.out.println("KDV'li Fiyat: "+ (para + (para * kdv_tutari)));
        System.out.println("KDV Tutarı: " + para*kdv_tutari);
    }
}
