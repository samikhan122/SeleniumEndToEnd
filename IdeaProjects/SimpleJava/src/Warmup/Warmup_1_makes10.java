package Warmup;

public class Warmup_1_makes10 {
    public static void main(String[] args) {

    }

    public boolean makes10(int a, int b) {
        if (a == 10) {
            return true;
        } else if (b == 10) {
            return true;
        } else if (a + b == 10) {
            return true;
        }
        return false;
    }


}

