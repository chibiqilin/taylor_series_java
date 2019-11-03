package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.trigLib.cot;

@RunWith(Parameterized.class)
public class CotTest {
    private Double input;
    private Double expected;

    public CotTest(Double input, Double expected) {
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
    public void testCotTest(){
        System.out.println("Cot("+input+") = "+expected);
        assertEquals(expected, cot(input));
    }
}
