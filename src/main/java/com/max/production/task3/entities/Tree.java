package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

// implements the rooted tree
public class Tree implements ITree {
    public int nNodes = 0;
    TreeNode[] nodes;
    // TODO: add edges here
    //  (there's no class so the implementation will be here)

    // TODO: learn the value inside of the node
    // Returns the value stored in the node.
    @Override
    public int getValue(TreeNode node) {

        return node.value;
    }

    @Override
    public String getColor(TreeNode node) {

        return node.color;
    }

    @Override
    public int getDepth(TreeNode node) {
        //  depth of a node is the number of edges between the node and the tree's root
        return node.depth;
    }
}
