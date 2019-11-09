package trigLib;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CotTest {
	private Double input;
	private Double expected;

	public CotTest(Double input, Double expected) {
		super();
		this.input = input;
		this.expected = expected;
	}

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][]{
                {0.0, Double.NaN},
                {30.0, 1.732050},
                {45.0, 1.0},
                {60.0, 0.577350},
                {90.0, 0.0},
                {120.0, -0.577350},
                {150.0, -1.732050},
                {180.0, Double.NaN},
                {270.0, 0.0},
                {360.0, Double.NaN},
                {999.0,-0.158384},
                {-155.0,2.1445067},
                {-999.0,0.158384},
                {Double.POSITIVE_INFINITY, Double.NaN},
                {Double.NEGATIVE_INFINITY, Double.NaN}
		});
	}

	@Test
	public void testCotTest() {
		System.out.println("Cot(" + input + ") = " + expected);
		assertEquals(expected, trigLib.cot(input), 0.000001);

	}
}
