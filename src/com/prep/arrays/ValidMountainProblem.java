package com.prep.arrays;

/**
 * Given an array A of integers, return true if and only if it is a valid mountain array.
 *
 * Recall that A is a mountain array if and only if:
 *
 * A.length >= 3
 * There exists some i with 0 < i < A.length - 1 such that:
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[A.length - 1]
 */
public class ValidMountainProblem {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(isValidMountain(arr));

    }

    private static boolean isValidMountain(int arr[]) {

        int i = 0;
        int length = arr.length;

        if(length<3)
            return false;

        while (i+1<length && arr[i] < arr[i + 1])
            i++;

        if (i == 0 || i == length - 1)
            return false;

        while (i+1<length  && arr[i] > arr[i+1])
            i++;

        return i == length-1;
    }

}
