package com.prep.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class TaskScheduler {
  public static void main(String[] args) {

    char [] tasks = {'A','A','A','B','B','B'};
    System.out.println(leastInterval(tasks,0));
    // A-B-Idle-A-B-Idle-A-B

    //["A","A","A","A","A","A","B","C","D","E","F","G"], n = 2

    //A->B->C->D->E->F->G->Idle->A->A->Idle->A->A->Idle->A
  }

  public static int leastInterval(char[] tasks, int n)
  {
    // tasks - Tasks those will execute
    // n Cooling period between two same tasks

    HashMap<Character,Integer> map = new HashMap<>();
    for (char c : tasks)
    {
      map.put(c,map.getOrDefault(c,0)+1);
    }

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
    maxHeap.addAll(map.values());

    int cycles = 0;

    while (!maxHeap.isEmpty())
    {
      List<Integer> temp = new ArrayList<>();
      for (int i = 0; i < n+1; i++) {
        if(!maxHeap.isEmpty())
        {
          temp.add(maxHeap.remove());
        }
      }
      for (int i:
           temp) {
        if(--i>0)
        {
          maxHeap.add(i);
        }
      }

      cycles += maxHeap.isEmpty()? temp.size(): n + 1;

    }

    return cycles;
  }
}
