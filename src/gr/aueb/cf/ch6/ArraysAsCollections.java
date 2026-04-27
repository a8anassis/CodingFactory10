package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Οι βασικές πράξεις σε συλλογές όπως οι πίνακες είναι:
 * filtering
 * mapping
 * reducing
 */
public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int count = 0;

        for (int element : arr) {
            if (element % 2 == 0) {
                arrayToReturn[count++] = element;
            }
        }

        return Arrays.copyOf(arrayToReturn, count);
    }

    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] mapped = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mapped[i] = arr[i] * 2;
        }
        return mapped;
    }

    public static int sum(int[] arr) {
        if (arr == null) return 0;
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        return sum;
    }




}
