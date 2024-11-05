package org.example;

public class Duck extends Bird implements Swimmable {

    public String emoji = "🦆";


    @Override
    public void drive() {}

    @Override
    public int getSpeed() {
        return 0;
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
        super.move();
    }

    @Override
    public void setPosition(int[] newPosition) {}

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void swim() {
        Swimmable.super.swim();
    }

    public String getEmoji() {
        return this.emoji;
    }
}
