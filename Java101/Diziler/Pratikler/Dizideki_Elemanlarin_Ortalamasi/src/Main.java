public class Main {
    public static void main(String[] args) {
        //Pratik
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int i = 0; i< numbers.length;i++){
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);

        //Ödev - Harmonik Ortalama

        double sumD = 0;
        for(int j = 1; j<= numbers.length ; j++){
            sumD += 1.0/j;
        }

        System.out.println(sumD);
    }
}