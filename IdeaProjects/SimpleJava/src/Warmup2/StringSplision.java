package Warmup2;

public class StringSplision {
    public static void main(String[] args) {
    StringSplision s = new StringSplision();
        System.out.println(s.stringSplosion("code"));
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);

        }
        return result;
    }
}
