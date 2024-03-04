package Array1;

public class SwapEnds {
    public static void main(String[] args) {

    }


    public int[] swapEnds(int[] nums) {
        int len = nums.length;
        int temp = nums[nums.length - 1];
        nums[0] = nums[len - 1]; // this is to get the last number and tranfer it to the first place.
        nums[len - 1] = temp;

        return nums;
    }


}
