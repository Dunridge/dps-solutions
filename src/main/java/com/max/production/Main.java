package com.max.production;

import com.max.production.task1.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleInstance();
        System.out.println("Singleton variable value: " + singleton.str);
    }
}
