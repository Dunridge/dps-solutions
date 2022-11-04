package com.max.production;

import com.max.production.task1.Singleton;
import com.max.production.task2.FoodFactory;
import com.max.production.task3.VisitorSolution;

import java.util.Scanner;

/*

    // TODO: make the input as a txt file and submit this to your teacher in person

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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNumber;
        System.out.print("Enter the task number: ");
        taskNumber = scanner.nextInt();

        // TODO: read about enhanced switch in Java
        switch (taskNumber) {
            case 1 -> {
                System.out.println("task 1");
                Singleton singleton = Singleton.getSingleInstance();
                System.out.println("Singleton variable value: " + singleton.str);
            }

            case 2 -> {
                System.out.println("task 2");
                FoodFactory factory = new FoodFactory();
            }

            case 3 -> {
                System.out.println("task 3");
                VisitorSolution.run();
            }

            default -> System.out.println("There's no lab with this number");
        }
    }
}
