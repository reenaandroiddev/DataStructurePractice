package com.prep.sorting;

/**
 * Sort the array such that all elements in the ascending or in descending order
 * Time Complexity n^2
 * 1. Start with
 */
public class RandomSortAlgo {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {4,5,2,1,6,7,1,0,10};
        sortArrayUsingInsertionSortAscending(arr);
        sortArrayUsingInsertionSortDescending(arr);
    }

    // Sorting ascending order
    private static void sortArrayUsingInsertionSortAscending(int arr[]) {
        int temp;                                       //1
        for (int i = 0; i < arr.length; i++) {          //n
            for (int j = 0; j < arr.length - 1; j++) {  //n
                if (arr[j] > arr[j + 1]) {              //1
                    temp = arr[j + 1];                  //1
                    arr[j + 1] = arr[j];                //1
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   // Dropping all constants

    // Sorting ascending order
    private static void sortArrayUsingInsertionSortDescending(int arr[]) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
