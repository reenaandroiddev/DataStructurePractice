package com.prep.linkedlist;

public class RemoveKthNode {

  public static void main(String[] args) {
    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(2);
    l2.next.next = new ListNode(3);
    l2.next.next.next = new ListNode(4);
    l2.next.next.next.next = new ListNode(5);


    printNode(removeNthFromEnd(l2, 2));


  }

  static void printNode(ListNode node) {
    while (node != null) {
      System.out.println(node.val + "->");
      node = node.next;
    }
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {

    int length = 0;

    // When i can update this?
    ListNode dummy = new ListNode(0);
    dummy.next = head;

    ListNode current = head;
    while (current != null) {
      length++;
      current = current.next;
    }

    length = length - n;
    current = dummy; // Resetting current with 0->1->2-3->

    while (length > 0) {
      length--;
      current = current.next;
    }

    current.next = current.next.next;
    return dummy.next; // Returning head
  }


}
