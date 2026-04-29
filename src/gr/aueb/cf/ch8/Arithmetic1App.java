package gr.aueb.cf.ch8;

import java.util.Scanner;

/**
 * Δημιουργείται ένα {@link ArithmeticException} χωρίς
 * να το χειριστούμε.
 */
public class Arithmetic1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακέραιους:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        result = num1 / num2;   // αν num2 == 0, τότε δημιουργείται ArithmeticException

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
