package com.prep.slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class SlidingWindoPriorityQueue {
  public static void main(String[] args) {

  }

  public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {

    PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());

    ArrayList<Integer> res = new ArrayList<>();

    int i = 0;

    if (B >= A.size()) {
      for (; i < A.size(); i++) {
        pQ.add(A.get(i));
      }

      res.add(pQ.peek());

      return res;
    }


    for (; i < B; i++) {
      pQ.add(A.get(i));
    }

    res.add(pQ.peek());
    pQ.remove(A.get(0));

    for (; i < A.size(); i++) {
      pQ.add(A.get(i));

      res.add(pQ.peek());
      pQ.remove(A.get(i - B + 1));
    }

    return res;


  }
}
