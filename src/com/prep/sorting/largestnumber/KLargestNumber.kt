package com.prep.sorting.largestnumber

import java.util.*

/*
* Largest Number
Problem Description

Given a array A of non negative integers, arrange them such that they form the largest number.

Note: The result may be very large, so you need to return a string instead of an integer.

Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109

Input Format
First argument is an array of integers.

Output Format
Return a string representing the largest number.

Example Input
Input 1:

A = [3, 30, 34, 5, 9]
Input 2:

A = [2, 3, 9, 0]

Example Output
Output 1:

"9534330"
Output 2:

"9320"

Example Explanation
Explanation 1:

A = [3, 30, 34, 5, 9]
Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:

Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
*
* */
object KLargestNumber {
    @JvmStatic
    fun main(args: Array<String>) {
        println(largestNumber(intArrayOf(3, 30, 34, 5, 9)))
    }

    fun largestNumber(A: IntArray): String {
        val nums = arrayOfNulls<String>(A.size)
        for (i in A.indices) {
            nums[i] = A[i].toString()
        }
        //TODO Sort usong comparator
        val comparator = NumberComparator()
//        nums.sortedWith(comparator)
//        Arrays.sort(nums, com)
        if (nums[0] == "0") {
            return "0"
        }
        val builder = StringBuilder()
        for (i in nums.indices) {
            builder.append(nums[i])
        }
        return builder.toString()
    }

    class NumberComparator : Comparator<String> {
        override fun compare(o1: String, o2: String): Int {
            val object1 = o1 + o2
            val object2 = o2 + o1
            return object2.compareTo(object1)
        }
    }
}