package gr.aueb.cf.ch13;

public class OnlyOneCodingFactory {

    // Eager initialization - The instance is created when the class is loaded.
    private final static OnlyOneCodingFactory INSTANCE = new OnlyOneCodingFactory();

    private OnlyOneCodingFactory() {

    }

    public static OnlyOneCodingFactory getInstance() {
        return INSTANCE;
    }

    public void doSomething() {
        System.out.println("Say Hello");
    }
}
