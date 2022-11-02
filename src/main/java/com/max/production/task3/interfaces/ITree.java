package com.max.production.task3.interfaces;

import com.max.production.task3.entities.TreeNode;

public interface ITree {
    TreeNode[] nodes = new TreeNode[0];

    public String getValue(TreeNode node);
    public String getColor(TreeNode node);
    public int getDepth(TreeNode node);
}
