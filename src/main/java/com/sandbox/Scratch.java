package com.sandbox;
/**
 * @author John L
 */
import java.util.Arrays;

class Scratch {
    public static void main(String[] args) throws NoSuchFieldException {
        Cat cat = new Cat(); // Cat instance
        Class<Cat> catClass = Cat.class; // Class<?> instance representing Cat class
        System.out.println(Arrays.toString(catClass.getDeclaredFields()));
    }
}
class Cat {
    static String sound = "meow";
}