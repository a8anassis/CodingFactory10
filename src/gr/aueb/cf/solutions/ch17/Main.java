package gr.aueb.cf.solutions.ch17;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        DLList<Character> dll = new DLList<>();
        ListNode<Character> node;

        Path filePath = Path.of("C:/tmp/file.txt");
        int ordinal = 0;
        char ch;
        int totalChars = 0;

        if (!Files.exists(filePath)) {
            System.out.println("File not found: " + filePath);
            return;
        }

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            while ((ordinal = reader.read()) != -1) {
                ch = (char) ordinal;
                if (ch == '\r' || ch == '\n') continue;

                node = dll.findNode(ch);
                if (node == null) {
                    dll.insertLast(ch);
                } else {
                    dll.increaseCount(ch);
                }
                totalChars++;
            }

            System.out.println("--- Ανά χαρακτήρα (ascending) ---");
            dll.sortByValueAscending();
            dll.traverse(totalChars);

            System.out.println("--- Ανά ποσοστό (descending) ---");
            dll.sortByCountDescending();
            dll.traverse(totalChars);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            System.out.println("Σφάλμα κατά την ανάγνωση του αρχείου.");
        }
    }
}
