package com.max.production.task2.interfaces;

import com.max.production.task2.enums.FoodType;

public interface IFood {
    FoodType type = null;
    String getType();
    String getMessage();
}
