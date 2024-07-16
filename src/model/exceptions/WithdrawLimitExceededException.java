package model.exceptions;

public class WithdrawLimitExceededException extends RuntimeException{

    public WithdrawLimitExceededException() {
        super("The amount exceeds withdraw limit");
    }
}
