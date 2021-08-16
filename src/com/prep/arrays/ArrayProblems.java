package com.prep.arrays;

public class ArrayProblems {
    public static void main(String[] args) {
        //calculateSquareOfNumbers();
        int[] binaryArray = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1};
        //getConsicutiveOnes(binaryArray);
        //System.out.println("hoping for the best" + getCorrectConsicutiveOnes(binaryArray));

//        insertElementInTheArray(9);
        int[] duplicateArr = {0,0,0,0,0,0,0};
      //  duplicateZerosInArray(duplicateArr);

        sum();
        int ans = fun(100,2000);
        System.out.println(ans);
        printTrib(6);


    }

    public static void calculateSquareOfNumbers() {
        // Here init array with size 10
        int[] squareArray = new int[10];
        int squareOfNumber = 0;
        for (int i = 0; i < squareArray.length; i++) {
            squareOfNumber = (i + 1) * (i + 1);
            squareArray[i] = squareOfNumber;
            System.out.println((i + 1) + " " + squareOfNumber);
        }
    }

    // Problems with this approach is
    // 1. Counter is not pertaining when we found another consecutive sequnce
    // 2. It should keep track of older seuence too
    // 3. Incorrect way of finding consicutive 1's - Whats wrong with it you know
    public static void getConsicutiveOnes(int[] arr) {
        int pointerVar;
        int i;
        int counter = 0;
        int oldCounter = 0;

        for (i = 0; i < arr.length; i++) {
            pointerVar = 0;
            while (pointerVar < arr.length) {
                if (arr[i] == 1 && arr[i] == arr[pointerVar]) {
                    counter++;
                } else {
                    counter = 0;
                }
                pointerVar++;
            }

        }
        System.out.println("Counter Value :Old counter" + counter);

    }

    /*
    Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
     */

    public static int getCorrectConsicutiveOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                }
                count = 0;
            }
        }
        return maxCount > count ? maxCount : count;
    }

    public static void insertElementInTheArray(int position) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }


        // if i want to insert element at 2 the i need to shift rest of the elements till lenght of the array.




        //[1,2,4,5,6,8,0,0]
       for (int i = 5; i>=position ; i--)
       {
            arr[i+1] = arr[i];
       }
       arr[position] = 10;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+" "+arr[i]);
        }

    }

    //[1,0,2,3,0,4,5,0]
    public static void duplicateZerosInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 2; j > i; j--) {
                    arr[j + 1] = arr[j];
                }
                if (i < arr.length - 1) {
                    arr[i + 1] = 0;
                    i++;
                }
            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
    }


    public static void sum()
    {
        int i = 0;
        int sum = 0;
        while (i<100)
        {
            sum = sum +i;
            sum = i +sum;
            i = i+1;
        }
        System.out.println("sum:"+sum);
    }

    static int fun(int A,int B)
    {
        if (B==0)
        {
            return A;
        }
        return fun(B,A%B);
    }

    static  int printTriRec(int n)
    {
        if (n==0||n==1||n==2)
        {
            return 0;
        }

        if(n==3)
            return 1;
        else return printTriRec(n-1) + printTriRec(n-2)+printTriRec(n-3);
    }

    static void printTrib(int n)
    {
        for (int i=1;i<n;i++)
        {
            System.out.println(printTriRec(i));
        }
    }
}

