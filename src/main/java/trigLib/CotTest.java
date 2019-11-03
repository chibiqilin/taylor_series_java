package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

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
        	//TODO double check this one later
            {0.0, Double.NaN},
            {30.0, 1.73205},
            {45.0, 1.0},
            {60.0,0.57735},
            {90.0, 0.0},
            {120.0,-0.57735},
            {150.0,-1.73205},
            //be careful with this test!
            {180.0,Double.NaN},
            {270.0,Double.NaN},
            //TODO shit happened at here!!!!!!!! level max warning
            {360.0,Double.NaN},
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        } );
    }

    @Test
    public void testCotTest(){
        System.out.println("Cot("+input+") = "+expected);
        assertEquals(expected, trigLib.cot(input),0.00001);
    }
}
