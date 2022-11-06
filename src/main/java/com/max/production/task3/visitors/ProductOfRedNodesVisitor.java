package com.max.production.task3.visitors;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeLeaf;
import com.max.production.task3.entities.TreeVis;
import com.max.production.task3.entities.TreeNode;

import java.util.Arrays;

public class ProductOfRedNodesVisitor extends TreeVis {

    public int getResult(Tree tree) {
        // Creates a ProductOfRedNodesVisitor object whose getResult method
        // returns the product of the red nodes, which is 4 * 2 * 5 = 40.

        // 0 - red, 1 - green // TODO: create a enum for this

        int product = 1;
        for (int i = 0; i < tree.nodes.length; i++) {
            if (tree.nodes[i].colorInt == 0) {
                product *= tree.nodes[i].value;
            }
        }

        System.out.println("ProductOfRedNodesVisitor: " + product);

        //implement this
        return product;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        //implement this
    }
}
