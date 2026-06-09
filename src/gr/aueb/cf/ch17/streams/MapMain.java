package gr.aueb.cf.ch17.streams;

import gr.aueb.cf.ch17.sorting.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>(List.of(
                new Product("Apples", 12.7, 50),
                new Product("Oranges", 8.5, 50),
                new Product("Milk", 2.7, 100),
                new Product("Apples", 22.3, 120)
        ));

        List<String> listOfDescriptions = products.stream()
                .map(Product::getDescription)
                .toList();

        String descriptionStr = products.stream()
                .map(Product::getDescription)
                .collect(Collectors.joining(", "));

        System.out.println(listOfDescriptions);

    }
}
