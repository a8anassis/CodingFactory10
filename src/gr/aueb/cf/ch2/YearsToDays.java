package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει την ηλικία του σε έτη (έστω ακέραιος)
 * και το πρόγραμμα επιστρέφει την ηλικία σε ημέρες, όπου
 * θεωρούμε ότι 1 έτος = 365 ημέρες. Για παράδειγμα, αν δοθεί
 * ηλικία 2ο ετών, το αποτέλεσμα θα είναι 7300 ημέρες.
 */
public class YearsToDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputAgeInYears = 0;
        int ageInDays = 0;
        final int DAYS_IN_YEAR = 366;

        // Input & Data Binding
        System.out.println("Παρακαλώ εισάγετε την ηλικία σας σε έτη");
        inputAgeInYears = scanner.nextInt();    // data binding

        // Λογική της εφαρμογής
        ageInDays = inputAgeInYears * DAYS_IN_YEAR;

        // Εκτύπωση αποτελεσμάτων
        System.out.printf("Ηλικία σε έτη: %d, Ηλικία σε ημέρες: %d\n", inputAgeInYears, ageInDays);
    }
}
