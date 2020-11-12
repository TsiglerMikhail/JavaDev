package ru.example;

public class Cat extends Animal {
    public void move() {
        System.out.println("Я умею ходить");
    }

    public void сlimbTrees() {
        System.out.println("Я могу забарться на дерево");
    }


    public Cat() {
        setVoice("meow");
    }

    public Cat(String name) {
        setName(name);
        setVoice("meow");
    }
}
