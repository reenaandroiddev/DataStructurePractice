package com.prep.arrays;

import java.util.HashMap;

public class SumOfSubArray {

  public static void main(String[] args) {
    System.out.println(subarraySumOp(new int[]{2,3,4},5));
  }

  // Brute Force with O(n^2)
  public static int subarraySum(int[] nums, int k) {
    int sumOfIndex = 0;
    int total = 0;
    int j;

    for(int i=0;i<nums.length;i++)
    {
      j = i+1;
      total = nums[i];
      if(total == k)
      {
        sumOfIndex++;
      }
      while (j<nums.length)
      {
        total += nums[j];
        if(total==k)
        {
          sumOfIndex++;
        }
        j++;
      }
    }
    return sumOfIndex;
  }

  public static int subarraySumOp(int[] nums, int k) {
    int sumOfIndex = 0;
    int count = 0;

    HashMap<Integer,Integer> map = new HashMap<>();
    map.put(0,1);

    for (int i = 0; i < nums.length; i++) {
      sumOfIndex = sumOfIndex + nums[i];
      if (map.containsKey(sumOfIndex-k))
      {
        count = count + map.get(sumOfIndex-k);
      }
      map.put(sumOfIndex,map.getOrDefault(sumOfIndex,0)+1);

    }


    return count;
  }

}
