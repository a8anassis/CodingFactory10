package gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

