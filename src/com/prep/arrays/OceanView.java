package com.prep.arrays;

import java.util.ArrayList;
import java.util.List;

public class OceanView {

  public static void main(String[] args) {

    int [] arr = {3,19,1,10};

    List<Integer> result = getOceanView(arr);
    for (int i = result.size()-1; i >=0 ; i--) {

      System.out.println(result.get(i)+ " ");

    }

  }

 public static List<Integer> getOceanView(int [] arr)
  {

    List<Integer> result = new ArrayList<>();

    int maxVal=0;

    for(int i = arr.length-1; i >=0 ; i--)
    {

      if(arr[i]>maxVal)
      {
        maxVal = arr[i];
        result.add(i);
      }


    }



    return result;

  }
}
