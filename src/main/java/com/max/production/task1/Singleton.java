package com.max.production.task1;

// Singleton example
public class Singleton {
    // private field that refers to an object
    private static Singleton singletonObject = null;
    public String str;

    // a private constructor that restricts creating objects outside of the class.
    private Singleton() {
        str = "str";
    }

    // this method returns the reference to the only object of the class,
    // since the method static, it can be accessed using the class name
    public static Singleton getSingleInstance() {
        if (singletonObject == null) {
            singletonObject = new Singleton();
        }

        return singletonObject;
    }
}
