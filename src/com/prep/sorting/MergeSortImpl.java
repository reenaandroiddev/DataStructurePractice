package com.prep.sorting;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MergeSortImpl {

  // Get the middle of array
  // Logically devide array till single array element
  // Merge them back and compare while merging

  // Challenge was how to divide and pass to the next iteration without copy of array method
  public static void main(String[] args) {
    MergeSortImpl mergeSort = new MergeSortImpl();
    int[] arr = {2, 0, 3, 7, 900, 99};
    mergeSort.mergeSort(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(" "+arr[i]);
    }
  }

  public static void mergeSort(int[] arr)
  {
    int[] helper = new int[arr.length];
    //here why ] length - 1
    mergeSort(arr,helper,0,arr.length-1);
  }

  public static void mergeSort(int[] arr, int[] helper, int low, int high) {
    if (low < high) {
      int middle = (low + high) / 2;
      //Sort Left
      mergeSort(arr, helper, low, middle);
      //sort right
      mergeSort(arr, helper, middle + 1, high);
      // Merge them
      merge(arr,helper,low,middle,high);
    }
  }

  public  static  void merge(int[] arr, int[] helper, int low, int middle, int high) {
    //copy both halves into helper array
    for (int i = low; i <= high; i++) {
      helper[i] = arr[i];
    }

    int helperLeft = low;
    int helperRight = middle + 1;
    int current = low;

    /*
      Iterate through helper array. compare the left and right half,
      copying back the smaller element from the two halves into the
      original array
     */

    while (helperLeft<= middle && helperRight <= high)
    {
      if (helper[helperLeft] <=helper[helperRight])
      {
        arr[current] = helper[helperLeft];
        current++;
        helperLeft++;
      } else {
        arr[current] = helper[helperRight];
        current++;
        helperRight++;
      }
    }

    /*
    * Copy the rest of the elements to the end of the array into the target array
    * */

    int remaining = middle - helperLeft;
    for (int i = 0; i <= remaining; i++) {
      arr[current+i] = helper[helperLeft+i];
    }



  }

}
