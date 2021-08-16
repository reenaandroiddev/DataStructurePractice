package com.prep.recursion.string;

public class Permutation {
  static boolean isPermutation = false;

  public static void main(String[] args) {

    System.out.println(checkInclusion("ab",
        "eidbaooo"));
  }

  public static boolean checkInclusion(String s1, String s2) {
    boolean[] visited = new boolean[s1.length()];
    StringBuilder sb = new StringBuilder();

    if (s1.length() > s2.length())
      return false;

    if (s2.contains(s1))
      return true;

    permute(s1, s2, sb, visited);

    return isPermutation;
  }

  static void permute(String s1, String s2, StringBuilder sb, boolean[] visited) {


    if (sb.length() == s1.length()) {
      if (s2.contains(sb.toString())) {
        isPermutation = true;
      }
      return;
    }

    for (int i = 0; i < s1.length(); i++) {
      if (visited[i]) continue;
      visited[i] = true;
      sb.append(s1.charAt(i));
      permute(s1, s2, sb, visited);
      visited[i] = false;
      sb.setLength(sb.length() - 1);
    }
  }
}
