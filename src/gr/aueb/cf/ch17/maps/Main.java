package gr.aueb.cf.ch17.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String , String > map = new HashMap<>();

        // Add & Update
        map.put("GR", "Greece");
        map.put("USA", "United States of America");
        map.put("GR", "Germany");       // update

        // Get
        String country = map.get("GR");
        System.out.println(country);

        // Remove
        map.remove("USA");

        // Traverse
        map.forEach((k, v) -> System.out.println(k + " = " + v));

    }
}
