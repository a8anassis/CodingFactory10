package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Demo of switch expression.
 */
public class SwitchExpression {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int grade = 0;
        char classification = ' ';

        System.out.println("Δώστε έναν βαθμό (1-10):");
        grade = in.nextInt();

        classification = switch (grade) {
            case 1, 2, 3, 4 -> 'F';
            case 5, 6 -> 'C';
            case 7, 8 -> 'B';
            case 9, 10 -> 'A';
            default -> 'U';
        };

        System.out.println("Η βαθμολογία σας είναι: " + classification);
    }
}
