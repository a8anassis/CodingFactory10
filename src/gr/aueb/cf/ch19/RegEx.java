package gr.aueb.cf.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "Hi";
        System.out.println(isHello(s));
        System.out.println(isHelloOrHi(s));
    }

    // Απλά RegEx
    public static boolean isHello(String s) {
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi");
    }

    // Character classes
    public static boolean isHhello(String s) {
        return s.matches("[Hh]ello");
    }

    public static boolean startsWithUpperCase(String s) {
        return s.matches("[A-Z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }
}
