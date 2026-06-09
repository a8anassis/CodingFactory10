package gr.aueb.cf.ch17.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.7, 50),
                new Product("Oranges", 8.5, 50),
                new Product("Milk", 2.7, 100),
                new Product("Apples", 22.3, 120)
        ));

        products.sort(Comparator.naturalOrder());   // ascending order
        products.forEach(System.out::println);

        products.sort(Comparator.reverseOrder());   // descending order
        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getPrice)); // ascending order
//        products.sort((a, b) -> a.getQuantity() - b.getQuantity());
        products.forEach(System.out::println);

        products.sort(Comparator.comparing(Product::getQuantity)
                .thenComparing(Product::getPrice, Comparator.reverseOrder())
                .thenComparing(Product::getDescription).reversed()
        );
    }
}
