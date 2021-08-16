package com.prep.hashing.equal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Equal
 * Problem Description
 * <p>
 * Given an array A of N integers, find the index of values that satisfy P + Q = R + S, where P,Q,R & S are integers values in the array
 * <p>
 * Expected time complexity O(N2)
 * <p>
 * NOTE:
 * <p>
 * 1) Return the indices `A1 B1 C1 D1`, so that
 * A[A1] + A[B1] = A[C1] + A[D1]
 * A1 < B1, C1 < D1
 * A1 < C1, B1 != D1, B1 != C1
 * <p>
 * 2) If there are more than one solutions,
 * then return the tuple of values which are lexicographical smallest.
 * <p>
 * Assume we have two solutions
 * S1 : A1 B1 C1 D1 ( these are values of indices in the array )
 * S2 : A2 B2 C2 D2
 * <p>
 * S1 is lexicographically smaller than S2 if:
 * A1 < A2 OR
 * A1 = A2 AND B1 < B2 OR
 * A1 = A2 AND B1 = B2 AND C1 < C2 OR
 * A1 = A2 AND B1 = B2 AND C1 = C2 AND D1 < D2
 * If no solution is possible, return an empty list.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 1000
 * <p>
 * 0 <= A[i] <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * Single argument which is an integer array A of size N.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array of size 4 which indexes of values P,Q,R and S.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [3, 4, 7, 1, 2, 9, 8]
 * Input 2:
 * <p>
 * A = [2, 5, 1, 6]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [0, 2, 3, 5]
 * Output 2:
 * <p>
 * [0, 1, 2, 3]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * A[0] + A[2] = A[3] + A[5]
 * Note: indexes returned should be 0-based.
 * Explanation 2:
 * <p>
 * A[0] + A[1] = A[2] + A[3]
 */
public class JEqual {
  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(3);
    arrayList.add(4);
    arrayList.add(7);
    arrayList.add(1);
    arrayList.add(2);
    arrayList.add(9);
    arrayList.add(8);

    System.out.println(equal(arrayList));
  }

  public static ArrayList<Integer> equal(ArrayList<Integer> A) {
    HashMap<Integer, Pair> pairHashMap = new HashMap<>();

    ArrayList<Integer> ansPairList = new ArrayList<>();
    for (int i = 0; i < A.size(); i++) {

      for (int j = i + 1; j < A.size(); j++) {
        int sum = A.get(i) + A.get(j);
        if (pairHashMap.containsKey(sum)) {
          Pair pair = pairHashMap.get(sum);

          ArrayList<Integer> currentPairList = new ArrayList<>();

          if (i != pair.i && j != pair.j && i != pair.j && j != pair.i) {
            currentPairList.add(pair.i);
            currentPairList.add(pair.j);
            currentPairList.add(i);
            currentPairList.add(j);

            if (ansPairList.isEmpty() || isLexicographicallySmaller(currentPairList, ansPairList)) {
              ansPairList = currentPairList;
            }
          }
        } else {
          pairHashMap.put(sum, new Pair(i, j));
        }
      }
    }


    return ansPairList;
  }

  static boolean isLexicographicallySmaller(ArrayList<Integer> s1, ArrayList<Integer> s2) {

    int A1 = s1.get(0);
    int A2 = s2.get(0);
    int B1 = s1.get(1);
    int B2 = s2.get(1);
    int C1 = s1.get(2);
    int C2 = s2.get(2);
    int D1 = s1.get(3);
    int D2 = s2.get(3);
    if ((A1 < A2) ||
        ((A1 == A2) && (B1 < B2))
        || ((A1 == A2) && (B1 == B2) && (C1 < C2)) || ((A1 == A2) && (B1 == B2) && (C1 == C2) && (D1 < D2))) {
      return true;
    }

    return false;
  }

  static class Pair {
    int i, j;

    Pair(int i, int j) {
      this.i = i;
      this.j = j;
    }
  }
}
