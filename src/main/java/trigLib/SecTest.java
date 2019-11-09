package trigLib;

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


    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 1.0},
                {30.0, 1.154700},
                {45.0, 1.414213},
                {60.0, 2.0},
                {90.0, Double.NaN},
                {120.0, -2.0},
                {150.0, -1.154700},
                {999.0,  6.392453},
                {180.0, -1.0},
                {270.0, Double.NaN},
                {360.0, 1.0},
                {999.0,6.392453},
                {-155.0,-1.103377},
                {-999.0,6.3924535},
                //TODO FIX THE INFINITY VALUE?
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        });
    }

    @Test
    public void testSecTest() {
        System.out.println("Sec(" + input + ") = " + expected);
        assertEquals(expected, trigLib.sec(input), 0.000001);
        
    }
}
