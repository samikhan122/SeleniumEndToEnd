package Warmup2;

public class array123 {
    public static void main(String[] args) {
        array123 a = new array123();
        int[] number = {1, 3, 4, 9};
        System.out.println(a.array1(number));

    }


    public boolean array1(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 3] == 3)
                return true;

        }
        return false;
    }
}
