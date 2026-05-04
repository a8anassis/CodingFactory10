package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Διαβάζει και επεξεργάζεται τα περιεχόμενα ενός
 * αρχείου κειμένου.
 */
public class ReadFiles2App {

    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("C:/tmp/students.txt");
        List<String> lines = Files.readAllLines(filePath);

        for (String line : lines) {
            String[] tokens = line.split(" ");
            String firstname = tokens[0];
            String lastname = tokens[1];
            System.out.println(lastname + ", " + firstname);
        }
    }
}
