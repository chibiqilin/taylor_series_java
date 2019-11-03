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
            {0.0, 1},
            {30.0,1.15470},
            {45.0,1.41421},
            {60,2},
            {90.0, Double.POSITIVE_INFINITY},
            {120,-2},
            {150,-1.15470},
            {180,-1},
            //be careful with this test!
            {270,Double.NaN},
            {360,1},
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
