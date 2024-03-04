package Warmup2;

public class arrayFront9 {
    public static void main(String[] args) {
        arrayFront9 a = new arrayFront9();
        int[] num1 = {1, 2, 3, 4, 5};
        System.out.println(a.arrayFront19(num1));
    }


    public boolean arrayFront19(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i <= 3 && nums[i] == 9)
                return true;


        }


        return false;
    }
}
