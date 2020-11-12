package ru.example;

public class Dog extends Animal{

    public void move() {
        System.out.println("Я умею ходить");
    }

    public void swim() {
        System.out.println("Я умею плавать");
    }

    public Dog() {
        setVoice("woof");
    }
    public Dog(String name) {
        setName(name);
        setVoice("woof");
    }
}
