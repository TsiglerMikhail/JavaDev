package ru.example;

public class Cat extends Animal {
    public Cat() {
        setCanMove(true);
        setCanClimbTrees(true);
        setCanSpeek("meow");
    }

    public Cat(String name) {
        setName(name);
        setCanMove(true);
        setCanClimbTrees(true);
        setCanSpeek("meow");
    }
}
