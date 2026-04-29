package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Το {@link java.util.InputMismatchException} δημιουργείται όταν προσπαθούμε να διαβάσουμε
 * ένα διαφορετικό τύπο δεδομένων από αυτό που περιμένουμε.
 * Για παράδειγμα, αν περιμένουμε έναν ακέραιο και ο χρήστης εισάγει ένα string, τότε θα
 * δημιουργηθεί ένα InputMismatchException.
 */
public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο:");
        // num = scanner.nextInt();
        if (!scanner.hasNextInt()) {        // state test
            System.out.println("Δεν εισάγατε έναν ακέραιο.");
        } else {
            num = scanner.nextInt();
            System.out.println("Ο ακέραιος που εισάγατε είναι: " + num);
        }
    }
}
