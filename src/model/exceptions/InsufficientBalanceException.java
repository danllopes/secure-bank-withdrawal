package model.exceptions;

public class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException() {
        super("Not enough balance");
    }
}
