public class Main {

    public static void main(String[] args) {

        int a = 10, b = 5;

        //Atama Operatorleri
        a = b;
        a += b;
        a -= b;
        a *= b;
        a /= b;
        a %= b;

        //Aritmetik Operatorler

        int sonuc;
        sonuc = a + b;
        sonuc = a - b;
        sonuc = a * b;
        sonuc = a / b;
        sonuc = a % b;
        sonuc = a++;
        sonuc = b--;

        // Karşılaştırma Operatorleri

        boolean sonuc2;
        sonuc2 = a == b;
        sonuc2 = a != b;
        sonuc2 = a > b;
        sonuc2 = a < b;
        sonuc2 = a >= b;
        sonuc2 = a <= b;

        //Mantıksal Operatorler

        sonuc2 = a == b && a <= b;
        sonuc2 = a == b || a <= b;
        sonuc2 = !(a == b && a <= b);
        



    }
}
