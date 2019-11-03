package trigLib;

public abstract class trigLib {
    public static String mismatch = "Error: Type Mismatch Exception";

    public static Double sin(Double degrees) { return null;  }

    public static Double cos(Double degrees){
        return  null;
    }

    public static Double tan(Double degrees){
        return  null;
    }

    public static Double sec(Double degrees){
        return  null;
    }

    public static Double csc(Double degrees){
        return  null;
    }

    public static Double cot(Double degrees){
        return  null;
    }

    public static Double sin(int degrees) { return sin(new Double(degrees)); }
    public static Double cos(int degrees) { return cos(new Double(degrees)); }
    public static Double tan(int degrees) { return tan(new Double(degrees)); }
    public static Double sec(int degrees) { return sec(new Double(degrees)); }
    public static Double csc(int degrees) { return csc(new Double(degrees)); }
    public static Double cot(int degrees) { return cot(new Double(degrees)); }

    public static Double sin(String degrees) { throw new TrigTypeMismatchException(mismatch); }
    public static Double cos(String degrees) { throw new TrigTypeMismatchException(mismatch); }
    public static Double tan(String degrees) { throw new TrigTypeMismatchException(mismatch); }
    public static Double sec(String degrees) { throw new TrigTypeMismatchException(mismatch); }
    public static Double csc(String degrees) { throw new TrigTypeMismatchException(mismatch); }
    public static Double cot(String degrees) { throw new TrigTypeMismatchException(mismatch); }

}
