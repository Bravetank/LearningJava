package interface_example;

public class MountainBike implements Bicycle {

    int pedalRate = 0;
    int speed = 0;
    int gear = 1;


    //As implementing Bicycle interface must implement the methods

    @Override
    public void changePedalRate(int newValue) {
        pedalRate = newValue;

    }

    @Override
    public void changeGear(int newValue) {
        gear = newValue;

    }

    @Override
    public void speedUp(int increment) {
        speed += increment;

    }

    @Override
    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        System.out.println(
                "Pedal Rate: " + pedalRate +
                        " Speed: " + speed +
                        " Gear: " + gear
        );
    }
}
