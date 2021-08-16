package com.prep.arrays;

import java.util.Hashtable;

public class CheckDoubleValue {

    public static void main(String[] args) {
        System.out.println("Is double exists:"+checkIfDoubleExistsUsingHashMap(new int[]{3,1,7,11}));
    }

    private static boolean checkIfDoubleExistsUsingHashMap(int arr[]) {
        int i = 0;
        Hashtable<Integer, Integer> doubleHashtable = new Hashtable<>();

        for (; i < arr.length; i++) {
            doubleHashtable.put(arr[i], arr[i]*2);
        }

        for (i = 0; i < arr.length; i++) {
            int doubleVal = arr[i] * 2;


            if(doubleHashtable.get(arr[i])!=arr[i])
            {
                if (doubleHashtable.get(arr[i]) == doubleVal) {
                    return true;
                }
            }


        }

        return false;
    }


    private static boolean checkIfDoubleExists(int[] arr) {
        int i = 0;
        int j = 0;
        int mul = 0;
        for (; i < arr.length; i++) {
            mul = arr[i] * 2;
            while (j < arr.length) {
                if (i != j  && mul == arr[j]) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
}
