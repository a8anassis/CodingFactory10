package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών στον χρήστη και του ζητάει να επιλέξει μια επιλογή.
 * Ανάλογα με την επιλογή, δίνουμε feedback.
 */
public class SwitchApp {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 5;

        // Input & Data Binding & Conditional Statements
        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
            System.out.println("1. Προβολή προφίλ");
            System.out.println("2. Επεξεργασία προφίλ");
            System.out.println("3. Ρυθμίσεις");
            System.out.println("4. Βοήθεια");
            System.out.println("5. Έξοδος");

            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Προβολή προφίλ...");
                    break;
                case 2:
                    System.out.println("Επεξεργασία προφίλ...");
                    break;
                case 3:
                    System.out.println("Ρυθμίσεις...");
                    break;
                case 4:
                    System.out.println("Βοήθεια...");
                    break;
                case EXIT:
                    System.out.println("Έξοδος από το πρόγραμμα.");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
                    break;
            }

            // Arrow syntax, no break needed, new Java syntax, >=Java 14
            switch (choice) {
                case 1 -> System.out.println("Προβολή προφίλ...");
                case 2 -> System.out.println("Επεξεργασία προφίλ...");
                case 3 -> System.out.println("Ρυθμίσεις...");
                case 4 -> System.out.println("Βοήθεια...");
                case EXIT -> System.out.println("Έξοδος από το πρόγραμμα.");
                default -> System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
            }
        } while (choice != EXIT);

    }
}
