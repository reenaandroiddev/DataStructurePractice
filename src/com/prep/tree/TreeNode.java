package com.prep.tree;

public class TreeNode {
    int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    // Root value will be inserted through constructor
    public TreeNode(int data) {
        this.data = data;
    }

    // Recursion insertion
    public void insert(int value) {
        if (value == data)
            return;

        if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    // Recursion insertion
    public void insertNode(TreeNode node) {
        if(node==null)
        {
            return;
        }
        if (node.getData() == data)
            return;

        if (node.getData() < data) {
            if (leftChild == null) {
                leftChild = node;
            }
        } else {
            if (rightChild == null) {
                rightChild = node;
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
