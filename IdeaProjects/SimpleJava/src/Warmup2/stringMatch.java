package Warmup2;

public class stringMatch {
    public static void main(String[] args) {
        stringMatch st = new stringMatch();
        String a = "welcome";
        String c = "welcome";

        String b = " to Automation";

        System.out.println(st.stringWillMatch(a, b));
    }


    public int stringWillMatch(String a, String b) {
        int count = 0;
        for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {
            if (a.substring(i,i+2).equals(b.substring(i,i+2))) {
                count++;
            }

        }
        return count;

    }
}
