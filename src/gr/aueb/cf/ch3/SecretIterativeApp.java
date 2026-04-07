package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης προσπαθεί να μαντέψει
 * ένα μυστικό ακέραιο.
 */
public class SecretIterativeApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;  // Μυστικός ακέραιος
        int guess = 0;          // Η εικασία του χρήστη

        while (true) {
            System.out.println("Προσπαθήστε να μαντέψετε τον μυστικό ακέραιο.");
            guess = scanner.nextInt();

            if (guess != SECRET) {
                System.out.println("Λυπάμαι, η εικασία σας είναι λάθος. Προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
            break;


//            if (guess == SECRET) {
//                System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
//                break;
//            }
//
//            System.out.println("Λυπάμαι, η εικασία σας είναι λάθος. Προσπαθήστε ξανά.");

        }
    }
}
