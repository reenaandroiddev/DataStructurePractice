package com.prep.sorting;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargestElement {

  public static void main(String[] args) {
    int [] nums = {3,2,1,5,6,4};

    System.out.println(findKthLargest(nums,2));
  }

  public static int findKthLargest(int[] nums, int k) {
    // This program is based on sorting either using sort element first and then return second last element
    int numx = 0;

    // First add all elements to the priority queue

    // Get second last element
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2-o1;
      }
    });

    for (Integer num:nums) {
      priorityQueue.add(num);
    }


    for (int i = 0; i < k; i++) {
      numx = priorityQueue.poll();
    }



    // and return that element

    return numx;
  }

}
