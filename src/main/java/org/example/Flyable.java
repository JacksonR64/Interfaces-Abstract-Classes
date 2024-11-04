package org.example;

public interface Flyable extends Movable {
    @Override
    void drive();

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

    default void fly(){

        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
