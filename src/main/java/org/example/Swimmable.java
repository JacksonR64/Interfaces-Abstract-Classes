package org.example;

public interface Swimmable {
    default void swim(){
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }
}
