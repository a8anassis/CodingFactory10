package gr.aueb.cf.ch6;

public class ShallowAndDeepCopy {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1;
        int[] arr2;

        arr1 = getReference(arr);
        arr2 = deepOrShallowCopy(arr);
    }

    // Εφόσον ο arr είναι mutable πάντα έχει side effects
    public static int[] getReference(int[] arr) {
        return arr;             // επιστρέφει την ίδια αναφορά, όχι αντίγραφο
    }

    // Επιστρέφει νέο πίνακα. Το αν είναι shallow copy
    // ή deep copy εξαρτάται από το είδος των στοιχείων
    // Είναι ασφαλές αν τα στοιχεία είναι primitives
    // ή immutable (π.χ. String)
    public static int[] deepOrShallowCopy(int[] arr) {
        int[] destinationArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            destinationArr[i] = arr[i];
        }

        return destinationArr;
    }
}
