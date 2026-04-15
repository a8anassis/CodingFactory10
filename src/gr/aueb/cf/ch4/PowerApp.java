package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τα base και power και το
 * πρόγραμμα υπολογίζει και εκτυπώνει το base^power,
 * για παράδειγμα 2^10 = 1024.
 */
public class PowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Εισάγετε τη βάση (base) και τη δύναμη (power):");
        base = in.nextInt();
        power = in.nextInt();

        for (int i = 1; i <= power; i++) {
            result *= base;     // result = result * base
        }

        System.out.println(base + "^" + power + " = " + result);
    }
}
