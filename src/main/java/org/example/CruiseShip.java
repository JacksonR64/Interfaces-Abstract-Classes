package org.example;

public class CruiseShip extends Boat{
    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is cruising the Atlantic, Looks fun!");
    }
}
