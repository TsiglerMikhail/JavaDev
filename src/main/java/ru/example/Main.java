package ru.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Tom");
        Dog dog = new Dog();
        Human man = new Human("Bob");

        cat.Speek();
        System.out.println(dog.Hungry());
        dog.eat();
        System.out.println(dog.Hungry());
        System.out.println(man.getName());
    }

}
