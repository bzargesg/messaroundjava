package app;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> names = new ArrayList<>();

        names.add("George");
        names.add("Kevin");
        // System.out.println(names);

        // for (String name : names) {
        // System.out.println(name);
        // }

        names.forEach(System.out::println);
    }
}