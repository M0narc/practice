package com.company;

public class Main {

    public static void main(String[] args) {

        Animal animal1= new Animal("Animal",1,1,5,100);
        System.out.println(animal1.getName());

        Dog Dog = new Dog("salchicha",8,20,2,4,1,20,36,1,"short and cool");
        Dog.eat();
        Dog.walk();
        Dog.run();

    }
}
