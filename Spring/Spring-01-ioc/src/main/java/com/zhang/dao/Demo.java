package com.zhang.dao;

public class Demo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal cat1 = new Cat();
        Cat cat2 = new Cat();
        AnimalTools.useAnimal(cat1);

        Dog dog = new Dog();
        AnimalTools.useAnimal(dog);

    }
}
