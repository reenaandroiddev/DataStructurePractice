package com.prep.arrays;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example 1:

Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

It doesn't matter what you leave beyond the returned length.
Example 2:

Given nums = [0,1,2,2,3,0,4,2], val = 2,

Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.

Note that the order of those five elements can be arbitrary.

It doesn't matter what values are set beyond the returned length.
*
*/
public class RemoveElementsFromArray {
    public static void main(String[] args) {
        System.out.println(optimalSolutionTwoPointers(new int[]{3,46,2,5,66,89}, 2));
    }



    // Brute Force Solution with Complexity o(n*n)
    public static int removeGivenElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int temp;
        int length = arr.length;
        System.out.println("Lenght:" + length);

        int index = length - 1;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            }
        }

        System.out.println("Count :" + count + " of value" + value);

        int diff = 0;
        if (count == arr.length)
            return 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                while (arr[index] == value) {
                    index--;
                    length--;
                }
                diff = arr.length -index;
                if (diff <= count) {
                    temp = arr[index];
                    arr[index] = arr[i];
                    arr[i] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        return length;
    }

    /*
    Algorithm

    When nums[j]nums[j] equals to the given value, skip this element by incrementing jj. As long as nums[j] \neq valnums[j]

=val, we copy nums[j]nums[j] to nums[i]nums[i] and increment both indexes at the same time. Repeat the process until jj reaches the end of the array and the new length is ii.


     */
    private static int  optimalSolution1(int arr[], int value)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        int length=0;

        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]!=value)
            {
                arr[length] = arr[i];
                length++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        return length;
    }

    private static int optimalSolutionTwoPointers(int [] arr, int value)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int i = 0;
    int length = arr.length;

    while (i<length)
    {
        if (arr[i] == value)
        {
            arr[i] = arr[length-1];
            length--;
        }
        i++;
    }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return length;
    }

}
