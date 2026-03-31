package gr.aueb.cf.ch2;

/**
 * Εμφανίζει MIN, MAX και εύρος τιμών των
 * βασικών τύπων ακεραίων.
 */
public class IntApp {

    public static void main(String[] args) {
        System.out.printf("int, MIN = %d, MAX = %d, SIZE = %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.SIZE);
        System.out.printf("short, MIN = %d, MAX = %d, SIZE = %d\n", Short.MIN_VALUE, Short.MAX_VALUE, Short.SIZE);
        System.out.printf("byte, MIN = %d, MAX = %d, SIZE = %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE, Byte.SIZE);
        System.out.printf("long, MIN = %d, MAX = %d, SIZE = %d\n", Long.MIN_VALUE, Long.MAX_VALUE, Long.SIZE);
    }
}
