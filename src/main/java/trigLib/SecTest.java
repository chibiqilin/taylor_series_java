package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class SecTest {
    private Double input;
    private Double expected;

    public SecTest(Double input, Double expected) {
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
            {0.0, 1.0},
            {30.0,1.15470},
            {45.0,1.41421},
            {60.0,2.0},
            {90.0, Double.POSITIVE_INFINITY},
            {120.0,-2.0},
            {150.0,-1.15470},
            {180.0,-1.0},
            //be careful with this test!
            {270.0,Double.NaN},
            {360.0,1.0},
            //TODO FIX THE INFINITY VALUE?
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        } );
    }

    @Test
    public void testSecTest(){
        System.out.println("Sec("+input+") = "+expected);
        assertEquals(expected, trigLib.sec(input),0.00001);
    }
}
