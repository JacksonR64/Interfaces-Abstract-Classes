package org.example;

public class Lake extends Environment<Swimmable>{

    private final int MAXSPPED = 10;

    @Override
    public void checkTraffic() {
    }

    @Override
    public void addTraffic(Swimmable traffic) {
        super.addTraffic(traffic);
    }

    public int getMaxSpeed(){
        return MAXSPPED;
    }
}
