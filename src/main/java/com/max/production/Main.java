package com.max.production;

import com.max.production.task1.Singleton;
import com.max.production.task2.FoodFactory;
import com.max.production.task3.VisitorSolution;

import java.util.Scanner;

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
