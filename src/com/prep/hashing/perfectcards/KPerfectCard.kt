package com.prep.hashing.perfectcards

import java.util.*

object KPerfectCard {
    @JvmStatic
    fun main(args: Array<String>) {
        println(solve(intArrayOf(1, 2, 1, 2, 3)))
    }

    fun solve(A: IntArray): String {
        val map = HashMap<Int, Int>()
        for (i in A.indices) {
            map[A[i]] = map.getOrDefault(A[i], 0) + 1
        }
        val counts: List<Int> = ArrayList(map.values)
        if (counts.size > 2) return "LOSE"
        return if (counts[0] == counts[1]) "WIN" else "LOSE"
    }
}