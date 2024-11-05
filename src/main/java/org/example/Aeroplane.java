package org.example;

public class Aeroplane extends Vehicle implements Flyable, Drivable {

    String emoji = "✈️";

    @Override
    public int getDirection() {
        return 0;
    }

    @Override
    public void move() {
        Flyable.super.move();
    }

    @Override
    public void tick() {
        Flyable.super.tick();
    }

    @Override
    public int[] getPosition() {
        return new int[0];
    }

    @Override
    public void setPosition(int[] newPosition) {

    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public void fly() {
        Flyable.super.fly();
    }

    @Override
    public void drive() {
        System.out.println("Aeroplane is being driven, Get that plane out the road!");
    }
}
