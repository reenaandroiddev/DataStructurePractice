package com.prep.arrays;

import java.util.Arrays;

/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:

The number of elements initialized in nums1 and nums2 are m and n respectively.
You may assume that nums1 has enough space (size that is equal to m + n) to hold additional elements from nums2.
Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]


Constraints:

-10^9 <= nums1[i], nums2[i] <= 10^9
nums1.length == m + n
nums2.length == n
* */

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,0,0,0};
        int arr2[] = {2,5,6};
        int m= 3;
        int n = 3;

            merge(arr1,m,arr2,n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 and nums2
        // m is lenght of nums1 and n is lenght of nums2

        int[] nums3 = new int[nums1.length]; // Array to hold merged sorted element from two in one

        // nums1 = [1,2,3,0,0,0], m = 3
        // nums2 = [2,5,6],       n = 3
        // we are making use of third array as temporary arry

        // Swaping in case the one  element is grater or less than other
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                nums3[k] = nums1[i];
                k++;
                i++;
            } else {
                nums3[k] = nums2[j];
                k++;
                j++;
            }
        }

        for (; i < m; i++) {
            nums3[k] = nums1[i];
            k++;
        }

        for (; j < n; j++) {
            nums3[k] = nums2[j];
            k++;
        }

        for (int l = 0; l < nums3.length; l++) {
            nums1[l] = nums3[l];
        }

        for (int l = 0; l < nums1.length; l++) {
            System.out.println(nums1[l]);
        }
    }
}
