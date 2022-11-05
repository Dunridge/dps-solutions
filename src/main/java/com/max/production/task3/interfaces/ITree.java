package com.max.production.task3.interfaces;

import com.max.production.task3.entities.TreeNode;

public interface ITree {
    public int nNodes = 0;
    TreeNode[] nodes = new TreeNode[0];
    int[] nodesValues = new int[0];
    int[] nodesColorCodes = new int[0];
    String[] edges = new String[0];

    public int getValue(TreeNode node);
    public String getColor(TreeNode node);
    public int getDepth(TreeNode node);
}
