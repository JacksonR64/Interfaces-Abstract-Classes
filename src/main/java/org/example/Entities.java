package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Entities {
    // This will hold every instance of Entities or its subclasses
    public static List<Entities> entitiesList = new ArrayList<>();

    // Constructor that automatically adds any entity to the global list
    public Entities() {
        entitiesList.add(this);  // 'this' refers to the current instance
    }

    // Getter for the entitiesList
    public static List<Entities> getEntitiesList() {
        return entitiesList;
    }

    // Optionally, a method to print all entities
    public static void printAllEntities() {
        System.out.println("All entities:");
        for (Entities entity : entitiesList) {
            System.out.println(entity.getClass().getSimpleName());;
        }
    }
}
