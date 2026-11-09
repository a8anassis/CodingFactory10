package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επιτρέπει στον χρήστη να εισάγει την τιμή
 * ενός προϊόντος και το ποσοστό έκπτωσης
 * και υπολογίζει την τελική τιμή.
 *
 * Business Rules
 *
 * Τι πρέπει να ισχύει
 * price >= 0
 * discount >= 0 && discount <= 100
 *
 * Validation
 * Ελέγχουμε αν ισχύει
 */
public class DiscountApp {

    public static void main(String[] args) {

        // Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int price = 0;
        int discount = 0;
        double finalPrice = 0.0;

        // Είσοδος δεδομένων και επεξεργασία
        while (true) {
            System.out.println("Εισάγετε την τιμή προϊόντος: (Έξοδος με 0)");
            price = in.nextInt();

            if (price == 0) {
                System.out.println("Έξοδος από το πρόγραμμα.");
                break;
            }

            if (price < 0) {
                System.out.println("Η τιμή δεν μπορεί να είναι αρνητική. Προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Εισάγετε το ποσοστό έκπτωσης (0-100)");
            discount = in.nextInt();

            if (discount < 0 || discount > 100) {
                System.out.println("Μη έγκυρη έκπτωση. Προσπαθήστε ξανά.");
                continue;
            }

            finalPrice = price * (1 - discount / 100.0);

            System.out.println("Η τελική τιμή είναι: " + finalPrice);
        }

        // Εκτύπωση αποτελεσμάτων
        System.out.println("Ευχαριστούμε που χρησιμοποιήσατε το πρόγραμμα.");
    }
}
