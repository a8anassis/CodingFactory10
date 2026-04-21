package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει με τη χρήση το παραγοντικό του n.
 * n! = 1 * 2 * 3 * ... * n
 */
public class Factorial {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int n = 0;
        int result = 0;

        // Input & Data Binding
        System.out.println("Δώστε έναν θετικό ακέραιο:");
        n = in.nextInt();

        // Calls the service - delegation
        result = facto(n);      // Inject the real parameter

        // Εκτύπωση αποτελέσματος
        System.out.println("Το παραγοντικό του " + n + " είναι: " + result);
    }

    /**
     * Calculates factorial of n.
     *
     * @param n     the number to calculate factorial for.
     * @return      the factorial of n.
     */
    public static int facto(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;    // result = result * i;
        }

        return result;
    }
}
