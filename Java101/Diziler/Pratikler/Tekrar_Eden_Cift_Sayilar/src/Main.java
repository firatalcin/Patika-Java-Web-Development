import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5, 6, 6, 6, 7, 7, 6, 8, 9, 10, 10, 12, 12};
        int[] duplicate = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (list[i] % 2 == 0){
                        duplicate[i] = list[i];
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(duplicate));
    }
}