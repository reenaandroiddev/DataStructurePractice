package com.prep.arrays;

public class VerifyAlienDictionary {

  public static void main(String[] args) {

    System.out.println(isAlienSorted(new String[]{"hello","leetcode"},"hlabcdefgijkmnopqrstuvwxyz"));
  }

  public static boolean isAlienSorted(String[] words,String order)
  {
    // To store characters value
    // What if i use map here? You can think of it
    int[] indexes = new int[26];
    for (int i = 0; i < order.length(); i++) {
      indexes[order.charAt(i)-'a'] = i;
    }

    search :
    for (int i = 0; i < words.length-1; i++) {
      String word1 = words[i];
      String word2 = words[i+1];

      for (int j = 0; j < Math.min(word1.length(),word2.length()); j++) {
        if(word1.charAt(j)!=word2.charAt(j))
        {
          // if they compare, and its not sorted then
          if(indexes[word1.charAt(j)-'a'] > indexes[word2.charAt(j)-'a'])
            return false;
          continue search;
        }
      }

      if (word1.length()>word2.length() && word1.startsWith(word2))
      {
        return false;
      }
    }

    return true;
  }
}
