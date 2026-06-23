package gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto;

import java.math.BigDecimal;

public record AccountWithdrawDTO(String iban, BigDecimal amount) {
}

