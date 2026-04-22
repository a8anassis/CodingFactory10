package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Απλός υπολογιστής τσέπης που εμφανίζει μενού με
 * πρόσθεση, αφαίρεση, πολ/σμό, διαίρεση και mod, ο
 * χρήστης επιλέγει, στη συνέχεια δίνει τις τιμές εισόδου,
 * και λαμβάνει το αποτέλεσμα. Αυτό επαναλαμβάνεται μέχρι ο
 * χρήστης να επιλέξει 'έξοδο'.
 */
public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        final int EXIT = 6;


        while (true) {

            printMenu();
            choice = getOneInt();

            if (choice == EXIT) {
                System.out.println("Έξοδος...");
                break;
            }

            if (!isChoiceValid(choice)) {
                System.out.println("Μη έγκυρη επιλογή. Παρακαλώ προσπαθήστε ξανά.");
                continue;
            }

            System.out.println("Δώστε δύο ακέραιους:");
            num1 = getOneInt();
            num2 = getOneInt();

            result = getResultOnChoice(choice, num1, num2);

            System.out.println("Το αποτέλεσμα είναι: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Mod");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt() {
        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static int getResultOnChoice(int choice, int num1, int num2) {
        int result = 0;

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) {
            return 0; // Επιστρέφει 0 ή μπορεί να χειριστεί διαφορετικά
        }
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) {
            return 0; // Επιστρέφει 0 ή μπορεί να χειριστεί διαφορετικά
        }
        return a % b;
    }
}
