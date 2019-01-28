package com.company;

public class fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public fish(String name, int sizeM, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, sizeM, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest (){

    }
    private void moveMuscle (){

    }
    private void moveBackFin() {

    }
    private void swim (){
        moveMuscle();
        moveBackFin();
        super.move(1);
    }
}

