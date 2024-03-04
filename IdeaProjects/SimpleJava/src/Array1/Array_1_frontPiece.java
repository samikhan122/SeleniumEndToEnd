package Array1;

public class Array_1_frontPiece {
    public static void main(String[] args) {

    }



    public int[] frontPiece(int[] nums) {
      int len = nums.length;
      if(len<=2){
          return nums;
      }
        int c[] = new int[2];
        c[0] = nums[0];
        c[1] = nums[1];

        return c;
    }
}
