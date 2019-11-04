package trigLib;

public class TrigIllegalArgumentException extends IllegalArgumentException {
    public TrigIllegalArgumentException(String message) {
        super(message);
    }

    public TrigIllegalArgumentException() {
        super("Illegal Argument: Mismatched Data Type");
    }
}
