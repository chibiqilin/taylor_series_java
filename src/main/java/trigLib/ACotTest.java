package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.TrigLib.*;

@RunWith(Parameterized.class)
public class ACotTest {
    private Double input;
    private Double expected;

    public ACotTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 1.57079632},
                {0.577350, 1.04719775},
                {1.0, 0.785398163},
                {1.732050, 0.52359897},
                {-1.732050, -0.52359897},
                {-0.577350, -1.04719775},
                {-6.313751,-0.15707964},
                {0.466307,1.13446455}
        });
    }

    @Test
    public void testACotTest() {
        System.out.println("ACot(" + input + ") = " + expected);
        // test accuracy
        assertEquals(expected, arccot(input), 0.000001);
    }
}
