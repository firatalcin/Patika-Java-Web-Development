import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int range = scanner.nextInt();
        int[] list = new int[range];
        System.out.println("Dizinin elemanlarını giriniz : ");
        for(int i = 0; i<list.length; i++){
            System.out.print((i+1) + ". Elemanı : ");
            list[i] = scanner.nextInt();
        }
        int temp = 0;
        for (int j = 0; j < list.length; j++){
            for(int k = 0; k < list.length; k++){
                if(j == k){
                    continue;
                }
                if(list[j] < list[k]){
                    temp = list[j];
                    list[j] = list[k];
                    list[k] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(list));

    }
}