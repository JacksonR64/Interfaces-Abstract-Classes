package org.example;

public class Aeroplane extends Vehicle implements Flyable{

     public void move() {
        super.move();

    }

    @Override
    public void fly() {
        Flyable.super.fly();
        System.out.println("Plane is flying");
    }
}

