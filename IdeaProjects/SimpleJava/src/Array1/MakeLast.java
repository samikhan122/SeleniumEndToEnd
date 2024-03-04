package Array1;

import java.util.Arrays;

public class MakeLast {
    public static void main(String[] args) {
        MakeLast ms = new MakeLast();
        int[] arr = {10,20,30,40,50,60};
        for (int i = 0; i <arr.length; i++) {
          //  System.out.println(Arrays.toString(ms.makeLast(arr[i])));
        }

        }



    public int[] makeLast(int[] nums){
        int len = nums.length *2;
        int[] newArray = new int[len];
        newArray[len-1] = nums[nums.length-1];
        return newArray;
    }
}
/*
*
Given an int array, return a new array with double the length where its last element is the same as the original array,
* and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.


makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
* */