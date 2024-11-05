package org.example;

import javax.lang.model.type.NullType;
import java.util.ArrayList;
import java.util.List;

public class Person extends Human {


    String name;
    int age;
    String gender;
    Boolean hasLicence = false;
    int speed;


    public Person() {
        this.name = "unknown";
        this.age = 0;
        this.gender = "unknown";
        this.hasLicence = false;
        this.speed = 1;
    }


    public Person(String name, int age, String gender, Boolean hasLicence, int speed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hasLicence = hasLicence;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int speed) {
        super();
    }





    @Override
    public void drive() {
        if (hasLicence) System.out.println(name + " is driving is their car to work 🚙");
        else System.out.println(name + " called a taxi as they can't drive 🚕");
    }

    @Override
    public void swim() {
        System.out.println(name + " ");
        super.swim();
    }

    @Override
    public void fly() {
        System.out.println(name + " is going on holiday");
    }

    @Override
    public void makeSound() {
        System.out.println(name.toUpperCase() + " says: \"Hi im " + name + ", i am a " + age + " year old " + gender);
    }

}
