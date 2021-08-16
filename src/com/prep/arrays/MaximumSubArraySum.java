package com.prep.arrays;


/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [0]
 * Output: 0
 * Example 4:
 * <p>
 * Input: nums = [-1]
 * Output: -1
 * Example 5:
 * <p>
 * Input: nums = [-2147483647]
 * Output: -2147483647
 */

public class MaximumSubArraySum {

  public static void main(String[] args) {

    int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(helper(arr, 0, arr.length-1));


  }

  public static int helper(int arr[], int left, int right) {

    if (left == right) return arr[left];

    int mid = (left + right) / 2;

    int leftSum = helper(arr, left, mid);
    int rightSum = helper(arr, mid + 1, right);
    int crossSum = crossSum(arr, left, right, mid);

    return Math.max(Math.max(leftSum, rightSum), crossSum);
  }

  public static int crossSum(int[] arr, int left, int right, int mid) {
    if (left == right) return arr[left];

    int leftSum = Integer.MIN_VALUE;
    int currSum = 0;

    // Left Sum
    for (int i = mid; i > left-1; i--) {
      currSum = currSum + arr[i];
      leftSum = Math.max(leftSum, currSum);
    }


    // Right sum
    int rightSum = Integer.MIN_VALUE;
    currSum = 0;
    for (int i = mid + 1; i < right +1; i++) {
      currSum = currSum + arr[i];
      rightSum = Math.max(rightSum, currSum);
    }

    return rightSum + leftSum;
  }
}
