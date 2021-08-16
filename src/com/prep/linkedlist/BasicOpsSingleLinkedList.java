package com.prep.linkedlist;

import java.util.Iterator;

public class BasicOpsSingleLinkedList {

  SingleLinkeListNode head;

  public static void main(String[] args) {
    BasicOpsSingleLinkedList singleLinkedList = new BasicOpsSingleLinkedList();
    singleLinkedList.addAtHead(2);
    singleLinkedList.addAtHead(3);
    singleLinkedList.addAtHead(5);
    singleLinkedList.addAtHead(7); //
    singleLinkedList.addAtHead(8); // head

//        singleLinkedList.addAtIndex(0, 100);
//         singleLinkedList.addAtIndex(5,190);
//
//
//        System.out.println("Linked List Length:" + singleLinkedList.getLength());
//
//        System.out.println(" Value at Index 0 - " + singleLinkedList.get(0));
//        System.out.println(" Value at Index 1 - " + singleLinkedList.get(1));
//        System.out.println(" Value at Index 2 - " + singleLinkedList.get(2));
//        System.out.println(" Value at Index 3 - " + singleLinkedList.get(3));
//        System.out.println(" Value at Index 4 - " + singleLinkedList.get(4));
//        System.out.println(" Value at Index 5 - " + singleLinkedList.get(5));
//        System.out.println(" Value at Index 6 - " + singleLinkedList.get(6));


    BasicOpsSingleLinkedList singleLinkedListRevers = new BasicOpsSingleLinkedList();
    singleLinkedListRevers.addAtHead(4);
    singleLinkedListRevers.addAtHead(3);
    singleLinkedListRevers.addAtHead(2);
    singleLinkedListRevers.addAtHead(1);

//        SingleLinkeListNode head = new SingleLinkeListNode(1);

    BasicOpsSingleLinkedList linkedList = new BasicOpsSingleLinkedList();
    linkedList.head = new SingleLinkeListNode(1);
    linkedList.head.next = new SingleLinkeListNode(2);
    linkedList.head.next.next = new SingleLinkeListNode(3);
    linkedList.head.next.next.next = new SingleLinkeListNode(4);


    System.out.println("Given Linked list");
    linkedList.printNode(linkedList.head);
    linkedList.head = reverseLinkedList(linkedList.head);
    System.out.println("");
    System.out.println("Reversed linked list ");
    printNode(linkedList.head);

//        reverseLinkedList(singleLinkedListRevers.head);


//        printNode(singleLinkedListRevers.head);

  }

  static void printNode(SingleLinkeListNode node) {
    while (node != null) {
      System.out.println(node.value + "->");
      node = node.next;
    }
  }

  public static SingleLinkeListNode reverseLinkedList(SingleLinkeListNode head) {
    SingleLinkeListNode prev = null;
    SingleLinkeListNode current = head;
    SingleLinkeListNode nextTemp = current.next; // 2

    while (current != null) {
      nextTemp = current.next; // 2
      current.next = prev; // null
      prev = current; // 1
      current = nextTemp;
    }

    return prev;

  }

  public BasicOpsSingleLinkedList() {
    head = null;
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    SingleLinkeListNode node;
    int nodeIndex = 0;
    if (head != null) {
      node = head;
      while (node != null) {
        if (nodeIndex == index) {
          return node.value;
        }
        node = node.next;
        nodeIndex++;
      }
    }
    return -1;
  }


  /**
   * Add a node of value val before the first element of the linked list. After the insertion,
   * the new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
//        if (head == null) {
//            head = new SingleLinkeListNode(value);
//        } else {
//            SingleLinkeListNode node = new SingleLinkeListNode(value);
//            node.next = head;
//            head = node;
//        }

    SingleLinkeListNode cur = new SingleLinkeListNode(val);
    cur.next = head;
    head = cur;
    return;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   * To append value we need to check first if head is null
   * if head is null then tail will be the head
   * else
   * keep looking for next node null value
   * one we get the next null create new node and add to the next value
   */
  public void addAtTail(int val) {
    if (head == null) {
      head = new SingleLinkeListNode(val);
    }
    SingleLinkeListNode tailNode = new SingleLinkeListNode(val);
    SingleLinkeListNode current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = tailNode;


    if (head == null) {
      addAtHead(val);
      return;
    }
    SingleLinkeListNode prev = getTail();
    SingleLinkeListNode cur = new SingleLinkeListNode(val);
    prev.next = cur;
  }


  /**
   * Add a node of value val before the index-th node in the linked list.
   * If index equals to the length of linked list, the node will be appended to the end of linked list.
   * If index is greater than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {

    if (index > getLength() - 1)
      return;
    SingleLinkeListNode nodeToBeInsert = new SingleLinkeListNode(val);
    int nodeIndex = 0;
    if (head == null) {
      head = new SingleLinkeListNode(val);
    } else {
      SingleLinkeListNode current = head;
      while (current != null) {

        if (index == 0) {
          addAtHead(val);
          return;
        }

        if (index == getLength() - 1) {
          addAtTail(val);
          return;
        }

        if (nodeIndex == index) {
          nodeToBeInsert.next = current.next;
          current.next = nodeToBeInsert;
          return;
        }
        nodeIndex++;
        current = current.next;
      }

    }
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {

  }

  public int getLength() {
    int length = 0;
    SingleLinkeListNode current = head;

    while (current != null) {
      length++;
      current = current.next;
    }
    return length;
  }

  private SingleLinkeListNode getNode(int index) {
    SingleLinkeListNode cur = head;
    for (int i = 0; i < index && cur != null; ++i) {
      cur = cur.next;
    }
    return cur;
  }

  /**
   * Helper function to return the last node in the linked list.
   */
  private SingleLinkeListNode getTail() {
    SingleLinkeListNode cur = head;
    while (cur != null && cur.next != null) {
      cur = cur.next;
    }
    return cur;
  }

}
