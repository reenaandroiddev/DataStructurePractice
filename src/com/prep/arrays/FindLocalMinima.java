package com.prep.arrays;

/**
 * This is not optimal solution
 * this is brute force
 */
public class FindLocalMinima {
  public static void main(String[] args) {

    System.out.println(localMinimaIndex(new int[]{9, 6, 3, 14, 5, 7, 4}));

  }

  public static int localMinimaIndex(int[] arr) {
    int index = 0;
    for (int i = 1; i < arr.length - 1; i++) {
      if (arr[i] < arr[i - 1] && arr[i] < arr[i + 1]) {
        return i;
      }
    }

    return index;

  }
}
