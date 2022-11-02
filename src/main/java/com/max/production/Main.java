package com.max.production;

import com.max.production.task1.Singleton;
import com.max.production.task2.FoodFactory;
import com.max.production.task3.VisitorSolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int taskNumber;
        System.out.println("Enter the task number:");
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
                // TODO: define the task according to the requirements
                System.out.println("task 3");
                System.out.println(VisitorSolution.solve());
                // Tip: you can add a dot at the end of any statement and type sout to print that statement in IDEA
            }

            default -> System.out.println("There's no lab with this number");

        }
    }
}
