package com.max.production;

import com.max.production.task1.Singleton;
import com.max.production.task2.FoodFactory;
import com.max.production.task3.VisitorSolution;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task 1
        System.out.println("task 1");
        Singleton singleton = Singleton.getSingleInstance();
        System.out.println("Singleton variable value: " + singleton.str);

        // task 2
        System.out.println("task 2");
        System.out.print("Enter the desired food type (cake or pizza): ");
        String foodType = scanner.nextLine();
        FoodFactory factory = new FoodFactory(foodType);

        // task 3
        // TODO: define the task according to the requirements
        System.out.println("task 3");
        System.out.println(VisitorSolution.solve());
        // Tip: you can add a dot at the end of any statement and type sout to print that statement in IDEA
    }
}
