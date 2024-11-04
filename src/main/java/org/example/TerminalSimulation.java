package org.example;

import java.util.ArrayList;
import java.util.List;

public class TerminalSimulation {
    private static final int GRID_WIDTH = 20;
    private static final int GRID_HEIGHT = 10;

    public static void main(String[] args) {
        // Initialize the list of movable objects
        List<Movable> movables = new ArrayList<>();

        // Add objects (Assume classes like Duck and Car implement Movable)
        movables.add(new Duck());
        movables.add(new Car());
        // Add more Movable instances as needed

        // Main simulation loop
        while (true) {
            clearScreen();
            int line = 1;

            for (Movable movable : movables) {
                movable.tick(); // Move the object based on its speed and direction
                int[] pos = movable.getPosition();
                printObject(movable.getEmoji(), line, pos[0]);
                line++; // Move to next line for each object
            }

            sleep(1000); // Wait 1 second between each tick
        }
    }

    // Clears the screen in the terminal
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    // Prints the object at a specified line and horizontal position
    private static void printObject(String emoji, int line, int xPosition) {
        System.out.printf("\033[%d;%dH%s\n", line, xPosition + 1, emoji);
    }

    // Simple sleep method to add delay between ticks
    private static void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
