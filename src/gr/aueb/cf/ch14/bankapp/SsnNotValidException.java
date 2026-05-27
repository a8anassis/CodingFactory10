package gr.aueb.cf.ch14.bankapp;

public class SsnNotValidException extends Exception {

    public SsnNotValidException(String message) {
        super(message);
    }
}
