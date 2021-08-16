package com.prep.string;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {

  public static void main(String[] args) {

    ListNode head = new ListNode(-129);
    head.next = new ListNode(-129);
//    head.next = new ListNode(2);
//    head.next = new ListNode(1);

    System.out.println(isListPalindrome(head));
  }

  public static boolean isListPalindrome(ListNode head) {
    if (head == null) {
      return true;
    }

    ListNode current = head;
    List<Integer> arrayList = new ArrayList<>();

    while (current != null) {
      arrayList.add(current.val);
      current = current.next;
    }

      int low = 0;
      int high = arrayList.size() - 1;
      while (low < high) {

        if (!arrayList.get(low).equals(arrayList.get(high)))
        {
          return false;
        }
        low++;
        high--;
      }



    return true;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
    }
  }
}
