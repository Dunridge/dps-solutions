package com.max.production.task2.entitities;

import com.max.production.task2.enums.FoodType;
import com.max.production.task2.interfaces.IFood;

public class Pizza implements IFood {
    private FoodType type = FoodType.Pizza;

    @Override
    public String getType() {

        return this.type.toString();
    }

    @Override
    public String getMessage() {
        return "Someone ordered Fast Food!";
    }
}
