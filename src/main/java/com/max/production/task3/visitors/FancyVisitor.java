package com.max.production.task3.visitors;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeLeaf;
import com.max.production.task3.entities.TreeNode;
import com.max.production.task3.entities.TreeVis;

import java.util.Arrays;

public class FancyVisitor extends TreeVis {

    public int getResult(Tree tree) {
        // the example calculation in the problem is incorrect
        int sumInNonLeafNodes = Arrays.stream(tree.nodes)
                .filter(node -> !node.isLeaf)
                .filter(node -> tree.getDepth(node) % 2 == 0) // possible optimization: add the logic for depth variable initialization
                .mapToInt(node -> node.value)
                .sum();

        int sumOfGreenLeafNodes = Arrays.stream(tree.nodes)
                .filter(node -> node.isLeaf)
                .filter(node -> node.colorInt == 1) // green nodes
                .mapToInt(node -> node.value)
                .sum();

        int res = Math.abs(sumInNonLeafNodes - sumOfGreenLeafNodes);

        // sum of the values of non-leaf nodes at even depth
        // the sum of the values of green leaf nodes
        // |4 - (7 + 12)| = 15

        return res;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
    }
}
