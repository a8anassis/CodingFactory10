package gr.aueb.cf.ch5;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Demo of rounding and BigDecimal.
 */
public class RoundingAndBigDecimal {

    public static void main(String[] args) {
        BigDecimal bigNum = new BigDecimal("10.2345");
        BigDecimal divisor = new BigDecimal("4");
        BigDecimal result = BigDecimal.ZERO;
        BigDecimal result2 = BigDecimal.ZERO;

        result = bigNum.divide(divisor, 2, RoundingMode.HALF_UP);   // 2.559 -> 2.56

        System.out.println("Result: " + result);
    }
}
