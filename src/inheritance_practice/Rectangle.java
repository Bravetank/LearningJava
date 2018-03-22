package inheritance_practice;

import java.util.Scanner;

public class Rectangle extends Shape {

    Scanner in = new Scanner(System.in);

    public Rectangle() {
        super("Rectangle");
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double calculateArea() {
        System.out.println("Enter the length:");
        double length = in.nextInt();
        System.out.println("Enter the width:");
        double width = in.nextInt();
        return width * length;

    }
}
