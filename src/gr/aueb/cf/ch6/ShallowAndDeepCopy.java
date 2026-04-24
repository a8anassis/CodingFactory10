package gr.aueb.cf.ch6;

public class ShallowAndDeepCopy {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1;
        int[] arr2;

        arr1 = shallowCopy(arr);
        arr2 = deepCopy(arr);
    }

    public static int[] shallowCopy(int[] arr) {
        return arr;             // επιστρέφει την ίδια αναφορά, όχι αντίγραφο
    }

    public static int[] deepCopy(int[] arr) {
        int[] destinationArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            destinationArr[i] = arr[i];
        }

        return destinationArr;
    }
}
