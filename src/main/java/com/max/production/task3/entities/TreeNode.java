package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITreeNode;

// technically you can bypass the usage of a class entirely and just use the interface
public class TreeNode implements ITreeNode {
    public int value = 0;
    public int colorInt = 0;
    public String color = null;
    public boolean isLeaf = false;
    public boolean isVisited = false;

    public int depth = 0;

    public TreeNode(int value, int colorInt) {
        // TODO: consider creating edges
    }
}
