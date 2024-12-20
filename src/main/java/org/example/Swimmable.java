package org.example;

public interface Swimmable extends Movable{
    @Override
    int getDirection();

    @Override
    int[] getPosition();

    @Override
    default void move() {
        Movable.super.move();
    }

    @Override
    void setPosition(int[] newPosition);

    @Override
    default void tick() {
        Movable.super.tick();
    }

    @Override
    int getSpeed();

    default void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
}
