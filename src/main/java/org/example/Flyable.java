package org.example;

public interface Flyable {
    default void fly(){
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }
}
