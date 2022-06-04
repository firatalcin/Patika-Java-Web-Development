import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Pratik
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);

        //Ödev - En yakın Max ve Min

        Scanner scanner = new Scanner(System.in);


        int[] list2 = {15,12,788,1,-1,-778,2,0};
        System.out.println("Dizi : " + Arrays.toString(list2));
        System.out.print("Girilen Sayı: ");
        int number = scanner.nextInt();

        int before = list2[0];
        int after = list2[0];
        Arrays.sort(list2);

        for(int i : list2){
            if(number > i){
                before = i;
            }
            if(number < i){
                after = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + before);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + after);
    }
}