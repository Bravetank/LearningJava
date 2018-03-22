package class_practice3;

import class_practice3.model.Olive;
import class_practice3.model.OliveName;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Olive> olives = new ArrayList<>();

        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854,
                3));
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854,
                3));
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000,
                4));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);
        }
    }

