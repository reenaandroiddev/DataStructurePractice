package com.prep.arrays;

public class ProductOfArrayExceptSelf {

  public static void main(String[] args) {

    int[] resArr = productOfArray(new int[]{1,2,3,4});

    for (int i = 0; i <resArr.length ; i++) {
      System.out.print(resArr[i] + " ");
    }


  }

  public static int[] productOfArray(int [] arr)
  {
    int left;
    int right;
    int rightRes=1;
    int leftRes=1;

    int [] res = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {

      rightRes = 1;
      leftRes = 1;
      for (left = 0; left <i ; left++) {

        leftRes = leftRes * arr[left];
      }

      for (right = i+1; right < arr.length ; right++) {

        rightRes = rightRes * arr[right];
      }

      res[i] = leftRes * rightRes;

    }

    return res;
  }
}
