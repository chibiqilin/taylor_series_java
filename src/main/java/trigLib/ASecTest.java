package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.TrigLib.*;

@RunWith(Parameterized.class)
public class ASecTest {
    private Double input;
    private Double expected;

    public ASecTest(Double input, Double expected) {
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
                {1.732050, 0.95531628},
                {-1.732050, 2.18627636},
                {-0.577350, Double.NaN},
                {-6.313751,1.72985056},
                {0.466307,Double.NaN}
        });
    }

    @Test
    public void testASecTest() {
        System.out.println("ASec(" + input + ") = " + expected);
        // test accuracy
        assertEquals(expected, arcsec(input), 0.000001);
    }
}
