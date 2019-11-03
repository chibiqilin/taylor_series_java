package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

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
        	//TODO double check this one later
            {0.0, Double.NaN},
            {30.0,2.0},
            {45.0,1.41421},
            {60,1.1547005},
            {90.0, 1.0},
            {120.0,1.15470},
            {150.0,2.0},
            //be careful with this test!
            {180,Double.NaN},
            {270.0,-1.0},
            //TODO shit happened at here!!!!!!!! level max warning
            {360.0,Double.NaN},
            //TODO FIX THE INFINITY VALUE?
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        } );
    }

    @Test
    public void testCscTest(){
        System.out.println("Csc("+input+") = "+expected);
        assertEquals(expected, trigLib.csc(input),0.00001);
    }
}
