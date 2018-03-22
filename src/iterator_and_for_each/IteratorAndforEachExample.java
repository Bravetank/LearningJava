package iterator_and_for_each;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class IteratorAndforEachExample {
    public static void main(String[] args) {
        ArrayList<String>favFoods = new ArrayList<>();
        favFoods.add("Pancakes");
        favFoods.add("Roast Potatoes");
        favFoods.add("Pizza");

        System.out.println("toString() output: ");
        System.out.println(favFoods);
        System.out.println("");

        System.out.println("ArrayList iterator: ");
        Iterator<String> iterator = favFoods.iterator();
        while(iterator.hasNext()){
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("ArrayList ForEach: ");
        for (String food: favFoods) {
            System.out.println(food);
        } System.out.println("");

        System.out.println("Java 8 way - forEach: ");
        favFoods.forEach(System.out::println);
        System.out.println("");


    }
}
