package Warmup2;

public class last2 {
    public static void main(String[] args) {
        last2 w = new last2();
        System.out.println(w.last2("xxcxxr"));

    }

    public int last2(String str) {
        int count = 0;
        if (str.length() > 2) {


            String sub = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(sub)) {
                    count++;
                }


            }
        }
        return count;
    }
}
