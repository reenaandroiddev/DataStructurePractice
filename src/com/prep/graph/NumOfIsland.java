package com.prep.graph;

public class NumOfIsland {
  public static void main(String[] args) {

    char[][] input = {
        {'1', '1', '1'},
        {'0', '1', '0'},
        {'1', '0', '0'},
        {'1', '0', '1'}
    };

    System.out.println(numOfIsland(input));

  }

  public static void dfs(char[][] grid, int r, int c) {
    if (grid == null || grid.length == 0) {
      return;
    }

    int nr = grid.length;
    int nc = grid[0].length;

    if (r < 0 || c < 0 || r >=nr || c >= nc || grid[r][c] == '0')
      return;

    grid[r][c] = '0';
    dfs(grid, r - 1, c);
    dfs(grid, r + 1, c);
    dfs(grid, r, c - 1);
    dfs(grid, r, c + 1);

  }

  public static int numOfIsland(char[][] grid) {
    int numOfIsland = 0;

    if (grid == null || grid.length == 0) {
      return numOfIsland;
    }

    int nr = grid.length;
    int nc = grid[0].length;

    for (int r = 0; r < nr; r++) {
      for (int c = 0; c < nc; c++) {
          if(grid[r][c]=='1')
          {
            numOfIsland++;
            dfs(grid,r,c);
          }
      }
    }

    return numOfIsland;
  }


}
