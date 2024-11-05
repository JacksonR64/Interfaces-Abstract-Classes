package org.example;

public class Van extends Vehicle implements Drivable {
    @Override
    public int getDirection() {
        return 0;
    }

    @Override
    public int[] getPosition() {
        return new int[0];
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String getEmoji() {
        return "🚚";
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
    public void drive(){
        System.out.println("Van is driving full of lots of furniture");
    }
}
