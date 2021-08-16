package com.prep.sorting;

import java.util.Collections;


public class QuickSort {
    public static void main(String[] args) {
        System.out.println("Sorted Array");
        int arr[] = {-4,-1,0,3,10};
        int squareOfArray[] = getSquareOfArray(arr);

        for (int i = 0; i < squareOfArray.length; i++) {

            System.out.print(squareOfArray[i]+" ");
        }

        quickSort(squareOfArray,0,squareOfArray.length-1);



        System.out.println();
        for (int i = 0; i < squareOfArray.length; i++) {

            System.out.print(squareOfArray[i]+" ");
        }
    }

    public static int[] getSquareOfArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int square = arr[i] * arr[i];
            arr[i] = square;
        }
        return arr;
    }

    // What is complexity of it, and lets cross check the if the implemetation is correct or not;
    public static int[] sortArrayUsingQuickSort(int[] arr) {
        int pivot = 0;
        int temp = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[pivot] > arr[i]) {
                temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
            }
        }
        return arr;
    }

    public static void quickSort(int[] arr, int left, int right)
    {
        int index = partition(arr, left, right);
        if (left<index-1) // sort left half
        {
            quickSort(arr, left, index-1);
        }

        if (index>right) // sort right half
        {
            quickSort(arr, index, right);

        }
    }

    public static  int partition(int[] arr,int left,int right)
    {
        int pivot = arr[(left+right)/2]; // pick pivot point
        while (left<=right)
        {
            //find element on the left that should be on right
            while (arr[left]<pivot) left++;
            //find element on the right that should be on left
            while (arr[right]>pivot) right--;

            //swap elements, and move left and right indices
            if(left<=right)
            {
                swap(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    public static void swap(int[] arr, int left, int right)
    {
        if (left==right)
            return;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

}
