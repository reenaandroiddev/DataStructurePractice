package com.prep.hashing.colourfulnumber

import java.util.*

object KColourfulNumber {
    @JvmStatic
    fun main(args: Array<String>) {
        println(colourFulNumber(236))
    }

    private fun colourFulNumber(A: Int): Int {
        val str = A.toString()
        val check = HashSet<Int>()
        for (i in str.indices) {
            var product = 1
            for (j in i until str.length) {
                val num = str[j] - '0'
                product *= num
                if (check.contains(product)) return 0
                check.add(product)
            }
        }
        return 1
    }
}