package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Επαναληπτικά ο χρήστης προσπαθεί να μαντέψει ένα μυστικό PIN
 * αλλά έχει ένα όριο προσπαθειών. Αν ξεπεράσει το όριο, χάνει.
 */
public class SecretMaxAttempts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SECRET_PIN = 1234;
        final int MAX_ATTEMPTS = 3;
        int attempts = 1;
        int inputPin = 0;

        while (true) {
            if (attempts > MAX_ATTEMPTS) {
                System.out.println("Έχετε ξεπεράσει το όριο προσπαθειών. Χάσατε!");
                break;
            }

            System.out.println("Προσπαθήστε να μαντέψετε το μυστικό PIN. Προσπάθεια " + attempts + " από " + MAX_ATTEMPTS);
            inputPin = scanner.nextInt();

            if (inputPin != SECRET_PIN) {
                System.out.println("Λάθος PIN. Προσπαθήστε ξανά.");
                attempts++;
                continue;
            }

            System.out.println("Συγχαρητήρια! Μαντέψατε σωστά.");
            break;
        }
    }
}
