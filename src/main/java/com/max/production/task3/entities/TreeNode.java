package com.max.production.task3.entities;

import com.max.production.task3.interfaces.ITreeNode;

// technically you can bypass the usage of a class entirely and just use the interface
public class TreeNode implements ITreeNode {
    public String value;
    public String color = null;
    public int depth = 0;
}
