package org.example;

public class Car extends Vehicle implements Drivable {

    String emoji = "🚙";

    @Override
    public int getDirection() {
        return 0;
    }

    @Override
    public int[] getPosition() {
        return new int[0];
    }

    @Override
    public void move() {
        Drivable.super.move();
    }

    @Override
    public void setPosition(int[] newPosition) {

    }

    @Override
    public void tick() {
        Drivable.super.tick();
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void drive() {
        Drivable.super.drive();
    }

    @Override
    public String getEmoji() {
        return emoji;
    }
}
