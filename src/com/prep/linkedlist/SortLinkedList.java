package com.prep.linkedlist;

public class SortLinkedList {

  public static void main(String[] args) {
    SortLinkedList linkedList = new SortLinkedList();

//    [4,2,1,3]
    ListNode head = new ListNode(4);
    head.next = new ListNode(2);
    head.next.next = new ListNode(1);
    head.next.next.next = new ListNode(3);

    ListNode node = linkedList.sortList(head);

    while (node!=null)
    {
      System.out.print("->"+node.val);
      node = node.next;
    }
  }
    public ListNode sortList(ListNode head) {
      if (head == null || head.next == null)
        return head;
      ListNode mid = getMid(head);
      ListNode left = sortList(head);
      ListNode right = sortList(mid);
      return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
      ListNode dummyHead = new ListNode();
      ListNode tail = dummyHead;
      while (list1 != null && list2 != null) {
        if (list1.val < list2.val) {
          tail.next = list1;
          list1 = list1.next;
          tail = tail.next;
        } else {
          tail.next = list2;
          list2 = list2.next;
          tail = tail.next;
        }
      }
      tail.next = (list1 != null) ? list1 : list2;
      return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
      ListNode midPrev = null;
      while (head != null && head.next != null) {
        midPrev = (midPrev == null) ? head : midPrev.next;
        head = head.next.next;
      }
      ListNode mid = midPrev.next;
      midPrev.next = null;
      return mid;

    }



}
