package ru.example;

public class Human extends Animal{
    public Human() {
        setCanSwim(true);
        setCanMove(true);
        setCanClimbTrees(true);
        setCanSpeek("Hi");
    }
    public Human(String name) {
        setName(name);
        setCanSwim(true);
        setCanMove(true);
        setCanClimbTrees(true);
        setCanSpeek("Hi");
    }
}
