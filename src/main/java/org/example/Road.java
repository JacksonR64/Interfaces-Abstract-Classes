package org.example;

public class Road extends Environment<Drivable> {

    private final int MAXSPEED = 120;

    @Override
    public void checkTraffic() {
        for (Drivable drivable : traffic) {
            drivable.drive();
        }
    }

    int getMaxSpeed(){
        return MAXSPEED;
    }
}
