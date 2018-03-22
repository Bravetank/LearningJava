package inheritance_practice;

import java.util.Scanner;

public class Circle extends Shape {
    //Does not need the Shape class member field as inherits them
    Scanner in = new Scanner(System.in);

    public Circle() {
        //Using super so the superclass variable & giving it the shapeName of "Circle"
        super("Circle");

    }

    public Circle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        System.out.println("Enter the radius:");
        double radius = in.nextInt();
        return Math.PI * Math.pow(radius, 2);

    }
}

