package org.example;

/*
Date: 01-13-2023
An example of object oriented design where the single parent class is an interface
 */

public class Main {
    public static void main(String[] args)
    {
        Shape shape = getShape();
        shape.draw();
    }

    public static Shape getShape() {
        int random = (int)(Math.random() * 3);

        if (random == 1)
            return new Triangle();
        else if (random == 2)
            return new Square();
        else if (random == 3)
            return new Rhombus();

        return null;
    }
}
