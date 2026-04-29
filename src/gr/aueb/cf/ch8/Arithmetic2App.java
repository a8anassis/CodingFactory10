package gr.aueb.cf.ch8;

import java.util.Scanner;

public class Arithmetic2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Παρακαλώ εισάγετε δύο ακέραιους:");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            result = num1 / num2;
            System.out.println("Το αποτέλεσμα είναι: " + result);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
