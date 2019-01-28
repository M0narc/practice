package com.company;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int sizeM;
    private int weight;

    public Animal(String name, int brain, int body, int sizeM, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.sizeM = sizeM;
        this.weight = weight;
    }

    public void eat () {
        System.out.println("animal.eat () call");

    }
    public void move (int speed) {
        System.out.println("Animal.move called. Animal was moving at " + speed);

    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSizeM() {
        return sizeM;
    }

    public int getWeight() {
        return weight;
    }
}
