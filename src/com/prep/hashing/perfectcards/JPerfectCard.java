package com.prep.hashing.perfectcards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JPerfectCard {
  public static void main(String[] args) {

    System.out.println(solve(new int[]{1, 2, 1, 2,3}));
  }

  static String solve(int[] A) {
    HashMap<Integer, Integer> map = new HashMap<>();


    for (int i = 0; i < A.length; i++) {
      map.put(A[i], map.getOrDefault(A[i], 0) + 1);
    }

    List<Integer> counts = new ArrayList<>(map.values());

    if (counts.size() > 2)
      return "LOSE";

    if (counts.get(0).equals(counts.get(1)))
      return "WIN";

    return "LOSE";

  }
}
