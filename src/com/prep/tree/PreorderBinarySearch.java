package com.prep.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 * Example 1:
 * Input: root = [1,null,2,3]
 * Output: [1,2,3]
 *
 * Example 2:
 * Input: root = []
 * Output: []
 *
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 *
 */
public class PreorderBinarySearch {

    public static void main(String[] args) {
        // Create Tree

        // [1,null,2,3]

        Tree valueTee = new Tree();
        valueTee.insert(3);

        Tree nodeTree = new Tree();
        TreeNode treeNode = new TreeNode(1);
        nodeTree.insertNode(treeNode);
//        TreeNode treeNodeNull = null;
//        nodeTree.insertNode(treeNodeNull);
        TreeNode treeNode2 = new TreeNode(2);
        nodeTree.insertNode(treeNode2);
        TreeNode treeNode3 = new TreeNode(3);
        nodeTree.insertNode(treeNode3);



        List<Integer> preorderList = preOrderBinaryTree(nodeTree.getRoot());

        for (int i = 0; i < preorderList.size(); i++) {
            System.out.println(" "+preorderList.get(i));
        }

    }

    // Preorder using stack, Iterative Solution
    public static List<Integer> preOrderBinaryTree(TreeNode root)
    {
     List<Integer> output = new ArrayList<>();
     Stack<TreeNode> treeNodeStack = new Stack<>();

     if (root==null)
     { return  output; }

     treeNodeStack.push(root);
     while (!treeNodeStack.empty())
     {
         TreeNode currentNode = treeNodeStack.pop();
         output.add(currentNode.getData());

         if (currentNode.getRightChild()!=null)
         {
             treeNodeStack.add(currentNode.getRightChild());
         }

         if (currentNode.getLeftChild()!=null)
         {
             treeNodeStack.add(currentNode.getLeftChild());
         }

     }

     return output;
    }

}
