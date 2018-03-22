package hash_maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SetKeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> favFoodScore = new HashMap<>();
        favFoodScore.put("Pancakes", 10);
        favFoodScore.put("Roast Potatoes", 9);
        favFoodScore.put("Pizza", 8);

        System.out.println("Simple print out of HashMap: ");
        System.out.println(favFoodScore);
        System.out.println("");

        //For Iterator, old forEach and Java8 forEach need to set key
        Set<String> keys = favFoodScore.keySet();

        //Iterator
        System.out.println("HashMap + Iterator: ");
        Iterator<String>iterator = keys.iterator();
        while(iterator.hasNext()){
            String key  = iterator.next();
            System.out.println(key + ": " + favFoodScore.get(key));
        }
        System.out.println("");


        //forEach
        System.out.println("HashMap and forEach: ");
        for(String eachKey: keys){
            System.out.println(eachKey + ": " + favFoodScore.get(eachKey));
        }
        System.out.println("");
    }
}
