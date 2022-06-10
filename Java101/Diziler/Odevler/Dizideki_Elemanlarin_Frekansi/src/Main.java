import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] list = {10,20,20,10,10,20,5,20};
        int[] list2 = new int[list.length];
        int count = 0, temp = 0;
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");
        for (int i = 0; i< list.length; i++){
            for(int j = 0; j < list.length; j++){

                if(list[i] == list[j] && list[i] > 0){
                    count++;
                }
            }
            if(list[i] > 0){
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi");
            }
            temp = list[i];
            for(int k = 0; k < list.length; k++){
                if(temp == list[k]){
                    list[k] = -1;
                }
            }
            count = 0;
        }
    }
}