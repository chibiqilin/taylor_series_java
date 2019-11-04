package trigLib;

public class UndefinedException extends ArithmeticException {
    public UndefinedException(String message) {
        super(message);
    }

    public UndefinedException() {
        super("Division by Zero! Value Undefined");
    }
}
