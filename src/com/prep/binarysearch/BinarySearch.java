package com.prep.binarysearch;

public class BinarySearch {
    // Binary Search Basically works on sorted array takes the middle and compare it with start/ end position

    public static void main(String [] args)
    {
        int arr [] = {2,4,7,9,10,22,40,50};
        BinarySearch search = new BinarySearch();
        int start = 0;
        int end = arr.length-1;
        System.out.println(search.searchNumber(4,arr,start,end));
    }

    private int searchNumber(int key, int[] arry, int start, int end) {
        int middle = (start + end) / 2;

        if (key > arry[arry.length - 1] || key < arry[0]) {
            System.out.println("Key Not Found");
            return 0;
        } else if (arry[middle] == key) {
            System.out.println("Key Found at position"+middle);
            return arry[middle];
        } else if (arry[middle] < key) {
            start = middle;
        } else if (arry[middle] > key) {
            end = middle;
        }

        return searchNumber(key, arry, start, end);
    }


}
