package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ανάληψη από ATM με linearization.
 *
 * Κάθε περίπτωση σφάλματος ελέγχεται ψηλά στον κώδικα και διακόπτει την τρέχουσα
 * επανάληψη: η έξοδος με {@code break}, οι άκυρες αναλήψεις με {@code continue}.
 * Η κύρια λογική (η ανάληψη) μένει στο τέλος, χωρίς εμφωλευμένα if-else.
 *
 */
public class AtmWithdrawal {

    /**
     * Εκτελεί διαδοχικές αναλήψεις, απορρίπτοντας τις άκυρες.
     */
    public static void main(String[] args) {
        final int EXIT_VALUE = 0;
        final int NOTE20 = 20;
        Scanner scanner = new Scanner(System.in);
        int balance = 500;
        int amount = 0;


        while (true) {
            System.out.println("Εισάγετε ποσό ανάληψης (πολλαπλάσιο του %d, 0 για έξοδο): ");
            amount = scanner.nextInt();

            if (amount == EXIT_VALUE) {
                break;
            }

            if (amount < 0) {
                System.out.println("Το ποσό δεν μπορεί να είναι αρνητικό");
                continue;
            }

            if (amount % NOTE20 != 0) {
                System.out.printf("Το ποσό πρέπει να είναι πολλαπλάσιο του %d €%n", NOTE20);
                continue;
            }

            if (amount > balance) {
                System.out.println("Ανεπαρκές υπόλοιπο");
                continue;
            }

            balance -= amount;
            System.out.printf("Ανάληψη %d Ευρώ (%d χαρτονομίσματα)%n", amount, amount / NOTE20);
        }

        System.out.printf("%nΤελικό υπόλοιπο: %d \\u20AC%n", balance);
    }
}
