package gr.aueb.cf.ch6;

/**
 * Swaps two ints with arrays
 */
public class SwapArray {

    public static void main(String[] args) {
        int[] arr = {1, 40};

        for (int element : arr) {
            System.out.print(element + " ");
        }

        swap(arr);
        System.out.println();

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }


    /**
     * Δέχεται πίνακα δύο στοιχείων και τα κάνει swap
     * @param arr       the input array
     */
    public static void swap(int[] arr) {
        if (arr == null ||  arr.length != 2 ) {
            return;
        }

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
