package org.example;

public class Water extends Environment<Swimmable> {

    private final int MAXSPEED = 80;

    @Override
    public void checkTraffic() {
        for (Swimmable swimmable : traffic) {
            swimmable.swim();
        }
    }

    public int getMaxSpeed(){
        return MAXSPEED;
    }
}
