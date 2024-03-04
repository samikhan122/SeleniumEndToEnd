package Warmup2;

public class stringBits {
    public static void main(String[] args) {
        stringBits st = new stringBits();
        System.out.println(st.stringBits9("hello"));
    }


    public String stringBits9(String str) {
        String count = "";
        for (int i = 0; i < str.length(); i += 2) {
            count += str.charAt(i);
        }
        return count;
    }
}
