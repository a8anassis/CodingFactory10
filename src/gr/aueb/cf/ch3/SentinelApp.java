package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει ακέραιους από το χρήστη μέχρι να δοθεί ο
 * ακέραιος -1 (sentinel).
 */
public class SentinelApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int iterations = 0;

        System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο):");

        while ((num = in.nextInt()) != -1) {
            iterations++;
            System.out.println("Παρακαλώ εισάγετε έναν ακέραιο (-1 για έξοδο):");
            // num = in.nextInt();
        }

        System.out.println("Ο χρήστης εισήγαγε " + iterations + " ακέραιους πριν δώσει τον sentinel (-1).");
    }
}
