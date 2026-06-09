package gr.aueb.cf.ch17.streams;

import gr.aueb.cf.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceMain {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.7, 50),
                new Product("Oranges", 8.5, 50),
                new Product("Milk", 2.7, 100),
                new Product("Apples", 22.3, 120)
        ));

        int totalSum = numbers.stream()
//                .reduce(0, (sum, num) -> sum + num);
                .reduce(0, Integer::sum);

        int sumOfQuantities = products.stream()
//                .reduce(0, (sum, product) -> sum + product.getQuantity(), Integer::sum);
                .mapToInt(Product::getQuantity)
                .sum();
//                .reduce(0, Integer::sum);

        System.out.println(totalSum);
        System.out.println(sumOfQuantities);


        var descriptions = products.stream()
                .filter(product -> product.getQuantity() >= 100)
                .sorted(Comparator.comparing(Product::getDescription))
                .map(Product::getDescription)
                .map(String::toUpperCase)
                .collect(Collectors.toCollection(ArrayList::new));


    }
}
