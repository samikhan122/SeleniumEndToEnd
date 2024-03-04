package Warmup;

public class Warmup_1_diff21 {
    public static void main(String[] args) {
        Warmup_1_diff21 wf = new Warmup_1_diff21();
        System.out.println(wf.diff21(25));
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21-n;
        } else
            return (n-21) *2;
        }
    }

