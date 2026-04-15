package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα ακέραιο. Το πρόγραμμα υπολογίζει
 * το απόλυτο του ακεραίου. Το απόλυτο ενός ακεραίου είναι
 * θετικός αριθμός. Για παράδειγμα, το απόλυτο του -5 είναι 5,
 * ενώ το απόλυτο του 5 είναι 5.
 */
public class AbsTernary {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int absNum = 0;

        System.out.println("Εισάγετε έναν ακέραιο:");
        num = scanner.nextInt();

        absNum = num >= 0 ? num : -num;

        System.out.println("Το απόλυτο του " + num + " είναι: " + absNum);
    }
}
