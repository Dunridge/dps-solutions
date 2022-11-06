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
        //implement this

        // returns the sum of the leaves in the tree, which is 7 + 5 + 12 = 24

        System.out.println("SumInLeavesVisitor: " + sumOfLeaves);

        // TODO: add the logic where you'll upcast nodes to leaves
        // TODO: think whether you have to create edges class for the leaves

        return sumOfLeaves;
    }

    public void visitNode(TreeNode node) {
        node.isVisited = true;
    }

    public void visitLeaf(TreeLeaf leaf) {
        // TODO: this method might be redundant
        leaf.isVisited = true;
        //implement this
    }
}