package org.example;

public class Batmobile extends AquaticVehicle implements Drivable, Flyable{
    @Override
    public void drive() {
        System.out.print("WOAH! did you jus that! The ");
        Drivable.super.drive();
        System.out.print("   - Wait it TRANSFORMED!! 🤯\n");
    }

    @Override
    public void fly() {
        System.out.print("WOAH! did you jus that! The ");
        Flyable.super.fly();
        System.out.print("   - Wait it TRANSFORMED!! 🤯\n");
    }

    @Override
    public int getSpeed() {
        return super.getSpeed();
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
    public void setPosition(int[] newPosition) {

    }

    @Override
    public void tick() {
        super.tick();
    }

    @Override
    public void swim() {
        System.out.print("WOAH! did you jus that! The ");
        super.swim();
        System.out.print("   - Wait it TRANSFORMED!! 🤯\n");
    }




}
