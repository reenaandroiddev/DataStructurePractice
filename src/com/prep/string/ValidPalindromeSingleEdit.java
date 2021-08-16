package com.prep.string;

public class ValidPalindromeSingleEdit {
  public static void main(String[] args) {

    System.out.println(isValidPalimdrome("abc"));
  }

  public static boolean isValidPalimdrome(String str) {
    int mid = str.length() / 2;
    int i = 0;
    int j = str.length() - 1;
    int count = 0;
    while (i <= mid && j >= mid) {
      if (str.charAt(i) != str.charAt(j)) {
        count++;
        if (i <= mid) {
          i++;
        }

        if (j >= mid) {
          j--;
        }
      } else {
        i++;
        j--;
      }

      if (count > 1) {
        return false;
      }

    }

    return true;
  }
}
