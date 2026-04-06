package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει αν βρέχει και τη
 * θερμοκρασία και το πρόγραμμα υπολογίζει
 * αν χιονίζει. Χιονίζει σημαίνει ότι βρέχει ΚΑΙ η
 * θερμοκρασία είναι κάτω από το μηδέν.
 */
public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        int temperature = 0;
        boolean isSnowing = false;

        System.out.println("Βρέχει; (true/false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Χιονίζει: " + isSnowing);
    }
}
