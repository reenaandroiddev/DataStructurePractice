package com.prep.binarysearch;

public class FindBadVersion {
  public static void main(String[] args) {
    System.out.println(findBadVersion(10));
  }

  public static int findBadVersion(int n) {
    int left = 1;
    int right = n;


    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }

  public static boolean isBadVersion(int v) {
    if (v == 4)
      return true;
    return false;
  }

}
