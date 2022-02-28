import java.util.Scanner;

public class Main {
    /*
    Dik Üçgende Hipotenüs Bulan Program
    Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

    Ödev
    Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

    Formül
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

    𝑢 = (a+b+c) / 2

    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
    */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("A dik kenarını giriniz: ");
        int a_kenari = scanner.nextInt();
        System.out.println("B dik kenarını giriniz: ");
        int b_kenari = scanner.nextInt();
        System.out.println("C dik kenarını giriniz: ");
        int c_kenari = scanner.nextInt();

        double hipotenus = Math.sqrt((a_kenari * a_kenari) + (b_kenari * b_kenari));
        System.out.println("Hipotenüs: " + hipotenus);

        //Ödev - Üçgenin çevresi ve alanı

        double u = (a_kenari + b_kenari + c_kenari) / 2.0;
        double cevre = 2.0 * u;
        double alan = Math.sqrt(u * (u - a_kenari) * (u - b_kenari) * (u - c_kenari));

        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);


    }
}
