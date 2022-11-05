package com.max.production.task3.visitors;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeLeaf;
import com.max.production.task3.entities.TreeVis;
import com.max.production.task3.entities.TreeNode;

public class SumInLeavesVisitor extends TreeVis {
    Tree tree;

    public int getResult(Tree tree) {
        this.tree = tree;
        //implement this

        // returns the sum of the leaves in the tree, which is 7 + 5 + 12 = 24
        // TODO: add the logic where you'll upcast nodes to leaves
        // TODO: think whether you have to create edges class for the leaves

        return 0;
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