package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITree;

import java.util.Arrays;

public class Tree implements ITree {
    public int nNodes = 0;
    public TreeNode[] nodes;
    public String[] edges;

    public Tree(int nNodes,
                int[] nodesValues,
                int[] nodesColorCodes, // optimization: create a enum to map these colors to the values
                String[] edges) {
        this.nNodes = nNodes;
        this.nodes = new TreeNode[this.nNodes];
        this.edges = edges;

        for (int i = 0; i < nNodes; i++) {
            this.nodes[i] = new TreeNode(nodesValues[i], nodesColorCodes[i], i + 1);
        }

        this.findLeaves();
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
        int rootVertexNumber = 1;
        int distanceInEdges = 0;
        boolean rootReached = false;
        int currentlyProcessedVertex = node.vertexNumber;

        while(!rootReached) {

            for (int j = 0; j < this.edges.length; j++) {
                String currentEdge = this.edges[j];

                if (currentEdge.contains(Integer.toString(currentlyProcessedVertex))) {
                    int[] edgeNumbers = Arrays.stream(currentEdge.split(" ")).mapToInt(Integer::parseInt).toArray();
                    distanceInEdges++;
                    final int currentVertexN = currentlyProcessedVertex;
                    currentlyProcessedVertex = Arrays.stream(edgeNumbers).filter(n -> n != currentVertexN).toArray()[0];
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
