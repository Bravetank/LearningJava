package inheritance_interfaces_abstract;


import inheritance_interfaces_abstract.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Kalamata());
        olives.add(new Kalamata());
        olives.add(new Ligurian());
        olives.add(new Ligurian());
        olives.add(new Ligurian());

        //OlivePress is an instance of the Press interface and implements all its required methods
        Press press = new OlivePress();
        press.setOil(5);
        int totalOil = press.getOil(olives);

        System.out.println("You got " + totalOil + " units of oil");

    }

}
