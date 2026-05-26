package gr.aueb.cf.ch13;

/**
 * Lazy initialization.
 */
public class OnlyOneCodingFactoryLazy {

    private static OnlyOneCodingFactoryLazy instance;   // null

    private OnlyOneCodingFactoryLazy() {

    }

    public static OnlyOneCodingFactoryLazy getInstance() {
        if (instance == null) {
            instance = new OnlyOneCodingFactoryLazy();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Say Hello");
    }
}
