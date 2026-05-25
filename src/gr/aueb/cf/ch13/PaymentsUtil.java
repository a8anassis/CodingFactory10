package gr.aueb.cf.ch13;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PaymentsUtil {

    private PaymentsUtil() {

    }

    /**
     * Rounds a BigDecimal to the specified number of decimal places.
     *
     * @param value             the amount to round.
     * @param decimaPlaces      the number of decimal places to round to.
     * @return                  the rounded amount.
     */
    public static BigDecimal round(BigDecimal value, int decimaPlaces) {
        if (value == null) return BigDecimal.ZERO;
        return value.setScale(decimaPlaces, RoundingMode.HALF_UP);
    }

    /**
     * Calculates the difference between two BigDecimals.
     * @param a             the first amount.
     * @param b             the second amount.
     * @param decimaPlaces  the number of decimal places to round to.
     * @return              the difference between the two amounts.
     */
    public static BigDecimal diff(BigDecimal a, BigDecimal b, int decimaPlaces) {
        if (a == null || b == null) return BigDecimal.ZERO;
        return b.subtract(a)
                .setScale(decimaPlaces, RoundingMode.HALF_UP);
    }
}
