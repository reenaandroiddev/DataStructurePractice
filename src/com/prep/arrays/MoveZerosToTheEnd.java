package com.prep.arrays;

public class MoveZerosToTheEnd {

    public static void main(String[] args) {

                int [] arr = moveZerosToEnd(new int[]{0,1});
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
    }

    private static int[] moveZerosToEnd(int nums[])
    {



        int j=0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {

                if (nums[i] != 0) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                    j++;
            }
        }
        return nums;
    }
}
