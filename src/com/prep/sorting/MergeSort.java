package com.prep.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {

        int[] arr = {23,50,10,30,90,20};
//        mergeSort(arr,0,arr.length);

        MergeSort mergeSort = new MergeSort();
        mergeSort.sortArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" "+ arr[i]);
        }
    }

    public int[] sortArray(int[] nums) {


        return mergeSort(nums,0,nums.length);
    }


    public int[] mergeSort(int[] nums, int left, int right) {


        if (left < right) {
            int pivot = (left + right) / 2;

            int[] left_list = mergeSort(nums, left, pivot);
            int[] right_list = mergeSort(nums, pivot + 1, right);

            return merge(left_list, right_list);

        }

        return nums;
    }

    public int [] merge(int [] left_list, int [] right_list)
    {
        int [] result = new int[left_list.length + right_list.length];

        int left_cursor = 0;
        int right_cursor = 0;
        int result_cursor = 0;

        int leftListLength = left_list.length ;
        int rightListLength = right_list.length;

        while(left_cursor<leftListLength && right_cursor<rightListLength)
        {
            if(left_list[left_cursor]<right_list[right_cursor])
            {
                result[result_cursor] = left_list[left_cursor];
                result_cursor++;
                left_cursor++;
            } else{
                result[result_cursor] = left_list[result_cursor];
                result_cursor++;
                right_cursor++;
            }
        }

        // Add left over to result
        while(left_cursor<leftListLength)
        {

            result[result_cursor] = left_list[left_cursor];
            result_cursor++;
            left_cursor++;
        }



        while(right_cursor<rightListLength)

        {
            result[result_cursor] = right_list[result_cursor];
            result_cursor++;
            right_cursor++;
        }


        return result;
    }



    /// code to check
    public int [] merge_sort(int [] input) {
        if (input.length <= 1) {
            return input;
        }
        int pivot = input.length / 2;
        int [] left_list = merge_sort(Arrays.copyOfRange(input, 0, pivot));
        int [] right_list = merge_sort(Arrays.copyOfRange(input, pivot, input.length));
        return merge(left_list, right_list);
    }

    public int [] mergeRef(int [] left_list, int [] right_list) {
        int [] ret = new int[left_list.length + right_list.length];
        int left_cursor = 0, right_cursor = 0, ret_cursor = 0;

        while (left_cursor < left_list.length &&
            right_cursor < right_list.length) {
            if (left_list[left_cursor] < right_list[right_cursor]) {
                ret[ret_cursor++] = left_list[left_cursor++];
            } else {
                ret[ret_cursor++] = right_list[right_cursor++];
            }
        }
        // append what is remain the above lists
        while (left_cursor < left_list.length) {
            ret[ret_cursor++] = left_list[left_cursor++];
        }
        while (right_cursor < right_list.length) {
            ret[ret_cursor++] = right_list[right_cursor++];
        }
        return ret;
    }
}
