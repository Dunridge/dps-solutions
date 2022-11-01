package com.max.production;

import com.max.production.task1.Singleton;
import com.max.production.task2.FoodFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // task 1
        Singleton singleton = Singleton.getSingleInstance();
        System.out.println("Singleton variable value: " + singleton.str);

        // task 2
        System.out.print("Enter the desired food type (cake or pizza): ");
        String foodType = scanner.nextLine();
        FoodFactory factory = new FoodFactory(foodType);

        // task 3
    }
}
