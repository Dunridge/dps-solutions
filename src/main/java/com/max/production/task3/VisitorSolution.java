package com.max.production.task3;

import com.max.production.task3.entities.Tree;
import com.max.production.task3.entities.TreeNode;
import com.max.production.task3.visitors.FancyVisitor;
import com.max.production.task3.visitors.ProductOfRedNodesVisitor;
import com.max.production.task3.visitors.SumInLeavesVisitor;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VisitorSolution {
    //  In this problem you must NOT generate any output on your own.

    /*
    Input:
    5 // number of nodes in the tree
    4 7 2 5 12 // each node contains a certain number as its value
    0 1 0 0 1 // each node's color: 0 - red, 1 - green
    1 2 // describes an edge connecting nodes 1 and 2
    1 3 // describes an edge connecting respective nodes
    3 4 // describes an edge connecting respective nodes
    3 5 // describes an edge connecting respective nodes

    Output:
    Do not print anything to stdout, as this is handled by locked stub code in the editor.
    The three getResult() methods provided for you must return an integer denoting the result
    for that class' visitor (defined above). Note that the value returned by ProductRedNodesVisitor's
    getResult method must be computed modulo 10^9 + 7:

    24
    40
    15
    */

    public static void run() {
        System.out.println("LR3 entered");
        TreeNode treeNode = VisitorSolution.solve();
//        System.out.println(treeNode.value);
    }

    // TODO: ditch the requirements altogether and do it here + send the teacher this lab
    public static TreeNode solve() {
        File file = new File("C:\\Users\\MAX\\IdeaProjects\\dps-solutions\\src\\main\\java\\com\\max\\production\\task3\\input\\input.txt");
        String content;

        try {
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            content = sc.next();
            String[] inputs = content.split("\\r?\\n");
            int nNodes = Integer.parseInt(inputs[0]);
            int[] nodesValues = Arrays.stream(inputs[1].split(" ")).mapToInt(Integer::parseInt).toArray();
            Arrays.stream(nodesValues).forEach(System.out::println);
            int[] nodesColorCodes = Arrays.stream(inputs[2].split(" ")).mapToInt(Integer::parseInt).toArray(); // leave unchanged
            LinkedList<String> edges = new LinkedList<String>();
            for (int i = 3; i < inputs.length; i++) {
                edges.push(inputs[i]);
            }

            Tree tree = new Tree(nNodes, nodesValues, nodesColorCodes, edges.toArray(new String[0]));

            // TODO: pass the tree to the functions
            SumInLeavesVisitor obj1 = new SumInLeavesVisitor();
            obj1.getResult(tree);

            ProductOfRedNodesVisitor obj2 = new ProductOfRedNodesVisitor();
            obj2.getResult(tree);

            FancyVisitor obj3 = new FancyVisitor();
            obj3.getResult(tree);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // TODO: read the tree from STDIN and return its root as a return value of this function
        TreeNode treeRootNode = new TreeNode(1, 1, 1); // replace later on

        return treeRootNode;
    }
}
