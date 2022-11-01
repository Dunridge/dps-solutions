package com.max.production.task2.interfaces;

public interface IFoodFactory {
    IFood food = null;
    IFood getFood(String type);
}
