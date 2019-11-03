package trigLib;

import com.sun.corba.se.impl.io.TypeMismatchException;

public class TrigTypeMismatchException extends TypeMismatchException {
    public TrigTypeMismatchException(String message) {
        super(message);
    }
}
