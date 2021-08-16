package com.prep.binarysearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(searchRange(new int[]{5, 7, 7, 8, 8, 8}, 8)));
  }

//  public static int[] searchRange(int[] nums, int target) {
//
//    int[] output = new int[2];
//    output[0] = -1;
//    output[1] = -1;
//
//
//    int low = 0;
//    int high = nums.length - 1;
//
//    while (low < high) {
//      int mid = low + (high - low) / 2;
//
//      if (nums[mid] == target) {
//        output[0] = mid;
//        output[1] = mid + 1;
//
//        return output;
//      } else if (nums[mid] > target) {
//        high = mid;
//      } else if (nums[mid] < target) {
//        low = mid + 1;
//      }
//
//    }
//
//    return output;
//  }

  // returns leftmost (or rightmost) index at which `target` should be
  // inserted in sorted array `nums` via binary search.
  private static int extremeInsertionIndex(int[] nums, int target, boolean left) {
    int lo = 0;
    int hi = nums.length;

    while (lo < hi) {
      int mid = (lo + hi) / 2;
      if (nums[mid] > target || (left && target == nums[mid])) {
        hi = mid;
      }
      else {
        lo = mid+1;
      }
    }

    return lo;
  }

  public static int[] searchRange(int[] nums, int target) {
    int[] targetRange = {-1, -1};

    int leftIdx = extremeInsertionIndex(nums, target, true);

    // assert that `leftIdx` is within the array bounds and that `target`
    // is actually in `nums`.
    if (leftIdx == nums.length || nums[leftIdx] != target) {
      return targetRange;
    }

    targetRange[0] = leftIdx;
    targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

    return targetRange;
  }
}
