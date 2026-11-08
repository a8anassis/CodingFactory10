package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * The user inserts the sum of grades in a series of modules
 * and also the count of modules, and the program calculates
 * the avg, and then based on the average outputs the
 * following feedback: 9-10 excellent, 7-8 is very good,
 * 5-6 is good, and <5 is fail
 * The valid range of grades is between 0 and 10.
 * Assume that the avg is integer.
 */
public class GradesApp {

    public static void main(String[] args) {

        // Declare and init the variables
        Scanner input = new Scanner(System.in);
        int modulesCount;
        int totalMarks;
        int average;

        // Get the input data
        System.out.println("Insert the sum of grades");
        totalMarks = input.nextInt();

        System.out.println("Insert the count of modules");
        modulesCount = input.nextInt();

        // Validation
        if (modulesCount <= 0) {
            System.out.println("Invalid input. Module count must be greater than 0.");
            System.exit(1);
        }

        // invariant - business rule
        average = totalMarks / modulesCount;

        // Το invariant πρέπει να ελεγχθεί
        if (average < 0 || average > 10) {
            System.out.println("Invalid input. Average grade must be between 0 and 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very Good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Fail");
        }
    }
}
