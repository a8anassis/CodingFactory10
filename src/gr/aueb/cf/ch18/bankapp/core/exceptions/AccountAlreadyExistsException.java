package gr.aueb.cf.ch18.bankapp.core.exceptions;

public class AccountAlreadyExistsException extends Exception {

    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}
