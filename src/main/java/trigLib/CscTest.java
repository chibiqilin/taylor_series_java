package trigLib;

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

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, Double.NaN},
                {30.0, 2.0},
                {45.0, 1.414213},
                {60.0, 1.154700},
                {90.0, 1.0},
                {120.0, 1.154700},
                {150.0, 2.0},
                {180.0, Double.NaN},
                {270.0, -1.0},
                {360.0, Double.NaN},
                {999.0,-1.012465},
                {-155.0,-2.366201},
                {-999.0,1.012465},
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
		});
	}

	@Test
	public void testCscTest() {
		System.out.println("Csc(" + input + ") = " + expected);
		assertEquals(expected, TrigLib.csc(input), 0.000001);
	}
}
