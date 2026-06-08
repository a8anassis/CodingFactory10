package gr.aueb.cf.ch17.lifo_parking;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LifoParking {
    private final Deque<String> parking = new LinkedList<>();   // mutable

    public LifoParking() {}

    public List<String> getParking() {
        return List.copyOf(parking);        // unmodifiable copy
    }

    public void addCar(String car) {
        parking.push(car);          // Delegation
        System.out.println(LocalDateTime.now() + ", Είσοδος, Αρ. Πινακίδας= " + car);
    }

    public String removeCar() {
        if (parking.isEmpty()) {
            return null;
        }
        String car = parking.pop();
        System.out.println(LocalDateTime.now() + ", Έξοδος, Αρ. Πινακίδας= " + car);
        return car;
    }

    public boolean isEmpty() {
        return parking.isEmpty();
    }

    public int size() {
        return parking.size();
    }

    public void traverse() {
        parking.forEach(System.out::println);
    }


}
