package com.prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
 * Problem
 * Implement an algorithm to determine if string has all unique characters.What if you can not use additional data structure.
 * Solution
 * 1. findUniqueBruteForce - TimeComplexity o(n^2)
 * 2. findUniqueOptimalSolution - TimeComplexity o(n)
 * 3. findUniqueUsingHashMap - TimeComplexity o(n)
 * 4. findUniqueUsingHashSet - TimeComplexity o(n)
 * */
public class UniqueCharsInString {
    private static final String TAG = "000";

    public static void main(String[] args) {
        findUniqueBruteForce(TAG);
        findUniqueOptimalSolution("Reennnaaa");
        findUniqueUsingHashMap("TAG");
        findUniqueUsingSet("wewewG");

    }

    public static void findUniqueBruteForce(String inputString) {
        for (int i = 0; i < inputString.length(); i++) {
            int count = 0;
            for (int j = 0; j < inputString.length(); j++) {
                if (inputString.charAt(i) == inputString.charAt(j)) {
                    count++;
                }
                if (count > 1) {
                    System.out.println(inputString.charAt(j) + " " + count + " Input String dont have unique characters:" + inputString);
                    return;
                }
            }
        }

        System.out.println("Input String has unique characters " + inputString);

    }

    /*
     * This solution will work on the ascii values of string's character
     * Create boolean array and will check whether character ascii value is already marked as true
     * if already true then will return loop
     * */
    public static void findUniqueOptimalSolution(String inputString) {
        boolean[] charArray = new boolean[128];
        for (int i = 0; i < inputString.length(); i++) {
            int val = inputString.charAt(i);
            if (charArray[val]) {
                System.out.println("Input String dont have unique characters:" + inputString);
                return;
            }
            charArray[val] = true;
        }
        System.out.println("Input String has unique characters " + inputString);
    }

    /*
    * following data structure will help to identify if the string has unique character or not
    * */
    public static void findUniqueUsingHashMap(String inputString) {

        HashMap<Character, Integer> stringHashMap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            if (stringHashMap.containsKey(inputString.charAt(i))) {
                System.out.println("Input String dont have unique characters:" + inputString);
                return;
            }
            stringHashMap.put(inputString.charAt(i), i);
        }
        System.out.println("Input String has unique characters " + inputString);
    }

    public static void findUniqueUsingSet(String inputString) {
        Set<Character> characterHashSet = new HashSet<>();
        for (int i = 0; i < inputString.length(); i++) {
            characterHashSet.add(inputString.charAt(i));
        }
        if (inputString.length() > characterHashSet.size()) {
            System.out.println("Input String dont have unique characters:" + inputString);
            return;
        }
        System.out.println("Input String has unique characters " + inputString);
    }


}

