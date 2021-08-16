package com.prep.string;

public class StringAtoi {
  public static void main(String[] args) {

    String s = "120";
    System.out.println(atoi(s));
  }

  public static int atoi(String s)
  {
    StringBuilder builder = new StringBuilder();

    char sign;
    if(Character.isAlphabetic(s.charAt(0)))
      return 0;


    for (int i = 0; i < s.length(); i++) {
      if (Character.isDigit(s.charAt(i))) {
        int j=i-1;
        if (s.charAt(i - 1) == '-') {
          sign = '-';
        }
        while (j>=0)
        {
          // replace all '' with
          if (s.charAt(j)==' ')
          {
           s.replaceAll(" ","");
          }
          j--;
        }

      }
    }

    return Integer.MAX_VALUE;
  }
}
