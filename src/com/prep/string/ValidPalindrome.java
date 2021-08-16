package com.prep.string;

public class ValidPalindrome {

  public static void main(String[] args) {

    System.out.println(isValidPalindrome("A man, a plan, a canal: Panama"));
  }

  public static boolean isValidPalindrome(String str)
  {
    if (str.isEmpty())
    {
      return true;
    }

    String newStr = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();

    StringBuilder builder = new StringBuilder();
    for (int i = newStr.length()-1; i >=0; i--) {
      builder.append(newStr.charAt(i));
    }

    if(builder.toString().toLowerCase().equals(newStr))
    {
      return true;
    }


    return false;
  }
}
