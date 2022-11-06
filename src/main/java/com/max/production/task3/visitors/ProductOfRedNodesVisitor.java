package com.max.production.task3.visitors;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeLeaf;
import com.max.production.task3.entities.TreeNode;
import com.max.production.task3.entities.TreeVis;

public class ProductOfRedNodesVisitor extends TreeVis {

    public int getResult(Tree tree) {
        // Creates a ProductOfRedNodesVisitor object whose getResult method
        // returns the product of the red nodes, which is 4 * 2 * 5 = 40.
        // 0 - red, 1 - green // possible optimization: create a enum for this

        int product = 1;
        for (int i = 0; i < tree.nodes.length; i++) {
            if (tree.nodes[i].colorInt == 0) {
                product *= tree.nodes[i].value;
            }
        }

        return product;
    }

    public void visitNode(TreeNode node) {
    }

    public void visitLeaf(TreeLeaf leaf) {
    }
}
