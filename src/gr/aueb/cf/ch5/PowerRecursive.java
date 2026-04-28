package gr.aueb.cf.ch5;

/**
 * Υπολογίζει τη δύναμη ενός αριθμού με αναδρομικό τρόπο.
 * base^power = base * base^(power - 1)
 */
public class PowerRecursive {

    public static void main(String[] args) {

    }

    public static int pow(int base, int power) {
//        if (power == 0) return 1;
//        return base * pow(base, power - 1);

        return (power == 0) ? 1 : base * pow(base, power - 1);
    }
}
