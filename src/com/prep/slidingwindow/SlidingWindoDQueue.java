package com.prep.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindoDQueue {
  public static void main(String[] args) {

    //solve(new int[]{});
  }

  static void solve(final int[] A, int B) {
    Deque<Integer> integerDeque = new LinkedList<>();
    int i;
    for (i = 0; i < B; i++) {
      while (!integerDeque.isEmpty() && A[i] >= A[integerDeque.peekLast()])
        integerDeque.removeLast();

      integerDeque.addLast(i);

    }

    for (; i < A.length; i++) {
      while ((!integerDeque.isEmpty()) && integerDeque.peek() <=
          i - B)
        integerDeque.removeFirst();

      while ((!integerDeque.isEmpty()) && A[i] >=
          A[integerDeque.peekLast()])
        integerDeque.removeLast();

      // Add current element at the rear of Qi
      integerDeque.addLast(i);
    }

  }
}
