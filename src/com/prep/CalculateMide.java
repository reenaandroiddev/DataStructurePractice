package com.prep;

public class CalculateMide {
  public static void main(String[] args) {
    System.out.println(getMid(0,8));
  }

  public static int getMid(int low, int high)
  {
    return low + (high-low)/2;
  }
}
