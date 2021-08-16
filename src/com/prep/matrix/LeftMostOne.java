package com.prep.matrix;

public class LeftMostOne {

  public static void main(String[] args) {
    int [][] binaryMatrix = {{0,0,0,0,1},
        {0,0,0,1,1},
        {0,0,1,1,1},
        {0,1,1,1,1},
        {0,0,0,0,1}
    };
    System.out.println(getLeftMostUsingBinarySearch(binaryMatrix));
    // result should be 2 here
  }


  public static int getLeftMostCol(int[][] bMatrix)
  {

    int leftMostCol = -1;

    int rows = bMatrix.length;
    int cols = bMatrix[0].length;

    int r = 0;
    int c = cols-1;

    while(r<rows && c>=0)
    {

      if(bMatrix[r][c]==1)
      {
        leftMostCol=c;
        c--;
      } else
      {
        r++;
      }

    }

    return leftMostCol;
  }



  public static int getLeftMostUsingBinarySearch(int[][] bMatrix)
  {

    int rows = bMatrix.length;
    int cols = bMatrix[0].length;


    int leftMostCol = cols;


    for (int row = 0; row < rows; row++) {

      int low = 0;
      int high = cols-1;
      while(low<high)
      {
        int mid = low + (high-low)/2;

        if(bMatrix[row][mid]==0)
        {
          low = mid+1;
        } else
        {
          high = mid;
        }

        if (bMatrix[row][low]== 1) {
          leftMostCol = Math.min(leftMostCol, low);
        }

      }
    }

    return leftMostCol==cols?-1:leftMostCol;
  }
}
