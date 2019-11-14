package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ACosTest {
    private Double input;
    private Double expected;

    public ACosTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.866025, 0.523599583},
                {0.707106, 0.785399268},
                {0.5, 1.04719755},
                {0.0, 1.57079633 },
                {-0.5, 2.0943951},
                {-0.8, 2.49809154},
                {1.0, Double.NaN},
                {0.156434, 1.41371716 },
                {-0.906307, 2.70525848 }
        });
    }

    @Test
    public void testACosTest() {
        System.out.println("ACos(" + input + ") = " + expected);
        assertEquals(expected, TrigLib.arccos(input), 0.000001);
    }
}
