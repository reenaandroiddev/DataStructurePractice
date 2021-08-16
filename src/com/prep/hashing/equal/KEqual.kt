package com.prep.hashing.equal

import java.util.*

/**
 * Equal
 * Problem Description
 *
 *
 * Given an array A of N integers, find the index of values that satisfy P + Q = R + S, where P,Q,R & S are integers values in the array
 *
 *
 * Expected time complexity O(N2)
 *
 *
 * NOTE:
 *
 *
 * 1) Return the indices `A1 B1 C1 D1`, so that
 * A[A1] + A[B1] = A[C1] + A[D1]
 * A1 < B1, C1 < D1
 * A1 < C1, B1 != D1, B1 != C1
 *
 *
 * 2) If there are more than one solutions,
 * then return the tuple of values which are lexicographical smallest.
 *
 *
 * Assume we have two solutions
 * S1 : A1 B1 C1 D1 ( these are values of indices in the array )
 * S2 : A2 B2 C2 D2
 *
 *
 * S1 is lexicographically smaller than S2 if:
 * A1 < A2 OR
 * A1 = A2 AND B1 < B2 OR
 * A1 = A2 AND B1 = B2 AND C1 < C2 OR
 * A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2
 * If no solution is possible, return an empty list.
 *
 *
 *
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000
 *
 *
 * 0 <= A[i] <= 1000
 *
 *
 *
 *
 *
 *
 * Input Format
 * Single argument which is an integer array A of size N.
 *
 *
 *
 *
 *
 *
 * Output Format
 * Return an array of size 4 which indexes of values P,Q,R and S.
 *
 *
 *
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *
 * A = [3, 4, 7, 1, 2, 9, 8]
 * Input 2:
 *
 *
 * A = [2, 5, 1, 6]
 *
 *
 *
 *
 * Example Output
 * Output 1:
 *
 *
 * [0, 2, 3, 5]
 * Output 2:
 *
 *
 * [0, 1, 2, 3]
 *
 *
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *
 * A[0] + A[2] = A[3] + A[5]
 * Note: indexes returned should be 0-based.
 * Explanation 2:
 *
 *
 * A[0] + A[1] = A[2] + A[3]
 */
object KEqual {
    @JvmStatic
    fun main(args: Array<String>) {
        val arrayList = ArrayList<Int>()
        arrayList.add(3)
        arrayList.add(4)
        arrayList.add(7)
        arrayList.add(1)
        arrayList.add(2)
        arrayList.add(9)
        arrayList.add(8)
        println(equal(arrayList))
    }

    fun equal(A: ArrayList<Int>): ArrayList<Int> {
        val pairHashMap = HashMap<Int, Pair>()
        var ansPairList = ArrayList<Int>()
        for (i in A.indices) {
            for (j in i + 1 until A.size) {
                val sum = A[i] + A[j]
                if (pairHashMap.containsKey(sum)) {
                    val pair = pairHashMap[sum]
                    val currentPairList = ArrayList<Int>()
                    if (i != pair!!.i && j != pair.j && i != pair.j && j != pair.i) {
                        currentPairList.add(pair.i)
                        currentPairList.add(pair.j)
                        currentPairList.add(i)
                        currentPairList.add(j)
                        if (ansPairList.isEmpty() || isLexicographicallySmaller(currentPairList, ansPairList)) {
                            ansPairList = currentPairList
                        }
                    }
                } else {
                    pairHashMap[sum] = Pair(i, j)
                }
            }
        }
        return ansPairList
    }

    private fun isLexicographicallySmaller(s1: ArrayList<Int>, s2: ArrayList<Int>): Boolean {
        val A1 = s1[0]
        val A2 = s2[0]
        val B1 = s1[1]
        val B2 = s2[1]
        val C1 = s1[2]
        val C2 = s2[2]
        val D1 = s1[3]
        val D2 = s2[3]
        return (A1 < A2 ||
                A1 == A2 && B1 < B2
                || A1 == A2 && B1 == B2 && C1 < C2 || A1 == A2 && B1 == B2 && C1 == C2 && D1 < D2)
    }

    internal class Pair(var i: Int, var j: Int)
}