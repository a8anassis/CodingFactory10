package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Σε ένα χώρο στάθμευσης η 1η ώρα κοστίζει
 * 2 ευρώ (200 λεπτά) και κάθε επιπλέον ώρα
 * κοστίζει 1.5 ευρώ (150 λεπτά).
 *
 * Ο χρήστης εισάγει τον αριθμό των ωρών που στάθμευσε
 * και το πρόγραμμα επιστρέφει το συνολικό κόστος.
 *
 * Αν για παράδειγμα ο χρήστης εισάγει 5 ώρες, τότε το
 * κόστος
 */
public class ParkingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputHours = 0;
        int euros = 0;
        int cents = 0;
        int totalCostInCents = 0;
        final int FIRST_HOUR_PRICE = 200;
        final int EACH_ADDITIONAL_HOUR_COST = 150;

        System.out.println("Εισάγετε ώρες στάθμευσης");
        inputHours = scanner.nextInt();

        totalCostInCents = FIRST_HOUR_PRICE + (inputHours - 1) * EACH_ADDITIONAL_HOUR_COST;
        euros = totalCostInCents / 100;
        cents = totalCostInCents % 100;

        System.out.printf("Συνολικό κόστος στάθμευσης: %d ευρώ και %d λεπτά\n", euros, cents);
    }
}
