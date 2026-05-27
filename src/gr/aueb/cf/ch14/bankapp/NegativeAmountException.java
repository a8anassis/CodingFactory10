package gr.aueb.cf.ch14.bankapp;

public class NegativeAmountException extends Exception {

    public NegativeAmountException(String message) {
        super(message);
    }
}
