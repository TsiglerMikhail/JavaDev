package ru.example;

/*
Модель должна отражать возможности этих животных издавать звуки, двигаться кушать, лазать по деревьям и плавать (поля + методы)
 */
public class Animal {
    private String name = "noname";
    private boolean canSpeek;
    private String sound;
    private boolean canMove;
    private boolean canClimbTrees;
    private boolean canSwim;
    private boolean hunger = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCanSpeek() {
        return canSpeek;
    }

    public void setCanSpeek(String sound) {
        this.canSpeek = true;
        this.sound = sound;
    }

    public void Speek(){
        if(canSpeek){
            System.out.println(sound);
        }
        else {
            System.out.println("...");
        }
    }

    public boolean isCanMove() {
        return canMove;
    }

    public void setCanMove(boolean canMove) {
        this.canMove = canMove;
    }

    public boolean isCanClimbTrees() {
        return canClimbTrees;
    }

    public void setCanClimbTrees(boolean canClimbTrees) {
        this.canClimbTrees = canClimbTrees;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim = canSwim;
    }

    public boolean Hungry() {
        return hunger;
    }

    public void eat() {
        this.hunger=false;
    }
}
