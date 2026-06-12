package gr.aueb.cf.solutions.ch16;

public interface Printable {
    default void print() {
        System.out.println("Default printing...");
    }
}

