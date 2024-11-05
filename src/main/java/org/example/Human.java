package org.example;

public class Human extends Animal implements Swimmable, Flyable, Drivable{

    String emoji = "🧍‍♂️";
    int X;
    int Y;
    int[] position = new int[2];
    int speed = 10;
    int direction = 90;

    @Override
    public void drive() {
        System.out.println("Boring Default Human is am going for a long drive");
    }

    public Human() {
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void tick() {
        Swimmable.super.tick();
    }

    @Override
    public void setPosition(int[] newPosition) {position = newPosition;}

    @Override
    public void move() {
        Swimmable.super.move();
    }

    @Override
    public int[] getPosition() {return position;}

    @Override
    public int getDirection() {
        return direction;
    }

    @Override
    public void swim() {
        System.out.println("Boring Default Human is am going for a dip");
    }

    @Override
    public void fly() {
        System.out.println("Boring Default Human is Flying on an airplane");
    }

    @Override
    public void makeSound() {
        System.out.println("Boring Default Human is talking loudly on the phone");
    }

    @Override
    public String getEmoji() {
        return emoji;
    }
}
