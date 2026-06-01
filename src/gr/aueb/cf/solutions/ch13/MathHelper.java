package gr.aueb.cf.solutions.ch13;

public class MathHelper {

    // varargs double... numbers explanation
    // Flexible way to pass multiple arguments to a method
    // Essentially is an array of doubles
    // but can be called with any number of arguments
    // It is essentially a way to overload a method

    public static double sum(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double average(double... numbers) {
        return sum(numbers) / numbers.length;

    }

    public static double max(double... numbers) {
        double max = Double.MIN_VALUE;
        for (double number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    public static double min(double... numbers) {
        double min = Double.MAX_VALUE;
        for (double number : numbers) {
            if (number < min) min = number;
        }
        return min;
    }

    public static double pow(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }
}
