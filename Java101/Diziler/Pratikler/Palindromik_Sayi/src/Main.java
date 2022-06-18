public class Main {
    public static void main(String[] args) {

        String str = "abaa";
        String reverse = "";
        int strLength = str.length() - 1;
        for (int i = strLength; i >= 0; i--){
            reverse += str.charAt(i);
        }

        if(str.equals(reverse)){
            System.out.println(str + " kelimesi palindromik kelimedir");
        }
        else {
            System.out.println("Palindromik kelime değildir");
        }

    }
}