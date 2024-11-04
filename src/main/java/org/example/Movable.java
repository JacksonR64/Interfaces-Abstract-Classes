package org.example;

public interface Movable{


    String emoji = "❤️";
    int[] getPosition();
    void setPosition(int[] newPosition);
    int getSpeed();  // Gets the speed of the entity
    int getDirection();

    void drive();
    default void move(){}



    default void tick(){
        int speed = getSpeed();
        int direction = getDirection();
        int[] position = getPosition();

        if (direction == 0){
            position[1] += speed;
            setPosition(position);
        }
        else if (direction == 90){
            position[0] += speed;
            setPosition(position);
        }
        else if (direction == 180){
            position[1] += speed;
            setPosition(position);
        }
        else if (direction == 270){
            position[0] += speed;

        }
        setPosition(position);

        System.out.println("Position - X: " + position[0] + " , Y: " + position[1]);

    }




    String getEmoji();
}
