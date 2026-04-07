package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εναλλακτικά της do-while με while (true)
 * και break.
 */
public class DoMenu2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Εισαγωγή προϊόντος");
            System.out.println("2. Ενημέρωση προϊόντος");
            System.out.println("3. Διαγραφή προϊόντος");
            System.out.println("4. Αναζήτηση προϊόντος");
            System.out.println("5. Έξοδος");
            choice = in.nextInt();

            if (choice == 5) break;
        }

        System.out.println("Ευχαριστούμε για την επιλογή της εφαρμογής μας.");
    }
}
