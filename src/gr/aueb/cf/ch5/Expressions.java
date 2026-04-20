package gr.aueb.cf.ch5;

/**
 * Demo of floating point expressions.
 */
public class Expressions {

    public static void main(String[] args) {
        int myInt = 10;
        float myFloat = 10.5f;
        double myDouble = 10.5;
        double result = 0.0;
        final double PI = 3.1415926535897932384626433832795;
        final double LIGHT_SPEED = 299792458.0;

        result = myInt + myFloat + myDouble;        // όλα μετατρέπονται στον μεγαλύτερο τύπο: double, auto-widening

        System.out.println("Result: " + result);
        System.out.printf("Result formatted: %.6f\n", result);

        System.out.printf("PI: %.5e, LIGHT-SPEED = %.3e\n", PI, LIGHT_SPEED);
    }
}
