public class Main {

    public static void main(String[] args) {

        int x = 5;

        if(x > 10 && x<25) System.out.println(x);
        if(x > 10 || x<25) System.out.println(x);
        if(!(x > 10 && x<25)) System.out.println(x);

        String sonuc = x == 5 ? "x beştir." : "x başka sayıdır";

        System.out.println( x > 10 ? "Geçti" : "Kaldı");
    }
}
