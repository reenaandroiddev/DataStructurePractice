package com.prep.sorting.elementremoval;

import java.util.Arrays;
import java.util.Collections;

public class JElementRemoval {
  public static void main(String[] args) {
    System.out.println(solve(new int[]{1, 2, 3}));
  }

  public static int solve(int[] A) {

    Arrays.sort(A);

    reverse(A);
    int minCostSum = 0;
    for (int i = 0; i < A.length; i++) {
      for (int j = i; j < A.length; j++) {
        minCostSum += A[j];
      }
    }

    return minCostSum;
  }

  public static int[] reverse(int A[]) {

    int temp;
    int len = A.length;
    for (int i = 0; i < A.length / 2; i++) {
      temp = A[i];
      A[i] = A[len - i - 1];
      A[len - i - 1] = temp;
    }

    return A;
  }
}
