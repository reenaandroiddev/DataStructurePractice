package com.prep.slidingwindow;

import java.util.Arrays;

// Subsets can be place in anywhere need not to be in sequence

public class MaximumDifference {
  public static void main(String[] args) {

    System.out.println(solve(new int[]{93, 51, 84, 81, 89, 82, 28, 78, 86, 35, 64, 38, 49, 99, 83}, 4));
  }

  public static int solve(int[] A, int B) {

    Arrays.sort(A);
    int getTotalSum = getSum(0, A.length, A);

    int maximumDifference = 0;
    for (int i = 0; i < A.length - B + 1; i++) {
      int sum1 = getSum(i, B + i, A);
      int sum2 = getTotalSum - sum1;
      maximumDifference = Math.max(maximumDifference, Math.abs(sum1 - sum2));
    }

    return maximumDifference;

  }

  static int getSum(int start, int end, int[] A) {
    int sum = 0;
    for (int i = start; i < end; i++) {
      sum = sum + A[i];
    }

    return sum;
  }
}
