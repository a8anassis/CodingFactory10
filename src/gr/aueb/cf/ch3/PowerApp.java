package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το a^n. Ο χρήστης εισάγει
 * τα a και n.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Παρακαλώ εισάγετε τη βάση (a):");
        base = in.nextInt();
        System.out.println("Παρακαλώ εισάγετε τη δύναμη (n):");
        power = in.nextInt();

        while (i <= power) {
            result *= base;     // result = result * base
            i++;
        }

        System.out.printf("%d ^ %d = %,d\n", base, power, result);
    }
}
