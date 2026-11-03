package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίων ενός ακεραίου
 * που δίνει ο χρήστης
 */
public class DigitsCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digits = 0;
        int num;
        int tmp;

        System.out.println("Enter a number");
        num = in.nextInt();

        tmp = num;
        while (true) {
            digits++;
            tmp = tmp / 10;
            if (tmp == 0) break;
        }

        System.out.println("The digits count is " + digits);
    }
}
