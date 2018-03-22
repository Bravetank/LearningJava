package inheritance_practice;

public abstract class Shape {
    private String shapeName;
    private double area;

    public Shape() {
        shapeName = "Shape";
        area = 0;
    }

    public Shape(String shapeName) {
        this.shapeName = shapeName;
        area = 0;
    }

    public Shape(String shapeName, double area) {
        this.shapeName = shapeName;
        this.area = area;
    }

    //As abstract class with have an empty method calculateArea
    //Must be implemented by any subclass that extends this class

    public abstract double calculateArea();

}

