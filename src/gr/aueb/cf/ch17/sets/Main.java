package gr.aueb.cf.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        // add - no duplicates
        bag.add("apple");
        bag.add("apple"); // No duplicates allowed
        bag.add("banana");
        bag.add("orange");

        // Remove
        if (bag.contains("apple")) {
            bag.remove("apple");
        } else {
            System.out.println("Not found");
        }

        // Traverse
        bag.forEach(System.out::println);
        bag.removeIf(f -> f.startsWith("b"));   // predicate - boolean function
    }
}
