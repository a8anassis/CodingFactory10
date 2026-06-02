package gr.aueb.cf.ch16.builder_pattern;

public class Main {

    public static void main(String[] args) {
        Book pythonBook = new Book.Builder(1, "A123").build();

        Book javaBook = new Book.Builder(2, "B456")
                .author("Androutsos")
                .title("Java Fundamentals")
                .build();

        Book javaScriptBook = new Book.Builder(3, "C1234")
                .title("JavaScript")
                .build();
    }
}
