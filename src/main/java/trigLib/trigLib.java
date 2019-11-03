package trigLib;

public abstract class trigLib {
    public static String mismatch = "Error: Type Mismatch Exception";



    public static Double cos(Double degrees){
        return  null;
    }

    public static Double tan(Double degrees){
        return  null;
    }

    public static Double sec(Double degrees){
        return  null;
    }

    public static Double csc(Double degrees){
        return  null;
    }

    public static Double cot(Double degrees){
        return  null;
    }
    
	/*
	 * Same as math.pow(), do the expoenet of a base
	 */
	private static double power(double base, int exponent) {
		// all the number's power 0 is one except 0.
		double result = 1.0;
		// 0 power anything is 0
		if (base == 0)
			return 0.0;
		// negative power
		boolean isNegetive = false;
		if (exponent < 0) {
			isNegetive = true;
			exponent = -exponent;
		}
		result = getTheResult(base, exponent);
		if (isNegetive)
			return 1 / result;
		return result;
	}

	/*
	 * power method deal with negative value
	 */
	private static double getTheResult(double base, int exponent) {
		// if power is 0, return 1
		if (exponent == 0) {
			return 1;
		}
		// if power is 1 return base
		if (exponent == 1) {
			return base;
		}
		
		double result = getTheResult(base, exponent >> 1);

		result *= result;
		if ((exponent & 0x1) == 1) {
			result *= base;
		}
		return result;

	}

	/*
	 * factorial recrusive function for taylor expend
	 */
	public static double factorial(double n) {
		if (n <= 1) // base case
			return 1;
		else
			return n * factorial(n - 1);
	}

	
	
	/*
	 * sine function
	 */
	public static double sin(double target) {
		// angle to radians

		// change it later

		// TODO: use value to isntaed of PI
		double rad = target * 1. / 180. * Math.PI;
		// the first element of the taylor series
		double sum = rad;

		// add them up until a certain precision (eg. 10)
		for (int i = 1; i <= 11; i++) {
			if (i % 2 == 0)

				sum += power(rad, 2 * i + 1) / factorial(2 * i + 1);
			else
				sum -= power(rad, 2 * i + 1) / factorial(2 * i + 1);
		}

		return sum;

	}
	
	

    public static Double sin(int degrees) { return sin(new Double(degrees)); }
    public static Double cos(int degrees) { return cos(new Double(degrees)); }
    public static Double tan(int degrees) { return tan(new Double(degrees)); }
    public static Double sec(int degrees) { return sec(new Double(degrees)); }
    public static Double csc(int degrees) { return csc(new Double(degrees)); }
    public static Double cot(int degrees) { return cot(new Double(degrees)); }

//    public static Double sin(String degrees) { throw new TrigTypeMismatchException(mismatch); }
//    public static Double cos(String degrees) { throw new TrigTypeMismatchException(mismatch); }
//    public static Double tan(String degrees) { throw new TrigTypeMismatchException(mismatch); }
//    public static Double sec(String degrees) { throw new TrigTypeMismatchException(mismatch); }
//    public static Double csc(String degrees) { throw new TrigTypeMismatchException(mismatch); }
//    public static Double cot(String degrees) { throw new TrigTypeMismatchException(mismatch); }

}
