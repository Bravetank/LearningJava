package inheritance_practice;

public class Main {
    public static void main(String[] args) {

        //NB have to use the superclass to instantiate it in terms of type but what you are instantiating with new is Circle or Rectangle
        Shape coin = new Circle("coin");
        System.out.println("The area of the coin is " + coin.calculateArea());

        Shape mat = new Rectangle();
        //Gives it the name mat if I don't give it a name
        System.out.println("The area of the mat is " + mat.calculateArea());

    }
}
