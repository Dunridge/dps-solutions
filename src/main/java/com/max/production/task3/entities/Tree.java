package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

import java.util.Arrays;

// implements the rooted tree
public class Tree implements ITree {
    public int nNodes = 0;
    TreeNode[] nodes;
    String[] edges; // TODO: add edges here (there's no class so the implementation will be here)

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
        this.edges = edges;

        System.out.println("The nodes after construction: ");
        for (int i = 0; i < nNodes; i++) {
            this.nodes[i] = new TreeNode(nodesValues[i], nodesColorCodes[i], i + 1);
        }

        System.out.println(this.nodes[0].vertexNumber);
        // System.out.println(this.getValue(this.nodes[0]));

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

//        System.out.println("edges: ");
//        for (int i = 0; i < edges.length; i++) {
//            System.out.println(this.edges[i]);
//        }

        // TODO: work on the edges
        // TODO: find the leaves of the tree here (and make an upcast for the node)
        // TODO: come up with the handling of the Edges (without creating a model)
        //      -- (~) add a hasSingleEdge (aka isLeaf) boolean to each vertex
        //      -- (~) add a string of the number of the vertex
        //      -- (~) flip the isLeaf boolean if the number of Strings where it's contained is 1

        // TODO: debug this
        System.out.println("leaves: ");
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
