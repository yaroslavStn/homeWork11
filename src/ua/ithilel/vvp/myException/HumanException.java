package ua.ithilel.vvp.myException;

public class HumanException extends Exception {
    public HumanException() {
        super();
    }

    public HumanException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
