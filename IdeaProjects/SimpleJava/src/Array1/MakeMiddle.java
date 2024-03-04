package Array1;

public class MakeMiddle {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 6};
        //int[] fi = new int[2];

        nums[0] = nums[nums.length / 2 - 1];
        nums[1] = nums[nums.length / 2];
        System.out.println(nums[0]);
        System.out.println(nums[1]);
    }


    public int[] makeMiddle(int[] nums) {

        int[] fi = new int[2];
        int middle = nums.length / 2;
        fi[0] = nums[middle - 1];
        fi[1] = nums[middle];
        return fi;

    }
}
