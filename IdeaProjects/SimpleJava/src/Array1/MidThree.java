package Array1;

public class MidThree {
    public static void main(String[] args) {
        int middle;
        int[] nums = {1,2,3,4};
        for(int i =0; i<nums.length;i++){
            if (nums.length == 3) {
                 middle = nums.length / 2;
        }


        }


}

    public int[] midThree(int[] nums) {
        int middle = nums.length / 2;

        if (nums.length == 3) {
        return nums;

        }
        return new int[]{nums[middle - 1], nums[middle], nums[middle + 1]};
    }


}
