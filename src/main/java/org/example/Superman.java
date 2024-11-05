package org.example;

public class Superman extends Human implements Drivable, Swimmable, Flyable{
    @Override
    public void fly() {
        System.out.println("Look! Up in the sky! It’s a bird! It’s a plane! NO! It’s SuperMan!");
    }

    @Override
    public void drive() {
        System.out.println("SuperMan is driving, he must be in disguise");
    }

    @Override
    public void swim() {
        System.out.println("SuperMan is swimming to Atlantis to say hi to AquaMan");
    }

    @Override
    public void makeSound() {
        System.out.println("Superman shouts: \"Avengers, Assemble!!\" Wait... that's not right");
    }
}
