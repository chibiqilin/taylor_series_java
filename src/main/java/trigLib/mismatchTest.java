package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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


    @Test
    public void sinMismatch() { // test if mismatched argument type (non Number) or if input matches expected
        try {
            System.out.println("sin(" + input + ") = " + expected);
            if (input instanceof Number) { // If input is instanceof Number
                System.out.println("No input type mismatch!");
                Double d = ((Number) input).doubleValue(); // convert to double and compare to expected
                assertEquals(expected, d);
            } else { // if input is not instanceof Number
                throw new TrigIllegalArgumentException("illegal argument type"); // throw illegal argument exception
            }
        } catch (Exception ex) { // exception occurred
            if (ex.getClass() == TrigIllegalArgumentException.class) System.out.println("Input type mismatch!");
            //ex.printStackTrace();
            assertThat(ex.getMessage(), is("illegal argument type"));
        }
    }

    @Test
    public void cosMismatch() { // test if mismatched argument type (non Number) or if input matches expected
        try {
            System.out.println("cos(" + input + ") = " + expected);
            if (input instanceof Number) { // If input is instanceof Number
                System.out.println("No input type mismatch!");
                Double d = ((Number) input).doubleValue(); // convert to double and compare to expected
                assertEquals(expected, d);
            } else { // if input is not instanceof Number
                throw new TrigIllegalArgumentException("illegal argument type"); // throw illegal argument exception
            }
        } catch (Exception ex) { // exception occurred
            if (ex.getClass() == TrigIllegalArgumentException.class) System.out.println("Input type mismatch!");
            //ex.printStackTrace();
            assertThat(ex.getMessage(), is("illegal argument type"));
        }
    }

    @Test
    public void tanMismatch() { // test if mismatched argument type (non Number) or if input matches expected
        try {
            System.out.println("tan(" + input + ") = " + expected);
            if (input instanceof Number) { // If input is instanceof Number
                System.out.println("No input type mismatch!");
                Double d = ((Number) input).doubleValue(); // convert to double and compare to expected
                assertEquals(expected, d);
            } else { // if input is not instanceof Number
                throw new TrigIllegalArgumentException("illegal argument type"); // throw illegal argument exception
            }
        } catch (Exception ex) { // exception occurred
            if (ex.getClass() == TrigIllegalArgumentException.class) System.out.println("Input type mismatch!");
            //ex.printStackTrace();
            assertThat(ex.getMessage(), is("illegal argument type"));
        }
    }

    @Test
    public void secMismatch() { // test if mismatched argument type (non Number) or if input matches expected
        try {
            System.out.println("sec(" + input + ") = " + expected);
            if (input instanceof Number) { // If input is instanceof Number
                System.out.println("No input type mismatch!");
                Double d = ((Number) input).doubleValue(); // convert to double and compare to expected
                assertEquals(expected, d);
            } else { // if input is not instanceof Number
                throw new TrigIllegalArgumentException("illegal argument type"); // throw illegal argument exception
            }
        } catch (Exception ex) { // exception occurred
            if (ex.getClass() == TrigIllegalArgumentException.class) System.out.println("Input type mismatch!");
            //ex.printStackTrace();
            assertThat(ex.getMessage(), is("illegal argument type"));
        }
    }

    @Test
    public void cscMismatch() { // test if mismatched argument type (non Number) or if input matches expected
        try {
            System.out.println("csc(" + input + ") = " + expected);
            if (input instanceof Number) { // If input is instanceof Number
                System.out.println("No input type mismatch!");
                Double d = ((Number) input).doubleValue(); // convert to double and compare to expected
                assertEquals(expected, d);
            } else { // if input is not instanceof Number
                throw new TrigIllegalArgumentException("illegal argument type"); // throw illegal argument exception
            }
        } catch (Exception ex) { // exception occurred
            if (ex.getClass() == TrigIllegalArgumentException.class) System.out.println("Input type mismatch!");
            //ex.printStackTrace();
            assertThat(ex.getMessage(), is("illegal argument type"));
        }
    }

    @Test
    public void cotMismatch() { // test if mismatched argument type (non Number) or if input matches expected
        try {
            System.out.println("cot(" + input + ") = " + expected);
            if (input instanceof Number) { // If input is instanceof Number
                System.out.println("No input type mismatch!");
                Double d = ((Number) input).doubleValue(); // convert to double and compare to expected
                assertEquals(expected, d);
            } else { // if input is not instanceof Number
                throw new TrigIllegalArgumentException(); // throw illegal argument exception
            }
        } catch (Exception ex) { // exception occurred
            if (ex.getClass() == TrigIllegalArgumentException.class) System.out.println("Input type mismatch!");
            //ex.printStackTrace();
            assertThat(ex.getMessage(), is("Illegal Argument: Mismatched Data Type"));
        }
    }


}
