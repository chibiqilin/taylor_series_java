package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.trigLib.csc;

@RunWith(Parameterized.class)
public class CscTest {
    private Double input;
    private Double expected;

    public CscTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Before
    public void initialize(){
        //before code
    }

    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {
                {0.0, Double.NaN},
                {90.0, 1.0},
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        } );
    }

    @Test
    public void testCscTest(){
        System.out.println("Csc("+input+") = "+expected);
        assertEquals(expected, csc(input));
    }
}
