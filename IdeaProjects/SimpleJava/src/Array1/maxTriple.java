package Array1;

public class maxTriple {
    public static void main(String[] args) {

    }


    public int[] MAXTRIPPLE(int[] nums) {
        int len = nums.length;
        int midIndex = len / 2;

        if (nums[0] > nums[midIndex] && nums[0] > nums[len - 1]) {
            return new int[]{nums[0]};
        }
        if (nums[midIndex] > nums[0] && nums[midIndex] > nums[len - 1]) {
            return new int[]{nums[midIndex]};
        }
        return new int[]{nums[len - 1]};
    }
}
