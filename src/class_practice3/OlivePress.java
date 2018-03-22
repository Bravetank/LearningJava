package class_practice3;

import class_practice3.model.Olive;
import java.util.ArrayList;

public class OlivePress {
    public int getOil(ArrayList<Olive>olives) {

        int totalOil = 0;

        for (Olive o : olives) {
            totalOil += o.getCrush();
            System.out.println(o.getName());

        }
        return totalOil;
    }
}
