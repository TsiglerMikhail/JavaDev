package ru.example;

/*
Модель должна отражать возможности этих животных издавать звуки, двигаться кушать, лазать по деревьям и плавать (поля + методы)
 */
public class Animal {
    private String name = "noname";
    private String sound = "...";
    private boolean hunger = true;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVoice(String sound) {
        this.sound = sound;
    }

    public void Speek(){
        System.out.println(sound);
    }

    public boolean Hungry() {
        return hunger;
    }

    public void eat() {
        this.hunger=false;
    }
}
