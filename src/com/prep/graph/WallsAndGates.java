package com.prep.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WallsAndGates {

  private static final int INF = Integer.MAX_VALUE;
  private static final int GATE = 0;
  private static final List<int[]> DIRECTION =
      Arrays.asList(
          new int[]{1, 0},
          new int[]{-1, 0},
          new int[]{0, 1},
          new int[]{0, -1}
      );

  public static int[][] rooms =
      {
          {INF, -1, 0, INF},
          {INF, INF, INF, -1},
          {INF, -1, INF, -1},
          {0, -1, INF, INF}
      };

  // Expected Output should be
  int[][] output =
      {
          {3, -1, 0, 1},
          {2,  2, 1, -1},
          {1, -1, 2, -1},
          {0, -1, 3, 4}
      };

  public static void main(String[] args) {
    wallAndGates(rooms);

    for (int i = 0; i < rooms.length; i++) {
      {
        for (int j = 0; j < rooms[0].length; j++) {
          System.out.print(" "+rooms[i][j]);
        }
        System.out.println("");
      }

    }
  }

  public static void wallAndGates(int[][] rooms) {
    if (rooms == null || rooms.length == 0)
      return;
    int m = rooms.length; // rows
    int n = rooms[0].length; // cols

    Queue<int[]> q = new LinkedList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (rooms[i][j] == GATE) {
          q.add(new int[]{i, j});
        }
      }
    }

    while (!q.isEmpty()) {
      // Getting gate values to enter into grid and update the INF values with distance from Gate
      int[] point = q.poll();
      int row = point[0];
      int col = point[1];

      //Taken from queue

      // Add direction to the given point and check if it has Inf value
      // Keep adding directions to the point taken from queue say r and c
      // if r and c has inf value then add one to row and col and assign to new r and c
      // Add new r and c to queue

      // this is something programatically
      // how you will think about just simply write algorithm and identify the which approach i need to follow
      // Need to understand the problem


      for (int[] direction : DIRECTION) {
        int r = row + direction[0];
        int c = col + direction[1];

        if (r < 0 || c < 0 || r >= m || c >= n || rooms[r][c] != INF)
          continue;

        rooms[r][c] = rooms[row][col] + 1;
        q.add(new int[]{r, c});
      }
    }
  }

}
