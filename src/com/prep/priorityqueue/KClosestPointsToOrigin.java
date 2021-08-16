package com.prep.priorityqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

  public static void main(String[] args) {
    int points[][] = {{1, 3},
        {-2, 2}};

    int K = 1;

    System.out.println(Arrays.toString(getKClosestPoints(points, K)));
  }

  public static int[][] getKClosestPoints(int[][] points, int k) {
    int[][] closestPoints = new int[k][2];

    PriorityQueue<Pair> pairPriorityQueue = new PriorityQueue<>();

    for (int i = 0; i < points.length; i++) {
      pairPriorityQueue.add(new Pair(points[i][0], points[i][1]));
    }

    for (int i = 0; i < k; i++) {

      Pair pair = pairPriorityQueue.poll();
      int x = pair.x;
      int y = pair.y;
      closestPoints[i][0] = x;
      closestPoints[i][1] = y;
    }

    return closestPoints;
  }

  public static class Pair implements Comparable<Pair> {
    int x;
    int y;

    public Pair(int x, int y) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
      int x1 = x * x;
      int y1 = y * y;
      int x2 = o.x * o.x;
      int y2 = o.y * o.y;

      return (x1 + y1) - (x2 + y2);
    }

    @Override
    public String toString() {
      return "Pair{" +
          "x=" + x +
          ", y=" + y +
          '}';
    }
  }
}
