package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.trigLib.sin;

@RunWith(Parameterized.class)
public class SinTest {
    private Double input;
    private Double expected;

    public SinTest(Double input, Double expected) {
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
                {0.0, 0.0},
                {30.0, 0.5},
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        } );
    }

    @Test
    public void testSinTest(){
        System.out.println("Sin("+input+") = "+expected);
        assertEquals(expected, sin(input));
    }
}
