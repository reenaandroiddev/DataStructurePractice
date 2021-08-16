package com.prep.maths;

public class ReverseNumber {
  public static void main(String[] args) {
    System.out.println(reverseNumber(123));
  }

  public static int reverseNumber(int x) {
    long rev = 0;
    while (x != 0) {
      rev = rev * 10 + x % 10;
      x = x / 10;
    }


    return (int) rev;
  }
}
