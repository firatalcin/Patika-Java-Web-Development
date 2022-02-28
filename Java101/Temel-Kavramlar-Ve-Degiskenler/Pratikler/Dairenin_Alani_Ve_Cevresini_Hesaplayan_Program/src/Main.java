import java.util.Scanner;

public class Main {
/*
    Dairenin Alanını ve Çevresini Hesaplayan Program

    Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

    Alan Formülü : π * r * r;

    Çevre Formülü : 2 * π * r;

    Ödev
    Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

    𝜋 sayısını = 3.14 alınız.

    Formül : (𝜋 * (r*r) * 𝛼) / 360
*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yarıçap giriniz: ");
        double r = scanner.nextDouble();
        System.out.println("Merkez açısı ölçüsü giriniz: ");
        double alfa = scanner.nextDouble();

        double alan = 3.14 * r * r;
        double cevre = 2 * 3.14 * r;
        double daire_dilimi = (3.14 * (r * r) * alfa) / 360.0;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin dilim alanı: " + daire_dilimi);




    }
}
