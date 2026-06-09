package gr.aueb.cf.ch17.streams;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MainFilter {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> names = List.of("John", "Jane", "Bob", "Alice");

        var filteredNames = names.stream()
                .filter(name -> name.length() >= 2)
                .collect(Collectors.toCollection(HashSet::new));

        // filter evens
        Iterable<Integer> evenNumbers = numbers.stream()
//        var evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)        // intermediate operation
//                .toList();                          // terminal operation - unmodifiable list
                .collect(Collectors.toList());      // terminal operation - modifiable list

        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        evenNumbers.forEach(System.out::println);



    }
}
