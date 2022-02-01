import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Hipotenus Bulma
        /*
        System.out.println("Birinci kenarı giriniz: ");
        double a = input.nextDouble();
        System.out.println("İkinci kenarı giriniz: ");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a + b*b);

        System.out.println("Hipotenüs : " + c);
        */

        // Üçgenin çevre ve alanını bulma

        System.out.println("Birinci kenarı giriniz: ");
        double a = input.nextDouble();
        System.out.println("İkinci kenarı giriniz: ");
        double b = input.nextDouble();
        System.out.println("Üçüncü kenarı giriniz: ");
        double c = input.nextDouble();

        double u = (a+b+c) / 2.0;

        System.out.println("Üçgenin Çevresi: " + 2.0*u);

        double alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin Alanı: " + alan);





    }
}
