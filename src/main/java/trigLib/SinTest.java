package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class SinTest {
    private Double input;
    private Double expected;

    public SinTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {90.0, 1.0},
                {30.0, 0.5},
                {45.0, 0.707106},
                {60.0, 0.866025},
                {120.0, 0.866025},
                {150.0, 0.5},
                {180.0, 0.0},
                {270.0, -1.0},
                {360.0, 0.0},
                {999.0,-0.987688},
                {-155.0,-0.422618},
                {-999.0,0.987688},
                //TODO FIX THE INFINITY VALUE?
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        });
    }

    @Test
    public void testSinTest() {
        System.out.println("Sin(" + input + ") = " + expected);
        //test 5 decimal accuracy
        assertEquals(expected, TrigLib.sin(input), 0.000001);

    }
}

