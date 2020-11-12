package ru.example;

public class Human extends Animal{
    public void move() {
        System.out.println("Я умею ходить");
    }

    public void swim() {
        System.out.println("Я умею плавать");
    }

    public void сlimbTrees() {
        System.out.println("Я могу забарться на дерево");
    }

    public Human() {
        setVoice("Hi");
    }
    public Human(String name) {
        setName("Bob");
        setVoice("Hi");
    }
}
