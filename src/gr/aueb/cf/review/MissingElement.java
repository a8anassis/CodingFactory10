package gr.aueb.cf.review;

/**
 * Έστω ένας πίνακας με n στοιχεία από 1 έως n+1.
 * Βρείτε το στοιχείο που λείπει.
 */
public class MissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int missing = 0;

        missing = findMissingElement(arr);
        System.out.println("Missing element: " + missing);
    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n + 1) * (n + 2) / 2;

        for (int el : arr) {
            actualSum += el;
        }

        return expectedSum - actualSum;
    }
}
