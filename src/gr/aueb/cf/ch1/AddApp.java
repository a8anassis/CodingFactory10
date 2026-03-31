package gr.aueb.cf.ch1;

/**
 * Adds two integers and prints
 * the result to the console.
 */
public class AddApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // Λογική - Εντολές
        result = num1 + num2;

        // Εκτύπωση αποτελέσματος
        System.out.println("Το αποτέλεσμα είναι: " + result);
        System.out.println("Το άθροισμα των " + num1 + " και " + num2 + " είναι: " + result);
        System.out.printf("Το άθροισμα των %d και %d είναι: %d\n", num1, num2, result);
    }
}
