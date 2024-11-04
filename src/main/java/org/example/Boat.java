package org.example;

public class Boat extends AquaticVehicle{
    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is sailing!");
    }
}
