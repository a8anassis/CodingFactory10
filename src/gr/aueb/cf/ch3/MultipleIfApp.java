package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υλοποιεί ένα μενού με πολλαπλά if.
 */
public class MultipleIfApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Προβολή προφίλ");
            System.out.println("2. Επεξεργασία προφίλ");
            System.out.println("3. Ρυθμίσεις");
            System.out.println("4. Βοήθεια");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            if (choice == 1) {
                System.out.println("Προβολή προφίλ...");
            } else if (choice == 2) {
                System.out.println("Επεξεργασία προφίλ...");
            } else if (choice == 3) {
                System.out.println("Ρυθμίσεις...");
            } else if (choice == 4) {
                System.out.println("Βοήθεια...");
            } else if (choice == 5) {
                System.out.println("Έξοδος από το πρόγραμμα.");
            } else {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
            }
        } while (choice != 5);  // 5 is exit
    }
}
