package org.example;

public class Sky extends Environment<Flyable> {

    private final int MAXSPEED = 250;

    @Override
    public void checkTraffic() {
        for (Flyable flyable : traffic) {
            flyable.fly();
        }
    }

    public int getMaxSpeed(){
        return MAXSPEED;
    }
}
