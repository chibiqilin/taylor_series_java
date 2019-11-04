package trigLib;

public class TrigIllegalArgumentException extends IllegalArgumentException {
    public TrigIllegalArgumentException(String message) {
        super(message);
    }

    public TrigIllegalArgumentException() {
        super();
    }

    public TrigIllegalArgumentException(IllegalArgumentException ex) {
        super(ex.getMessage());
    }
}
