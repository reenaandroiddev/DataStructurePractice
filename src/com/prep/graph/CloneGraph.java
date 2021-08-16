package com.prep.graph;

import java.util.*;

public class CloneGraph {


  public static void main(String[] args) {


    GraphNode node1 = new GraphNode(1);
    GraphNode node2 = new GraphNode(2);
    GraphNode node3 = new GraphNode(3);
    GraphNode node4 = new GraphNode(4);


    ArrayList<GraphNode> nodes2Arr = new ArrayList<>();
    nodes2Arr.add(node1);
    nodes2Arr.add(node3);

    ArrayList<GraphNode> node1Arr = new ArrayList<>();
    node1Arr.add(node2);
    node1Arr.add(node3);

    ArrayList<GraphNode> node3Arr = new ArrayList<>();
    node3Arr.add(node2);
    node3Arr.add(node4);

    ArrayList<GraphNode> node4Arr = new ArrayList<>();
    node4Arr.add(node1);
    node4Arr.add(node3);

    node1.neighbors = node1Arr;
    node2.neighbors = nodes2Arr;
    node3.neighbors = node3Arr;
    node4.neighbors = node4Arr;


    cloneGraph(node1);

   // GraphNode outPut = cloneGraph(node1);

   // outPut.


  }
  public static GraphNode cloneGraph(GraphNode node)
  {

    HashMap<GraphNode,GraphNode> visited = new HashMap<>();

    // Need to queue to keep track of BFS visits
    Queue<GraphNode> queue = new LinkedList<>();
    queue.add(node);

    visited.put(node,new GraphNode(node.val,new ArrayList<>()));

    while(!queue.isEmpty())
    {

      GraphNode qnode = queue.poll();
      for(GraphNode neigbour: qnode.neighbors)
      {
        if(!visited.containsKey(neigbour))
        {
          // Add that neigbour to the map first

          visited.put(neigbour,new GraphNode(neigbour.val,new ArrayList<>()));
        }

        queue.add(neigbour);
        visited.get(qnode).neighbors.add(visited.get(neigbour));

      }

    }




    return visited.get(node);
  }


  public static class  GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {
      val = 0;
      neighbors = new ArrayList<GraphNode>();
    }

    public GraphNode(int _val) {
      val = _val;
      neighbors = new ArrayList<GraphNode>();
    }

    public GraphNode(int _val, ArrayList<GraphNode> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }
  }


}
