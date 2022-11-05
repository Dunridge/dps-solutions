package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

import java.util.Arrays;

// implements the rooted tree
public class Tree implements ITree {
    public int nNodes = 0;
    TreeNode[] nodes;
    String[] edges;

    public Tree(int nNodes,
                int[] nodesValues,
                int[] nodesColorCodes, // TODO: create a enum to map these colors to the values
                String[] edges) {
        System.out.println("Entered tree");
//        System.out.println(nNodes);
//        Arrays.stream(nodesValues).forEach(System.out::println);
//        Arrays.stream(nodesColorCodes).forEach(System.out::println);
//        System.out.println("edges");
//        Arrays.stream(edges).forEach(System.out::println);

        this.nNodes = nNodes;
        this.nodes = new TreeNode[this.nNodes];
        this.edges = edges;

        for (int i = 0; i < nNodes; i++) {
            this.nodes[i] = new TreeNode(nodesValues[i], nodesColorCodes[i], i + 1);
        }

        this.findLeaves();

        System.out.println("leaves");
        Arrays.stream(this.nodes).forEach(node -> {
            if (node.isLeaf) {
                System.out.println(node.vertexNumber);
            }
        });

    }

    // TODO: find out whether Java has the feature of any and add it here
    public void testPrintArr() {

    }

    @Override
    public void findLeaves() {
        Arrays.stream(this.nodes).forEach(node -> {
            boolean hasSingleEdge = false;
            int nTimesContained = 0;

            for (String edge : edges) {
                if (edge.contains(Integer.toString(node.vertexNumber))) {
                    nTimesContained++;
                }
            }

            // TODO: modify here if you need to include the root
            hasSingleEdge = nTimesContained == 1;

            if (hasSingleEdge) {
                node.isLeaf = true;
            }
        });
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
