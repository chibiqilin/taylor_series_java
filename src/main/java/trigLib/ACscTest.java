package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.TrigLib.*;

@RunWith(Parameterized.class)
public class ACscTest {
    private Double input;
    private Double expected;

    public ACscTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0,Double.NaN},
                {0.577350, Double.NaN},
                {1.0, Double.NaN},
                {1.732050, 0.61548003},
                {-1.732050, -0.61548003},
                {-0.577350, Double.NaN},
                {-6.313751,-0.15905423},
                {0.466307,Double.NaN}
        });
    }

    @Test
    public void testACscTest() {
        System.out.println("ACsc(" + input + ") = " + expected);
        // test accuracy
        assertEquals(expected, arccsc(input), 0.000001);
    }
}
