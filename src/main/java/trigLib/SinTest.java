package trigLib;,

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.trigLib.trigLib.sin;

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
            {90.0, 1},
            {30.0,0.5},
            {45.0,0.70710},
            {60,0.86602},
            {120,0.86602},
            {150,0.5},
            {180,0},
            {270,-1},
            {360,0},
            {Double.POSITIVE_INFINITY, Double.NaN},
            {Double.NEGATIVE_INFINITY, Double.NaN}
            //TODO: make catch the error input
        } );
    }

    @Test
    public void testSinTest(){
        System.out.println("Sin("+input+") = "+expected);
        assertEquals(expected, sin(input));
    }
}
