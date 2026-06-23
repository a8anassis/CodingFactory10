package gr.aueb.cf.ch18.bankapp_mysql.bankapp.dto;

import java.math.BigDecimal;

public record AccountReadOnlyDTO(String iban, BigDecimal balance) {

    @Override
    public String toString() {
        return "IBAN: " + iban + ", Balance: " + balance;
    }
}

//public class AccountReadOnlyDTO {
//
//    private String iban;
//    private BigDecimal balance;
//
//    public AccountReadOnlyDTO() {
//
//    }
//
//    public AccountReadOnlyDTO(String iban, BigDecimal balance) {
//        this.iban = iban;
//        this.balance = balance;
//    }
//
//    public String getIban() {
//        return iban;
//    }
//
//    public void setIban(String iban) {
//        this.iban = iban;
//    }
//
//    public BigDecimal getBalance() {
//        return balance;
//    }
//
//    public void setBalance(BigDecimal balance) {
//        this.balance = balance;
//    }
//
//    @Override
//    public String toString() {
//        return "IBAN: " + iban + ", Balance: " + balance;
//    }
//}
