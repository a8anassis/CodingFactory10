package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ακεραίους προσπαθώντας
 * να μαντέψει ένα μυστικό ακέραιο.
 */
public class SecretApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET = 12;  // Μυστικός ακέραιος
        int guess = 0;          // Η εικασία του χρήστη

        System.out.println("Προσπαθήστε να μαντέψετε τον μυστικό ακέραιο.");
        guess = scanner.nextInt();

        if (guess == SECRET) {
            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
        } else {
            System.out.println("Λυπάμαι, η εικασία σας είναι λάθος.");
        }
    }
}
