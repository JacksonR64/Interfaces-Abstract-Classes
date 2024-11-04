package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> extends Entities {

    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();
    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }


    public void checkVehicles(Environment<?> CurrentEnvironment) {
        for (T traffic : this.traffic) {
            if (traffic instanceof Vehicle){
                if (traffic instanceof  Drivable && CurrentEnvironment instanceof Road){
                ((Drivable) traffic).drive();
                }
                if (traffic instanceof Flyable && CurrentEnvironment instanceof Sky) {
                ((Flyable) traffic).fly();
                }
                if (traffic instanceof Swimmable  && CurrentEnvironment instanceof Water) {
                ((Swimmable) traffic).swim();
                }
            }
        }
    }
}
