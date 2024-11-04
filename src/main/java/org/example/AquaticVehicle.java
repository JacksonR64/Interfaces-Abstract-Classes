package org.example;

public class AquaticVehicle extends Vehicle implements Swimmable{

    String emoji = "⛵️";

    @Override
    public void drive() {

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
    public int getDirection() {
        return 0;
    }

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public void move() {
        Swimmable.super.move();
    }

    @Override
    public void tick() {
        Swimmable.super.tick();
    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is zooming through the water!");
    }
}
