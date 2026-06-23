package gr.aueb.cf.ch18.bankapp_mysql.bankapp.core.exceptions;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}


