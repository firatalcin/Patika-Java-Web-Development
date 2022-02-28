public class Main {

    public static void main(String[] args) {
        int i = 10;
        
        if(i==10){
            System.out.println("i nin degeri 10'dur.");
        }
        else if(i<10){
            System.out.println("i nin degeri 10'dan kücüktür.");
        }
        else{
            System.out.println("i nin degeri 10'dan farklıdır ve 10'dan kücük degildir.");
        }

        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);

        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)){
            System.out.println(a);
        }else{
            System.out.print(a);
        }
        System.out.println(b);
    }
}
