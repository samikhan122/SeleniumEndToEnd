package Warmup;

public class Warmup_1_sleepIn {
    public static void main(String[] args) {



    }

    public boolean sleepin(boolean weekday, boolean vacation) {
        if (!weekday && !vacation) {
            return true;
        } else if (weekday = true && !vacation) {
            return false;
        } else if (!weekday && !vacation) {
            return false;

        }
        return true;
    }
}
