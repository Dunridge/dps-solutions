package com.max.production.task3.visitors;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeLeaf;
import com.max.production.task3.entities.TreeVis;
import com.max.production.task3.entities.TreeNode;

public class SumInLeavesVisitor extends TreeVis {

    public int getResult(Tree tree) {
        //implement this
        return 0;
    }

    public void visitNode(TreeNode node) {
        node.isVisited = true;
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}