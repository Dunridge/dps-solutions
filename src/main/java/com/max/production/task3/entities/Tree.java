package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

import java.util.Arrays;

// implements the rooted tree
public class Tree implements ITree {
    public int nNodes = 0;
    TreeNode[] nodes;

    // TODO: these will go into nodes
    int[] nodesValues;
    int[] nodesColorCodes;

    String[] edges;
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

        this.nNodes = nNodes;
        this.nodes = new TreeNode[this.nNodes];

        System.out.println("The nodes after construction: ");
        for (int i = 0; i < nNodes; i++) {
            this.nodes[i] = new TreeNode(nodesValues[i], nodesColorCodes[i]);
        }
//        System.out.println(this.getValue(this.nodes[0]));


        // TODO: find the leaves of the tree here (and make an upcast)


        // TODO: work on the edges


    }

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
