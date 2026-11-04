package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Υπολογίζει base^power για big integers.
 */
public class BigApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger base = BigInteger.ZERO;
        BigInteger power = BigInteger.ZERO;
        BigInteger result = BigInteger.ONE;

        System.out.println("Enter two integers");
        base = sc.nextBigInteger();
        power = sc.nextBigInteger();

        for (int i = 1; i <= power.intValue(); i++) {
            result = result.multiply(base);
        }

        System.out.printf("%d^%d=%,d", base, power, result);

    }
}
