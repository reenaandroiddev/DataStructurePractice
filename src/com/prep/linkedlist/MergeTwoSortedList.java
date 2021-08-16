package com.prep.linkedlist;

public class MergeTwoSortedList {
  public static void main(String[] args) {

    ListNode l1 = new ListNode(1);
    l1.next = new ListNode(2);
    l1.next.next = new ListNode(4);

    ListNode l2 = new ListNode(1);
    l2.next = new ListNode(3);
    l2.next.next = new ListNode(4);

    ListNode output = mergeTwoLists(l1,l2);
    while(output!=null)
    {
      System.out.print(output.val +"->");
      output = output.next;

    }
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

    ListNode dummy = new ListNode(-1);
    // Will make us of this later
    ListNode head = dummy;

    while(l1!=null && l2!=null)
    {
      if(l1.val<l2.val)
      {
        dummy.next = l1;
        l1 = l1.next;
      } else
      {
        dummy.next = l2;
        l2 = l2.next;
      }
      dummy = dummy.next;
    }

    // We need to add left over to dummy node

    if(l1!=null)
    {
      dummy.next = l1;
    }

    if(l2!=null)
    {
      dummy.next = l2;
    }

    head = head.next;

    return head;
  }


  public static class ListNode
  {

    int val;
    ListNode next=null;
    public ListNode(int val)
    {
      this.val = val;
    }
  }

}
