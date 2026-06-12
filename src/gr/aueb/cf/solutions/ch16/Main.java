package gr.aueb.cf.solutions.ch16;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> objects = new ArrayList<>();
        objects.add(new Document());
        objects.add(new Photo());

        // Runnable με Thread
        Runnable task = () -> {
            for (Object obj : objects) {
                if (obj instanceof Printable p) {   // pattern matching
                    p.print();
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();
    }
}

