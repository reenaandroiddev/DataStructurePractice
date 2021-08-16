package com.prep.tree.invertTree;

import com.prep.tree.TreeNode;

/**
 * Invert the Binary Tree
 * Problem Description
 * <p>
 * Given a binary tree A, invert the binary tree and return it.
 * <p>
 * Inverting refers to making left child as the right child and vice versa.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= size of tree <= 100000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is the head of the tree A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the head of the inverted tree.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * <p>
 * 1
 * /   \
 * 2     3
 * Input 2:
 * <p>
 * <p>
 * 1
 * /   \
 * 2     3
 * / \   / \
 * 4   5 6   7
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * <p>
 * 1
 * /   \
 * 3     2
 * Output 2:
 * <p>
 * <p>
 * 1
 * /   \
 * 3     2
 * / \   / \
 * 7   6 5   4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Tree has been inverted.
 * Explanation 2:
 * <p>
 * Tree has been inverted.
 */

public class InvertTree {

  public static void main(String[] args) {

    TreeNode treeNode = new TreeNode(1);
    treeNode.setLeftChild(new TreeNode(2));
    treeNode.setLeftChild(new TreeNode(3));

    System.out.println(invertTree(treeNode).getData());

  }

  public static TreeNode invertTree(TreeNode node) {
    if (node == null)
      return node;

    TreeNode left = invertTree(node.getLeftChild());
    TreeNode right = invertTree(node.getRightChild());
    node.setLeftChild(right);
    node.setRightChild(left);


    return node;
  }
}
