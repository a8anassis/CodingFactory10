package gr.aueb.cf.solutions.ch9;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LocationsNio {

    public static void main(String[] args) {
        Path inFilePath = Path.of("C:/tmp/lat.txt");
        Path outFilePath = Path.of("C:/tmp/lat-out.txt");

        try {
            List<String> lines = Files.readAllLines(inFilePath, StandardCharsets.UTF_8);

            try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(outFilePath, StandardCharsets.UTF_8))) {
                String[] headerTokens = lines.get(0).split(",");
                String[] tokens;

                for (int i = 1; i < lines.size(); i++) {
                    tokens = lines.get(i).split(",");
                    pw.printf("{ location: '%s', latitude: %s, longitude: %s },%n", tokens[0], tokens[1], tokens[2]);
                    System.out.printf("{ location: '%s', latitude: %s, longitude: %s },%n", tokens[0], tokens[1], tokens[2]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}