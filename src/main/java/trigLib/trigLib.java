package trigLib;

public abstract class trigLib {

    //value of pi
    static double PI = 3.14159265;

    
    /*
     * Change degree to radius
     */
    public static double degreeToRadius(double input){
    	double rad = input * 1. / 180. * PI;
    	return rad;
    	
    }
    
    /*
     * Change radius to degree
     */
    public static double radiusToDegree(double input){
    	double degree = input * 180 / PI;
    	return degree;
    }
    
    
	/*
	 * sine function
	 */
	public static double sin(double target) {
		// angle to radians

		// change it later

		// TODO: use value to instead of PI
		double rad = target * 1. / 180. * PI;
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

    /*
     * cosine function
     */
    public static double cos(double target) {
        // angle to radians

        // change it later

        double rad = target * 1. / 180. * PI;
        // the first element of the taylor series
        double sum = 1.0;

        // add them up until a certain precision (eg. 10)
        for (int i = 1; i <= 14; i++) {
            if (i % 2 == 0)
                sum += power(rad, 2 * i) / factorial(2 * i);
            else
                sum -= power(rad, 2 * i) / factorial(2 * i);
        }
        return sum;
    }

    /*
     * tan function
     */
    public static double tan(double target) {
        double numerator = sin(target);
        double denominator = cos(target);

        if (denomIsZero(denominator)) return Double.NaN;
		double value = numerator / denominator;
        return value;
    }

    /*
     * sec function
     */
    public static double sec(double target) {
        double numerator = 1;
        double denominator = cos(target);

        if (denomIsZero(denominator)) return Double.NaN;
        double value = numerator / denominator;
        return value;
    }

    /*
     * csc function
     */
    public static double csc(double target) {
        double numerator = 1;
        double denominator = sin(target);

		if (denomIsZero(denominator)) return Double.NaN;
        double value = numerator / denominator;
        return value;
    }

    /*
     * cotan function
     */
    public static double cot(double target) {
        double numerator = cos(target);
        double denominator = sin(target);

		if (denomIsZero(denominator)) return Double.NaN;
        double value = numerator / denominator;
        return value;
    }

	private static boolean denomIsZero(double denominator) {
		Double absDenominator = (denominator < 0) ? -denominator : denominator;
		return (absDenominator < 0.00001) ? true : false;
	}

    /*
     * Same as math.pow(), do the exponent of a base
     */
    private static double power(double base, int exponent) {
        double result = 1.0;
        if (base == 0)
            return 0.0;
        boolean isNegative = false;
        if (exponent < 0) {
            isNegative = true;
            exponent = -exponent;
        }
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        if (isNegative)
            return 1 / result;
        return result;
    }

    /*
     * factorial recursive function for taylor expend
     */
    public static double factorial(double n) {
        if (n <= 1) // base case
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static Double sin(int degrees) {
        return sin(new Double(degrees));
    }

    public static Double cos(int degrees) {
        return cos(new Double(degrees));
    }

    public static Double tan(int degrees) {
        return tan(new Double(degrees));
    }

    public static Double sec(int degrees) {
        return sec(new Double(degrees));
    }

    public static Double csc(int degrees) {
        return csc(new Double(degrees));
    }

    public static Double cot(int degrees) {
        return cot(new Double(degrees));
    }


}
