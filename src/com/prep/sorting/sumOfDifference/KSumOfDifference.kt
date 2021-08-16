package com.prep.sorting.sumOfDifference

import java.util.*

/*
Sum the Difference
Problem Description

Given an integer array A of size N.
You have to find all possible non-empty subsequence of the array of numbers and then, for each subsequence, find the difference between the largest and smallest numbers in that subsequence Then add up all the differences to get the number.

As the number may be large, output the number modulo 1e9 + 7 (1000000007).

NOTE: Subsequence can be non-contiguous.



Problem Constraints
1 <= N <= 10000

1<= A[i] <=1000



Input Format
First argument is an integer array A.



Output Format
Return an integer denoting the output.



Example Input
Input 1:

A = [1, 2]
Input 2:

A = [1]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

All possible non-empty subsets are:
[1]    largest-smallest = 1 - 1 = 0
[2]    largest-smallest = 2 - 2 = 0
[1 2]  largest-smallest = 2 - 1 = 1
Sum of the differences = 0 + 0 + 1 = 1
So, the resultant number is 1
Explanation 2:

 Only 1 subsequence of 1 element is formed.
* */

object KSumOfDifference {
    @JvmStatic
    fun main(args: Array<String>) {
        println(solve(intArrayOf(5, 4, 9)))
    }

    fun solve(A: IntArray): Int {
        val MOD = 1000000007
        var maxSum: Long = 0
        var minSum: Long = 0
        val n = A.size
        Arrays.sort(A)
        for (i in 0 until n) {
            maxSum = 2 * maxSum + A[n - i - 1]
            maxSum %= MOD.toLong()
            minSum = 2 * minSum + A[i]
            minSum %= MOD.toLong()
        }
        return (maxSum - minSum + MOD).toInt() % MOD
    }
}