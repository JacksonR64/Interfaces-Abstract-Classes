package org.example;

public interface Drivable extends Movable{
    @Override
    int getDirection();

    @Override
    int[] getPosition();

    @Override
    int getSpeed();

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
    default void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");
    }
}
