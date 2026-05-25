package gr.aueb.cf.ch13;

import java.math.BigDecimal;

public class PaymentsUtilMain {

    public static void main(String[] args) {
        BigDecimal firstPayment = new BigDecimal("1000.23456789");
        BigDecimal secondPayment = new BigDecimal("800.23456789");

        BigDecimal roundedFirstPayment = PaymentsUtil.round(firstPayment, 2);
        BigDecimal roundedSecondPayment = PaymentsUtil.round(secondPayment, 2);

        System.out.println("Rounded first payment: " + roundedFirstPayment);
        System.out.println("Rounded second payment: " + roundedSecondPayment);

        BigDecimal diff = PaymentsUtil.diff(roundedFirstPayment, roundedSecondPayment, 2);
        System.out.println("Difference: " + diff);
    }
}
