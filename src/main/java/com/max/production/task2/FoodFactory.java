package com.max.production.task2;

import com.max.production.task2.entitities.Cake;
import com.max.production.task2.entitities.Pizza;
import com.max.production.task2.enums.FoodType;
import com.max.production.task2.interfaces.IFood;
import com.max.production.task2.interfaces.IFoodFactory;

public class FoodFactory implements IFoodFactory {
    public IFood food;
    
    public FoodFactory(String foodType) {
        this.food = this.getFood(foodType);
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
