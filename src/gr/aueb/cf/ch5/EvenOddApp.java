package gr.aueb.cf.ch5;

/**
 * Ορίζει δύο μεθόδους, τις isEven και
 * isOdd για τον έλεγχο ενός ακεραίου αν
 * είναι άρτιος ή περιττός αντίστοιχα.
 */
public class EvenOddApp {

    public static void main(String[] args) {

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
//        return num % 2 != 0;
        return !isEven(num);
    }
}
