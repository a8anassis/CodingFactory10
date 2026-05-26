package gr.aueb.cf.ch13;

public class Main {

    public static void main(String[] args) {
        OnlyOneCodingFactory onlyOneCodingFactory = OnlyOneCodingFactory.getInstance();
        onlyOneCodingFactory.doSomething();

        // Καλούμε την υπηρεσία της Utility class
        HelloUtil.sayHello();
    }
}
