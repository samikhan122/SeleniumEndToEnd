package Warmup2;

public class array667 {
    public static void main(String[] args) {

    }


    public int array(int[] nums) {
        int count = 0;
        for (int i=0; i < nums.length-1; i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;

    }
}
