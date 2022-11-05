package com.max.production.task3.entities;

public class TreeLeaf extends TreeNode {

    public TreeLeaf(int value, int colorInt) {
        super(value, colorInt);
        this.isVisited = true;
    }
}
