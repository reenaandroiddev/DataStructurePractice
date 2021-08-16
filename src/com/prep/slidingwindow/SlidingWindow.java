package com.prep.slidingwindow;

public class SlidingWindow {

  // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
  public int[] slidingMaximum(final int[] A, int B) {

    if(B>=A.length)
    {
      int max = getMaxNum(0,A.length,A);
      return new int[]{max};
    }

    int[] output = new int[A.length-B+1];

    for(int i=0;i<A.length-B+1;i++)
    {
      output[i] = getMaxNum(i,i+B,A);
    }

    return output;
  }

  public int getMaxNum(int start, int end, int[] A)
  {

    int max=0;

    for(int i=start;i<end;i++)
    {
      max = Math.max(max,A[i]);
    }

    return max;
  }
}
