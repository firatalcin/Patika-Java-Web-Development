import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*
        // Dairenin alanını ve cevresini hesaplama

        double pi = 3.14;

        System.out.println("Yarıcap giriniz: ");
        double r = scanner.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println(r +" Yarıçaplı Dairenin Alanı: " + alan);
        System.out.println(r +" Yarıçaplı Dairenin Çevresi: " + cevre);
        */

        //Daire Diliminin Alanı

        System.out.println("Yarıçap giriniz: ");
        double r = scanner.nextDouble();
        System.out.println("alfa açısını giriniz: ");
        double alfa = scanner.nextDouble();

        double pi = 3.14;

        double dilimAlan = (pi * (r*r) * alfa) / 360;

        System.out.println("Dilim alan: " + dilimAlan);
    }
}
