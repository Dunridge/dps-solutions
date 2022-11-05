package com.max.production.task3.entities;

public class TreeLeaf extends TreeNode {

    public TreeLeaf(int value, int colorInt, int vertexNumber) {
        super(value, colorInt, vertexNumber);
        this.isVisited = true;
    }
}
