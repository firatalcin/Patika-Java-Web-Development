import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.println("Boyunuzu giriniz: ");
        double boy = scanner.nextDouble();

        double index = kilo / (boy * boy);

        System.out.println("Vüvut kitle indeksiniz: " + index);

    }
}
