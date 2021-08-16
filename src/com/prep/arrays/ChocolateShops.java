package com.prep.arrays;

public class ChocolateShops {

  public static void main(String[] args) {
    System.out.println(solve(8, new int[]{2, 2, 1, 3, 4, 1}));
  }

  public static int solve(int A, int[] B) {

    int allSum = 0;

    for (int i = 0; i < B.length; i++) {
      int currSum = B[i];

      int j = i + 1;
      while (j < B.length && B[j] >= B[j - 1]) {
        currSum = currSum + B[j];
        j++;
      }
      allSum = Math.max(currSum, allSum);
    }


    return allSum;
  }
}
