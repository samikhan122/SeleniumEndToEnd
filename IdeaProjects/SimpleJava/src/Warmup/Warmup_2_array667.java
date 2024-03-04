package Warmup;

public class Warmup_2_array667 {
    public static void main(String[] args) {
        int count = 0;
        int[] num = {6, 6, 2};
        for (int i = 0; i < (num.length - 1); i++) {
            if (num[i] == 6) {
                if (num[i + 1] == 6 || num[i + 1] == 7) {
                    count++;
                }


            }

        }
        System.out.println(count);

    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6) {
                if (nums[i] == 6 || nums[i + 1] == 7) {
                    count++;
                }
            }

        }
        return count;
    }

}
