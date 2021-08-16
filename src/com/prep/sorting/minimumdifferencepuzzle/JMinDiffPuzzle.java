package com.prep.sorting.minimumdifferencepuzzle;

import java.util.Arrays;

public class JMinDiffPuzzle {

  public static void main(String[] args) {

    System.out.println(solve(new int[]{759, 106, 827, 279, 722, 954, 80, 577, 273, 538, 963, 296, 693, 694, 684, 406, 603, 192, 166, 233, 310, 969, 980, 36, 322, 409, 392, 824, 422, 729, 76, 532, 186, 902, 811, 907, 855}, 16));
  }

  public static int solve(int[] A, int B) {

    int length = A.length;

    Arrays.sort(A);
    int minValue = A[length - 1] - A[0];

    for (int i = 0; i < length - B + 1; i++) {
      minValue = Math.min(minValue(A, i, i + B), minValue);
    }

    return minValue;
  }

  public static int minValue(int[] A, int start, int end) {

    return A[end-1] - A[start];
  }
}
