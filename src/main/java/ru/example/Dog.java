package ru.example;

public class Dog extends Animal{
    public Dog() {
        setCanMove(true);
        setCanSwim(true);
        setCanSpeek("woof");
    }
    public Dog(String name) {
        setName(name);
        setCanMove(true);
        setCanSwim(true);
        setCanSpeek("woof");
    }
}
