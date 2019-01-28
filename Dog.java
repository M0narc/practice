package com.company;

public class Dog extends Animal {
    //use extends to BRING another class
    private int legs;
    private int eyes;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int sizeM, int weight,int legs, int eyes, int tail, int teeth, String coat) {
        super(name, brain, body, sizeM, weight);
        // you can remove variables at any given time and put a 1
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
        this.teeth =teeth;
        this.coat = coat;
    }

    private void chew (){
        System.out.println("Dog.chew () call");
    }
// you can override a method from another class
    @Override
    public void eat() {
        System.out.println("Dog.eat () called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk () called");
        move(5);
    }
    public void run (){
        System.out.println("Dog.run () called");
        move(20);
    }

}
