package gr.aueb.cf.solutions.projects;

import java.util.Scanner;

/**
 * Διαχείριση κρατήσεων θεάτρου με 30 σειρές και 12 στήλες (A-L).
 * Π.χ. η θέση C2 βρίσκεται στην 2η σειρά και 3η στήλη.
 *
 * @author thanos
 */
public class TheaterApp {
    static final int ROWS = 30;
    static final int COLUMNS = 12;
    static boolean[][] seats = new boolean[ROWS][COLUMNS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        char column = ' ';
        int row = 0;

        while (true) {
            System.out.println("1. Κράτηση θέσης");
            System.out.println("2. Ακύρωση κράτησης");
            System.out.println("3. Έξοδος");
            System.out.print("Επιλογή: ");

            while (!scanner.hasNextInt()) {
                scanner.next(); // καταναλώνει το string ου έχει δοθεί
                System.out.print("Δώσε αριθμό 1-3 (3 για έξοδο): ");
            }
            choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Αντίο.");
                break;
            }

            if (choice != 1 && choice != 2) {
                System.out.println("Μη έγκυρη επιλογή.");
                continue;
            }

            System.out.print("Δώσε στήλη (A-L): ");
            column = Character.toUpperCase(scanner.next().charAt(0));
            while (column < 'A' || column > 'L') {
                System.out.print("Δώσε στήλη A-L: ");
                column = Character.toUpperCase(scanner.next().charAt(0));
            }

            System.out.print("Δώσε σειρά (1-30): ");
            while (!scanner.hasNextInt()) {
                scanner.nextLine();
                System.out.print("Δώσε ακέραιο 1-30: ");
            }
            row = scanner.nextInt();

            try {
                if (choice == 1) {
                    book(column, row);
                    System.out.println("Η κράτηση της θέσης " + column + row + " ολοκληρώθηκε.");
                } else {
                    cancel(column, row);
                    System.out.println("Η ακύρωση της θέσης " + column + row + " ολοκληρώθηκε.");
                }
            } catch (Exception e) {
                if (choice == 1) {
                    System.out.println("Η κράτηση δεν ήταν δυνατή. Η θέση είναι booked.");
                } else {
                    System.out.println("Η ακύρωση δεν ήταν δυνατή. Η θέση δεν είναι booked.");
                }
            }
        }
    }

    /**
     * Κάνει κράτηση μίας θέσης αν δεν είναι ήδη booked.
     *
     * @param column η στήλη (A-L, ήδη επικυρωμένη)
     * @param row η σειρά (1-30, ήδη επικυρωμένη)
     * @throws Exception αν η θέση είναι ήδη booked
     */
    public static void book(char column, int row) throws Exception {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        try {
            if (seats[rowIndex][colIndex]) {
                throw new Exception("Η θέση " + column + row + " είναι ήδη booked.");
            }
            seats[rowIndex][colIndex] = true;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }

    /**
     * Ακυρώνει την κράτηση μίας θέσης αν είναι booked.
     *
     * @param column η στήλη (A-L, ήδη επικυρωμένη)
     * @param row η σειρά (1-30, ήδη επικυρωμένη)
     * @throws Exception αν η θέση δεν είναι booked
     */
    public static void cancel(char column, int row) throws Exception {
        int colIndex = column - 'A';
        int rowIndex = row - 1;

        try {
            if (!seats[rowIndex][colIndex]) {
                throw new Exception("Η θέση " + column + row + " δεν είναι booked.");
            }
            seats[rowIndex][colIndex] = false;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}