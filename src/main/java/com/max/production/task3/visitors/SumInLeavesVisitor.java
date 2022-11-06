package com.max.production.task3.visitors;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeLeaf;
import com.max.production.task3.entities.TreeVis;
import com.max.production.task3.entities.TreeNode;

import java.util.Arrays;

public class SumInLeavesVisitor extends TreeVis {

    public int getResult(Tree tree) {
        int sumOfLeaves = Arrays.stream(tree.nodes)
                .filter(node -> node.isLeaf)
                .mapToInt(node -> node.value)
                .sum();

        return sumOfLeaves;
    }

    public void visitNode(TreeNode node) {
        node.isVisited = true;
    }

    public void visitLeaf(TreeLeaf leaf) {
        leaf.isVisited = true;
    }
}