package com.prep.arrays;

public class MultiplyString {
  public static void main(String[] args) {

    System.out.println(multiplyStrings("123456789","987654321"));
  }

  // Should not use library
  // how to convert string into integer without inbuilt funtion

  public static String multiplyStrings( String num1,String num2)
  {
    long num1Int = 0;
    long num2Int = 0;


    // Convert num1 to int
    for (int i = 0; i < num1.length(); i++) {
      num1Int = (num1Int * 10) + num1.charAt(i) - '0';
    }

    // Convert num1 to int
    for (int i = 0; i < num2.length(); i++) {
      num2Int = (num2Int * 10) + num2.charAt(i) - '0';
    }

    long mulResult = num1Int * num2Int ;
    // We should not use direct into string function




    return mulResult + "";
  }
}
