package com.prep.romantointeger;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

  static Map<String, Integer> values = new HashMap<>();

  static {
    values.put("M", 1000);
    values.put("D", 500);
    values.put("C", 100);
    values.put("L", 50);
    values.put("X", 10);
    values.put("V", 5);
    values.put("I", 1);
  }

  public static void main(String[] args) {
    System.out.println(romanToInt("LVIII"));
  }

  public static int romanToInt(String s)
  {
    int result = 0;
    int i = 0;

    while (i<s.length())
    {
      String currentSymbol = s.substring(i,i+1);
      // Substring dont include closing index
      int currentValue = values.get(currentSymbol);
      int nextValue = 0;

      if(i+1 < s.length())
      {
        String nextSymbol = s.substring(i+1,i+2);
        nextValue = values.get(nextSymbol);
      }

      if(currentValue < nextValue)
      {
        result += (nextValue - currentValue);
        i+=2;
      } else {
        result+= currentValue;
        i+=1;
      }
    }

    return result;

  }
}
