package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static trigLib.TrigLib.*;

@RunWith(Parameterized.class)
public class ATanTest {
    private Double input;
    private Double expected;

    public ATanTest(Double input, Double expected) {
        super();
        this.input = input;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {0.577350, 0.523598574},
                {1.0, 0.785398163},
                {1.732050, 1.04719735},
                {-1.732050, -1.04719735},
                {-0.577350, -0.523598574},
                {-6.313751,-1.41371668},
                {0.466307,0.436331772}
        });
    }

    @Test
    public void testATanTest() {
        System.out.println("ATan(" + input + ") = " + expected);
        // test accuracy
        assertEquals(expected, arctan(input), 0.000001);
    }
}
