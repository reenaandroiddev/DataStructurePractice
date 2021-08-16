package com.prep.sorting.elementremoval

import java.util.*

object KElementRemoval {
    @JvmStatic
    fun main(args: Array<String>) {
        println(solve(intArrayOf(1, 2, 3)))
    }

    fun solve(A: IntArray): Int {
        Arrays.sort(A)
        reverse(A)
        var minCostSum = 0
        for (i in A.indices) {
            for (j in i until A.size) {
                minCostSum += A[j]
            }
        }
        return minCostSum
    }

    fun reverse(A: IntArray): IntArray {
        var temp: Int
        val len = A.size
        for (i in 0 until A.size / 2) {
            temp = A[i]
            A[i] = A[len - i - 1]
            A[len - i - 1] = temp
        }
        return A
    }
}