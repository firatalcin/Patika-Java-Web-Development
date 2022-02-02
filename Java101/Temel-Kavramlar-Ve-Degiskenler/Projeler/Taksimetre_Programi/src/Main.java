import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilen yolu giriniz (KM): ");
        double km = scanner.nextDouble();

        double acılısUcreti = 10.0;
        double total = acılısUcreti + (km * 2.20);

        double sonuc = (total <= 20) ? 20 : total;

        System.out.println("Taksimetre ücreti : " + sonuc);
    }
}
