package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class ASinTest {
    private Double input;
    private Double expected;

    public ASinTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {1.0, 1.57079633},
                {0.5, 0.523598776},
                {0.707106, 0.785397059},
                {0.866025, 1.04719674},
                {-1.0, -1.57079633 },
                {-0.987688,-1.41371452},
                {-0.422618,-0.436332024}
        });
    }

    @Test
    public void testASinTest() {
        System.out.println("ASin(" + input + ") = " + expected);
        //test 5 decimal accuracy
        assertEquals(expected, TrigLib.arcsin(input), 0.000001);

    }
}

