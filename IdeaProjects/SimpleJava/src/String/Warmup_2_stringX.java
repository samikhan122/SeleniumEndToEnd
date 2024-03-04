package String;

public class Warmup_2_stringX {
    public static void main(String[] args) {
        Warmup_2_stringX n = new Warmup_2_stringX();
        System.out.println(n.stringX("xxHxix"));

    }

    public String stringX(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i < str.length() - 1 && str.charAt(i) == 'x')) {
              //  temp += str.charAt(i);


            }
        }return temp;
    }
}