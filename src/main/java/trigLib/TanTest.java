package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TanTest {
	private Double input;
	private Double expected;

	public TanTest(Double input, Double expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, 0.0},
                {30.0, 0.577350},
                {45.0, 1.0},
                {60.0, 1.732050},
                {90.0, Double.NaN},
                {120.0, -1.732050},
                {150.0, -0.577350},
                {180.0, 0.0},
                {270.0, Double.NaN},
                {360.0, 0.0},
                {999.0,-6.313751},
                {-155.0,0.466307},
                {-999.0,6.313751},
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
        });
	}

	@Test
	public void testTanTest() {
		System.out.println("Tan(" + input + ") = " + expected);
		// test accuracy
		assertEquals(expected, TrigLib.tan(input), 0.000001);
	}
}
