package gr.aueb.cf.ch6;

/**
 * Μετράει το πλήθος των εμφανίσεων ενός ακεραίου
 * μέσα σε ένα πίνακα ακεραίων.
 */
public class ArrayCountApp {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 5 };
        int count = 0;

        count = getCount(arr, 4);

        System.out.println("Count of 4 in the array: " + count);
    }

    /**
     * Calculates the count of times an element
     * exists in a given array.
     * @param arr       the input array to search through.
     * @param value     the value to count in the array.
     * @return          the count of occurrences of the value in the array,
     *                  or -1 if the array is null.
     */
    public static int getCount(int[] arr, int value) {
        if (arr == null) return -1;             // δεν υπάρχει πίνακας
        int count = 0;

        for (int element : arr) {
            if (element == value) count++;
        }

        return count;
    }
}
