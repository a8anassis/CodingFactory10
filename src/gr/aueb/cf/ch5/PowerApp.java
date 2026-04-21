package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει τη δύναμη a^b με μέθοδο.
 */
public class PowerApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 0;

        // Input & Data Binding
        System.out.println("Δώστε τη βάση και τον εκθέτη ");
        base = in.nextInt();
        power = in.nextInt();

        // Calls the service - delegation
        result = pow(base, power);

        // Εκτύπωση Αποτελέσματος
        System.out.println("α^β = " + result);

    }

    /**
     * Calculates a^b.
     *
     * @param a     the base number.
     * @param b     the exponent.
     * @return      the result of a^b.
     */
    public static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;    // accumulator
        }
        return result;
    }
}
