package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών ακεραίων
 * που δίνει ο χρήστης και σταματάει όταν ο χρήστης
 * δώσει έναν αρνητικό ακέραιο.
 */
public class PositivesCount {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int positivesCount = 0;

        // Όσο υπάρχουν δεδομένα - do
        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (αρνητικός για έξοδο):");
        num = scanner.nextInt();

        while (num >= 0) {
            positivesCount++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (αρνητικός για έξοδο):");
            num = scanner.nextInt();
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Το πλήθος των θετικών είναι: " + positivesCount);
    }
}
