package Array1;

public class firstLast6 {
    public static void main(String[] args) {
        firstLast6 f6 = new firstLast6();


    }

    public boolean firstLast6(int[] nums) {
        for(int i =0; i<nums.length;i++){
            if(nums[i]>=1 && nums[0] == 6 || nums[nums.length-1] ==6)
                return true;

            }
            return false;
        }

    }

