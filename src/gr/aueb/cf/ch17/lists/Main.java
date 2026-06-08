package gr.aueb.cf.ch17.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        // Add
        cities.add("Athens");   // index 0
        cities.add("Berlin");   // index 1
        cities.add("Paris");    // index 2

        // Get
        String city = cities.get(0);    // Athens
        System.out.println(city);

        // Update
        int position = cities.indexOf("Paris"); // override equals
        if (position == -1) {
            System.out.println("Not found");
        } else {
            cities.set(position, "London");
        }

        // Remove
        if (cities.contains("London")) {    // override equals
            cities.remove("London");        // override equals
        } else {
            System.out.println("Not found");
        }

        // Traverse

        // For
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // Enhanced for
        for (String c : cities) {
            System.out.println(c);
        }

        // Iterator
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String aCity = it.next();
            System.out.println(aCity);
        }

        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Berlin")) {
                iterator.remove();      // cities.remove("Berlin"); fails fast
            }
        }

        // Functional over Iterative
        cities.forEach(System.out::println);
        cities.removeIf(c -> c.equals("Paris"));
    }
}
