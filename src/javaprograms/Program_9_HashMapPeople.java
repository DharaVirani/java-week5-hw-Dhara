package javaprograms;
/**
 * 9. Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;
import java.util.Map;

public class Program_9_HashMapPeople {

    public static void main(String[] args) {

//        HashMap declared that stores String as key and Integer as value

        Map <String, Integer> peopleAgeList = new HashMap<>();
        peopleAgeList.put("Elizabeth", 95);
        peopleAgeList.put("Charles", 85);
        peopleAgeList.put("Meghan", 35);
        peopleAgeList.put("Harry", 39);
        peopleAgeList.put("Diana", 47);

//        Reading values in the HashMap using for each loop

        for (Map.Entry<String, Integer> people : peopleAgeList.entrySet()) {
            System.out.println(people);
        }
    }
}
