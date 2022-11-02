package com.max.production.task2;

import com.max.production.task2.entitities.Cake;
import com.max.production.task2.entitities.Pizza;
import com.max.production.task2.enums.FoodType;
import com.max.production.task2.interfaces.IFood;
import com.max.production.task2.interfaces.IFoodFactory;

import java.util.Scanner;

public class FoodFactory implements IFoodFactory {
    public IFood food;
    public String foodType;
    public Scanner scanner = new Scanner(System.in);

    public FoodFactory() {
        System.out.print("Enter the desired food type (cake or pizza): ");
        this.foodType = this.scanner.nextLine();
        this.food = this.getFood(this.foodType);
        System.out.println("The factory returned class " + this.food.getType());
        System.out.println(this.food.getMessage());
    }

    @Override
    public IFood getFood(String type) {

        if(type.equals(FoodType.Pizza.toString().toLowerCase())) {
            return new Pizza();
        } else {
            return new Cake();
        }
    }
}
