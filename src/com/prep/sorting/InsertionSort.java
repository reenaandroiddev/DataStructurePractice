package com.prep.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class InsertionSort {
    public static void main(String args[]) {                  //j  i
        int[] arr = {20, 10, 3, 0, 79, 40};
        int[] arr2 = {20, 10, 11, 1, 90, 40};

        // Sorting String List using Comparator
        String stringArr[] = {"acv","ada","ssf","sff"};
        List<String> stringList = Arrays.asList(stringArr);
        stringList.sort(new SortingString());
        System.out.println(stringList);


        Integer mayArr[] = {2, 3, 1};
        List<Integer> list = Arrays.asList(mayArr);
        list.sort(new Sorting());
        System.out.println(list);


        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sortArrayUsingInsertionSort(arr);
        insertionSort.sortInsertionSortUsingTwoLoops(arr2);
    }

    static class  SortingString implements Comparator<String>
    {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareTo(o2);
        }
    }
    static class Sorting implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }

    // while loop from introduction to Algorithm book
    private void sortArrayUsingInsertionSort(int[] arr)     // Time complexity of while loop is also o(n) so here is complexity is o(n^2)
    {
        int key;
        int i;
        for (int j = 1; j < arr.length; j++) // Iterate through array          o(n)
        {
            key = arr[j];               // assign second element of array to key
            i = j - 1;                    // i will be start from first element for array
            while (i >= 0 && arr[i] > key)   // check whether i is greater than 0 and previous element of array is greater than key.
            {
                arr[i + 1] = arr[i];      //  i + 1 position of array will be replaced with i
                i = i - 1;            // Decrement i by one position to iterate on left side of array and sort them
                arr[i + 1] = key;
            }
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private void sortInsertionSortUsingTwoLoops(int[] arr) {
        int temp;
        int i;
        for (i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}
