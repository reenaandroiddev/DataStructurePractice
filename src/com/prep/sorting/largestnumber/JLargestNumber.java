package com.prep.sorting.largestnumber;

import java.util.Arrays;
import java.util.Comparator;

/*
* Largest Number
Problem Description

Given a array A of non negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.

Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109

Input Format
First argument is an array of integers.

Output Format
Return a string representing the largest number.

Example Input
Input 1:

 A = [3, 30, 34, 5, 9]
Input 2:

 A = [2, 3, 9, 0]

Example Output
Output 1:

 "9534330"
Output 2:

 "9320"

Example Explanation
Explanation 1:

 A = [3, 30, 34, 5, 9]
 Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

 Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
*
* */
public class JLargestNumber {
  public static void main(String[] args) {

    System.out.println(largestNumber(new int[]{3, 30, 34, 5, 9}));

  }

  public static String largestNumber(final int[] A) {

    String[] nums = new String[A.length];

    for (int i = 0; i < A.length; i++) {
      nums[i] = String.valueOf(A[i]);
    }

    Arrays.sort(nums, new NumberComparator());

    if (nums[0].equals("0")) {
      return "0";
    }

    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < nums.length; i++) {
      builder.append(nums[i]);
    }


    return builder.toString();
  }


  static class NumberComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
      String object1 = o1 + o2;
      String object2 = o2 + o1;

      return object2.compareTo(object1);
    }
  }
}
