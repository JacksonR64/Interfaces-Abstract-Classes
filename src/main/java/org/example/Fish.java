package org.example;

public class Fish extends Animal implements Swimmable {

    String emoji = "🐟";

    @Override
    public void drive() {

    }

    @Override
    public void makeSound() {
        super.makeSound();
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
    public void move() {
        Swimmable.super.move();
    }

    @Override
    public void setPosition(int[] newPosition) {

    }

    @Override
    public String getEmoji() {
        return emoji;
    }

    @Override
    public void tick() {
        Swimmable.super.tick();
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }
}
