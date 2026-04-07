package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών στον χρήστη,
 * μέχρι ο χρήστης να επιλέξει την επιλογή 5 (Έξοδος).
 */
public class DoMenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή προϊόντος");
            System.out.println("2. Ενημέρωση προϊόντος");
            System.out.println("3. Διαγραφή προϊόντος");
            System.out.println("4. Αναζήτηση προϊόντος");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();
        } while (choice != 5);

        System.out.println("Ευχαριστούμε για την επιλογή της εφαρμογής μας.");
    }
}
