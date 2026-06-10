package gr.aueb.cf.ch17.streams;

import java.util.List;

public class MatchMain {

    public static void main(String[] args) {
        List<String > names = List.of("John", "Jane", "Bob", "Alice");

        boolean isAliceExists = names.stream()
//                .anyMatch(name -> name.equals("Alice"));
//                .allMatch(name -> name.length() >= 2);
                .noneMatch(name -> name.equals("Elon"));

    }
}
