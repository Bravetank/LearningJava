package interface_example;

public class BicycleMain {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike();
        System.out.println("Original values:");
        bike.printStates();
        bike.changePedalRate(2);
        bike.speedUp(3);
        bike.changeGear(2);
        System.out.println("Updated values:");
        bike.printStates();
    }
}
