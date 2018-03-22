package arrays_exercises;

import java.util.ArrayList;

public class ArrayListsExercise {
    public static void main(String[] args) {
        ArrayList<String>list = new ArrayList<>();
        list.add("Coffee");
        list.add("Tea");
        list.add("Water");
        System.out.println(list);

        System.out.println(list.get(0));

        list.remove(2);

        System.out.println(list);

        list.add("Hot Chocolate");

        System.out.println(list);

        String favouriteDrink = list.get(0);
        System.out.println("My favourite hot drink is " + favouriteDrink);

        int pos = list.indexOf("Hot Chocolate");
        System.out.printf("Hot Chocolate can be found at index %d", pos);

    }
}
