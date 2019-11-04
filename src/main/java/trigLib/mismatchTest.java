package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class mismatchTest {
    private Object input;
    private Double expected;

    public mismatchTest(Object input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {"aString", Double.NaN}
        });
    }


    @Test(expected = TrigIllegalArgumentException.class)
    public void sinMismatch() {
        try {
            System.out.println("sin(" + input + ") = " + expected);
            trigLib.sin((Double) input);
            assertEquals(expected, input);
        } catch (Exception e) {
            System.out.println("Mismatch: Throwing TrigIllegalArgumentException");
            throw new TrigIllegalArgumentException("illegal argument");
        }
    }

    @Test(expected = TrigIllegalArgumentException.class)
    public void cosMismatch() {
        try {
            System.out.println("cos(" + input + ") = " + expected);
            trigLib.cos((Double) input);
            assertEquals(expected, input);
        } catch (Exception e) {
            System.out.println("Mismatch: Throwing TrigIllegalArgumentException");
            throw new TrigIllegalArgumentException("illegal argument");
        }
    }

    @Test(expected = TrigIllegalArgumentException.class)
    public void tanMismatch() {
        try {
            System.out.println("tan(" + input + ") = " + expected);
            trigLib.tan((Double) input);
            assertEquals(expected, input);
        } catch (Exception e) {
            System.out.println("Mismatch: Throwing TrigIllegalArgumentException");
            throw new TrigIllegalArgumentException("illegal argument");
        }
    }

    @Test(expected = TrigIllegalArgumentException.class)
    public void secMismatch() {
        try {
            System.out.println("sec(" + input + ") = " + expected);
            trigLib.sec((Double) input);
            assertEquals(expected, input);
        } catch (Exception e) {
            System.out.println("Mismatch: Throwing TrigIllegalArgumentException");
            throw new TrigIllegalArgumentException("illegal argument");
        }
    }

    @Test(expected = TrigIllegalArgumentException.class)
    public void cscMismatch() {
        try {
            System.out.println("csc(" + input + ") = " + expected);
            trigLib.csc((Double) input);
            assertEquals(expected, input);
        } catch (Exception e) {
            System.out.println("Mismatch: Throwing TrigIllegalArgumentException");
            throw new TrigIllegalArgumentException("illegal argument");
        }
    }

    @Test(expected = TrigIllegalArgumentException.class)
    public void cotMismatch() {
        try {
            System.out.println("cot(" + input + ") = " + expected);
            trigLib.cot((Double) input);
            assertEquals(expected, input);
        } catch (Exception e) {
            System.out.println("Mismatch: Throwing TrigIllegalArgumentException");
            throw new TrigIllegalArgumentException("illegal argument");
        }
    }

}
