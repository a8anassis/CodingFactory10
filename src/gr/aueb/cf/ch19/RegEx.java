package gr.aueb.cf.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "hello coding";
//        System.out.println(isHello(s));
//        System.out.println(isHelloOrHi(s));

//        System.out.println(startsWithLetter(s));
        System.out.println(reverse(s));
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

    // Μεταχαρακτήρες
    public static boolean anyCharAndDigit(String s) {
        return s.matches(".\\d");   // ".[0-9]"
    }

    public static boolean startsWithDotAndDigit(String s) {
        return s.matches("\\.\\d"); // .2
    }

    // 02/04/2026 - ποσοδείκτες
    public static boolean isDate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean anyCharOneOrMore(String s) {
        return s.matches(".+");
    }

    public static boolean anyCharZeroOrMore(String s) {
        return s.matches(".*");
    }

    public static boolean twoWordsSpByOneSpace(String s) {
        return s.matches(".+\\s.+");
    }

    public static String reverse(String s) {
        return s.replaceAll("(.+)\\s(.+)", "$2 $1");    // groups - backreference
    }

}
