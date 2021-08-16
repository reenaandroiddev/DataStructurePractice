package com.prep.linkedlist;

public class SingleLinkeListNode {

    int value;
    SingleLinkeListNode next;

    public SingleLinkeListNode(int value) {
        this.value = value;
    }

    public SingleLinkeListNode(int value, SingleLinkeListNode next) {
        this.value = value;
        this.next = next;
    }
}
