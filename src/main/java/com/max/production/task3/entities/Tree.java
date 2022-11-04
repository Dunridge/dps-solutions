package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

import java.util.Arrays;

// implements the rooted tree
public class Tree implements ITree {
    public int nNodes = 0;
    TreeNode[] nodes;
    // TODO: add edges here
    //  (there's no class so the implementation will be here)

    // TODO: enter these into the model
    // TODO: come up with the handling of the Edges
    public Tree(int nNodes,
                int[] nodesValues,
                int[] nodesColorCodes, // TODO: create a enum to map these colors to the values
                String[] edges) {
        System.out.println("Entered tree");
        System.out.println(nNodes);
        Arrays.stream(nodesValues).forEach(System.out::println);
        Arrays.stream(nodesColorCodes).forEach(System.out::println);
        System.out.println("edges");
        Arrays.stream(edges).forEach(System.out::println);
    }

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
