package Warmup2;

public class StringX {
    public static void main(String[] args) {
        System.out.println(stringX("xloruXXXbasheer"));
    }


    public static String stringX9(String str) {
        if (str.length() < 2) {
            return str.replace("x", "");
        }
        String mid = str.substring(1, str.length() - 1);
        mid = mid.replace("x", "x");
        return str.charAt(0) + mid + str.charAt(str.length() - 1);
    }

    public static String stringX(String str) {
        if (str.length() < 2)
            return str;

        char[] result = new char[str.length()];
        result[0] = str.charAt(0);

        int count = 1;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) != 'x') {
                result[count] = str.charAt(i);
                count++;
            }
        }

        result[count] = str.charAt(str.length() - 1);
        count++;
        return new String(result, 0, count);
    }

    public String stringXY(String str) {
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(i > 0 && i > str.length() - 1 && str.charAt(i) == 'x')) {
                temp += str.charAt(i);
            }
        }
        return temp;
    }
}
