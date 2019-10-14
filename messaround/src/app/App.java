package app;

import java.util.ArrayList;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {

        /**
         * ARRAYS
         */
        // ArrayList<String> names = new ArrayList<>();
        // names.add("George");
        // names.add("Kevin");
        // // System.out.println(names);

        // // for (String name : names) {
        // // System.out.println(name);
        // // }
        // names.forEach(System.out::println);

        /*
         * HASHMAPS
         */

        HashMap<String, Integer> numbers = new HashMap();
        numbers.put("zero", 0);
        numbers.put("one", 1);
        numbers.put("two", 2);

        // System.out.println(numbers);
        // numbers.forEach((key, value) -> {
        // System.out.println("Key: " + key);
        // System.out.println("Value: " + value);
        // });

    }
}