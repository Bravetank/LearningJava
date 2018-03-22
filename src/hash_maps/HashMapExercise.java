package hash_maps;

import java.util.HashMap;

public class HashMapExercise {
    public static void main(String[] args) {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("Demi", 10);
        ages.put("Peter", 47);
        ages.put("Shelly", 45);

        System.out.println(ages);

        //Can get value if you input key
        Integer age = ages.get("Demi");
        System.out.println(age);


        ages.put("Made Up", 22);
        System.out.println(ages);

        ages.remove("Made Up");
        System.out.println(ages);

    }
}
