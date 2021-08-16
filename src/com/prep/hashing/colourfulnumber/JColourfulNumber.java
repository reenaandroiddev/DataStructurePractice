package com.prep.hashing.colourfulnumber;

import java.util.HashSet;

/**
 * Perfect Cards
 * Problem Description
 * <p>
 * Tom and Harry are given N numbers, with which they play a game as a team.
 * <p>
 * Initially, Tom chooses a particular number P from the N numbers, and he takes away all the numbers that are equal to P.
 * <p>
 * Next, Harry chooses a different number Q, different from what Tom chose, and takes away all the numbers equal to Q from the remaining N numbers.
 * <p>
 * They win the game if they can take all the numbers by doing the above operation once and if each of them has the same amount of numbers towards the end.
 * <p>
 * If they win, return the string "WIN", else return "LOSE".
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 2 <= N <= 100
 * <p>
 * 1 <= A[i] <= 100
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and the only argument of input contains an integer array, A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a string, denoting the answer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2]
 * Input 2:
 * <p>
 * A = [1, 1, 2, 2, 3]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * "WIN"
 * Output 2:
 * <p>
 * "LOSE"
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * In the his turn, Tom can take 1 away, and then Harry take take 2 away. The array is empty and both of them have equal number of cards, so we can say that they have won the game.
 * Explanation 2:
 * <p>
 * No matter how they take away the elements, >= 1 card will always remain, hence, they lose.
 */
public class JColourfulNumber {

  public static void main(String[] args) {

    System.out.println(colourFulNumber(236));

  }

  private static int colourFulNumber(int A) {

    String str = String.valueOf(A);
    HashSet<Integer> check = new HashSet<>();

    for (int i = 0; i < str.length(); i++) {

      int product = 1;
      for (int j = i; j < str.length(); j++) {
        int num = str.charAt(j) - '0';
        product = product * num;

        if (check.contains(product)) return 0;

        check.add(product);
      }

    }

    return 1;
  }
}
