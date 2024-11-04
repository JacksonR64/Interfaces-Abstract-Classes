package org.example;

public class Pigeon extends Bird {
    @Override
    public void drive() {

    }

    @Override
    public int getDirection() {
        return 0;
    }

    @Override
    public int[] getPosition() {
        return new int[0];
    }

    @Override
    public String getEmoji() {
        return "🦤";
    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void setPosition(int[] newPosition) {

    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void makeSound() {
        super.makeSound();
    }
}
