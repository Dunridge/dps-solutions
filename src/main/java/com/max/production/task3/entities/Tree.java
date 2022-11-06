package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Set;

// Tasks
// task 1 (~)
// task 2 (~)
// task 3 (...)


// implements the rooted tree
public class Tree implements ITree {
    public int nNodes = 0;
    public TreeNode[] nodes;
    public String[] edges;

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

    // getDepth(): Returns the depth of the node.
    // Recall that the depth of a node is the number
    // of edges between the node and the tree's root,
    // so the tree's root has depth 0 and each descendant
    // node's depth is equal to the depth of its parent
    // node +1.
    // TODO: run this for every node in constructor
    @Override
    public int getDepth(TreeNode node) {
        int rootVertexNumber = 1;
        int distanceInEdges = 0;
        boolean rootReached = false;
        int currentlyProcessedVertex = node.vertexNumber;

        while(!rootReached) {

            for (int j = 0; j < this.edges.length; j++) {
                String currentEdge = this.edges[j];

                if (currentEdge.contains(Integer.toString(currentlyProcessedVertex))) {
                    System.out.println(currentEdge);
                    int[] edgeNumbers = Arrays.stream(currentEdge.split(" ")).mapToInt(Integer::parseInt).toArray();
                    System.out.println("edgeNs: " + edgeNumbers[0] + edgeNumbers[1]);
                    distanceInEdges++;
                    final int currentVertexN = currentlyProcessedVertex;
                    currentlyProcessedVertex = Arrays.stream(edgeNumbers).filter(n -> n != currentVertexN).toArray()[0];
                    System.out.println("vertex on the other end: " + currentlyProcessedVertex);
                }
            }

            if (currentlyProcessedVertex == rootVertexNumber) {
                rootReached = true;
            }
        }

        node.depth = distanceInEdges;

        return node.depth;
    }
}
