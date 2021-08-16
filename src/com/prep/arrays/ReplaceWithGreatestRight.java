package com.prep.arrays;

/**
 * Replace Elements with Greatest Element on Right Side
 * Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 *
 * Example
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 *
 */
public class ReplaceWithGreatestRight {

    public static void main(String[] args) {

        for (int num:replaceElements(new int[]{17,18,5,4,6,1})) {
            System.out.print(" "+num);

        }
    }
    private static int[] replaceElements(int [] arr)
    {
        int size = arr.length;
        if (size<=0)
        {
            return null;
        }
        // To Keep the track of maximum element
        int max_right_value = arr[size-1];

        arr[size-1] = -1;

        for (int i=size-2;i>=0;i--)
        {
            int temp = arr[i];
            // We will assume the rightmost is maximum of the current value // will assign that max to current value
            arr[i] = max_right_value;

            if (max_right_value<temp)  // If max is less than current then will change the max else will keep the max value same
            {
                max_right_value = temp;
            }
        }
        return arr;
    }
}
