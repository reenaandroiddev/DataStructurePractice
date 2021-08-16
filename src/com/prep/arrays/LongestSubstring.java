package com.prep.arrays;


import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
  public static void main(String[] args) {
    System.out.println(lengthOfLongestSubstring("abcdabcbb"));
  }

  public static int lengthOfLongestSubstring(String str) {
    int maxCount = 0;
    int n = str.length();

    Map<Character, Integer> map = new HashMap<>();

    for (int j = 0, i = 0; j < n; j++) {
      // check if map contains the character already

      if (map.containsKey(str.charAt(j))) {
        i = Math.max(map.get(str.charAt(j)), i);
      }
      maxCount = Math.max(maxCount, j - i + 1);
      map.put(str.charAt(j), j + 1);
    }
    return maxCount;
  }
}
