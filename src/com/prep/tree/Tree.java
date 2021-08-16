package com.prep.tree;


public class Tree
{

    public TreeNode getRoot() {
        return root;
    }

    private TreeNode root;

    // Insert items into tree

    public void insert(int value)
    {
        if (root==null)
        {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }



// Insert items into tree

    public void insertNode(TreeNode node)
    {
        if (root==null)
        {
            root = node;
        } else {
            root.insertNode(node);
        }
    }


    // Step 1 - We need to have root with value
    // Will add Left subtree node
    // Will add right subtree node
    //

    // Delete items from tree

    // Traverse the tree
    // Preorder - Root->Left Subtree->RightSubtree
    // Inorder - Left Subtree -> Root -> RightSubtree
    // PostOrder - Left Subtree -> Right Subtree -> Root




}
