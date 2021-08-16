package com.prep.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IntersectionOfTwoArray {

  public static void main(String[] args) {
    int [] result = intersect(new int[]{1,2,2,1},new int[]{2,2});
    for (int i = 0; i < result.length; i++) {
      System.out.println(" "+result[i]);
    }
  }

  public static int[] intersection(int[] nums1, int[] nums2) {

    HashSet<Integer> intersectionSet = new HashSet<>();
    HashSet<Integer> intersectionSet2 = new HashSet<>();

    int lengthOfNums1 = nums1.length;
    int lengthOfNums2 = nums2.length;
    ArrayList<Integer> result = new ArrayList<>();


    for (int i = 0; i < lengthOfNums1; i++) {
      if (!intersectionSet.contains(nums1[i])) {
        intersectionSet.add(nums1[i]);
      }
    }


    for (int i = 0; i < lengthOfNums2; i++) {
      if (intersectionSet.contains(nums2[i])) {
        intersectionSet2.add(nums2[i]);
      }
    }

    for (Integer num: intersectionSet2) {
      result.add(num);
    }

    int[] resultArr = new int[result.size()];

    for (int i = 0; i < result.size(); i++) {
      resultArr[i] = result.get(i);
    }

    return resultArr;
  }

  public static int[] intersect(int[] nums1, int[] nums2) {
    HashMap<Integer,Integer> map = new HashMap<>();
    List<Integer> resultList = new ArrayList<>();

    for(int i=0;i<nums1.length;i++)
    {
      if(!map.containsKey(nums1[i]))
      {
        map.put(nums1[i],1);
      } else{
        int count =  map.get(nums1[i]);
        count = count +1;
        map.put(nums1[i],count);
      }
    }

    for(int i=0;i<nums2.length;i++)
    {
      if(map.containsKey(nums2[i]))
      {
        int count = map.get(nums2[i]);

        if(count>0)
        {
          resultList.add(nums2[i]);
        }
        count = count -1;
        map.put(nums2[i],count);
      }
    }

    int [] result = new int[resultList.size()];
    for(int i=0;i<resultList.size();i++)
    {
      result[i] = resultList.get(i);
    }

    return result;
  }

}
