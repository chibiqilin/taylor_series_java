package trigLib;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CosTest {
    private Double input;
    private Double expected;

    public CosTest(Double input, Double expected) {
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
            {0.0,1.0},
            {30.0, 0.86602},
            {45.0, 0.70710},
            {60.0,0.5},
            {90.0, 0.0},
            {120.0,-0.5},
            {150.0,-0.86602},
            {180.0,-1.0},
            {270.0,0.0},
            {360.0,1.0},
            //TODO change this one later
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        } );
    }

    @Test
    public void testCosTest(){
        System.out.println("Cos("+input+") = "+expected);
        assertEquals(expected, trigLib.cos(input),0.00001);
        //again roy secret test file , do not bother
//        assertEquals(expected, main.cos(input),0.00001);
    }
}
