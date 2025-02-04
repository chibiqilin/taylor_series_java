package trigLib;

/**
 * TrigLib is a library which provides methods for performing trigonometric
 * functions. Trigonometric functions is performed using Taylor series
 * expansion, accurate to at least 6 decimal places within JUnit assert testing.
 * Methods include sin, cos, tan, sec, csc, cot. Additionally, a method is
 * provided to convert degrees to radians: degreeToRadian(), as well as a method
 * to convert radians back to degrees, you can use radianToDegree().
 *
 * @author Andrew Vu (6044937), GeZhang Zhu (5921648)
 * @version 4.0
 */
public abstract class TrigLib {

    static double PI = 3.1415926535897932; // Value of PI

    /**
     * Change degrees to radians
     *
     * @param input value in degrees
     * @return value in radians
     */
    public static double degreeToRadian(double input) {
        double rad = input * 1. / 180. * PI;
        return rad;

    }

    /**
     * Change radians to degrees
     *
     * @param input value in radians
     * @return value in degrees
     */
    public static double radianToDegree(double input) {
        double degree = input * 180 / PI;
        return degree;
    }

    /**
     * Sine function
     *
     * @param degree input value in degrees
     * @return Output of sin(degree) function
     */
    public static double sin(double degree) {

        double rad = (degree * 1. / 180. * PI) % (2 * PI);

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

    /**
     * Cosine function
     *
     * @param degree input value in degrees
     * @return Output of cos(degree) function
     */
    public static double cos(double degree) {

        double rad = (degree * 1. / 180. * PI) % (2 * PI);

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

    /**
     * Tangent function
     *
     * @param degree input value in degrees
     * @return Output of tan(degree) function
     */
    public static double tan(double degree) {
        double numerator = sin(degree);
        double denominator = cos(degree);

        try {
            if (denomIsZero(denominator))
                throw new UndefinedException();
        } catch (UndefinedException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }

        double value = numerator / denominator;
        return value;
    }

    /**
     * Secant function
     *
     * @param degree input value in degrees
     * @return Output of sec(degree) function
     */
    public static double sec(double degree) {
        double numerator = 1;
        double denominator = cos(degree);

        try {
            if (denomIsZero(denominator))
                throw new UndefinedException();
        } catch (UndefinedException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }

        double value = numerator / denominator;
        return value;
    }

    /**
     * Cosecant function
     *
     * @param degree input value in degrees
     * @return Output of csc(degree) function
     */
    public static double csc(double degree) {
        double numerator = 1;
        double denominator = sin(degree);

        try {
            if (denomIsZero(denominator))
                throw new UndefinedException();
        } catch (UndefinedException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }

        double value = numerator / denominator;
        return value;
    }

    /**
     * Cotangent function
     *
     * @param degree input value in degrees
     * @return Output of cot(degree) function
     */
    public static double cot(double degree) {
        double numerator = cos(degree);
        double denominator = sin(degree);

        try {
            if (denomIsZero(denominator))
                throw new UndefinedException();
        } catch (UndefinedException e) {
            System.out.println(e.getMessage());
            return Double.NaN;
        }

        double value = numerator / denominator;
        return value;
    }

    /**
     * Check if denominator of an equation is zero, within a certain level of
     * precision.
     *
     * @param denominator input value for use as a denominator
     * @return true if close enough to zero within 6 decimal places, false
     * otherwise.
     */
    private static boolean denomIsZero(double denominator) {
        Double absDenominator = (denominator < 0) ? -denominator : denominator;
        return (absDenominator < 0.000001) ? true : false;
    }

    /**
     * Power method limited to only raising the base to the exponent of an
     * integer
     *
     * @param base     Base value in double
     * @param exponent Exponent value in Int
     * @return returns the base raised to the exponent
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

    /**
     * Recursive function for calculating Factorial used for Taylor expansion
     *
     * @param n input n factorial
     * @return returns n! through recursion until base case (1) is reached
     */
    public static double factorial(double n) {
        if (n <= 1) // base case
            return 1;
        else
            return n * factorial(n - 1);
    }

    /**
     * return the absolute value
     *
     * @param target input
     * @return returns absolute value of target
     */
    public static double abs(double target) {
        return target > 0 ? target : -target;
    }

    /**
     * Arctan Function (tan inverse)
     *
     * @param rad input in radians
     * @return output of arctan(rad) function
     */
    public static double arctan(double rad) {
        double sum = rad;

        if (abs(rad) < 1) {
            for (int i = 1; i <= 56; i++) {
                if (i % 2 == 0)

                    sum += power(rad, 2 * i + 1) / (2 * i + 1);
                else
                    sum -= power(rad, 2 * i + 1) / (2 * i + 1);
            }
        } else if (rad > 1) {
            sum = PI / 2 - 1 / rad;
            for (int i = 1; i < 56; i++) {
                if (i % 2 == 0)
                    sum -= 1 / ((2 * i + 1) * (power(rad, 2 * i + 1)));
                else
                    sum += 1 / ((2 * i + 1) * (power(rad, 2 * i + 1)));
            }

        } else if (rad == 1) {
            sum = 0.7853981633974483;
        } else {
            sum = -PI / 2 - 1 / rad;
            for (int i = 1; i <= 56; i++) {
                if (i % 2 == 0)
                    sum -= 1 / ((2 * i + 1) * (power(rad, 2 * i + 1)));
                else
                    sum += 1 / ((2 * i + 1) * (power(rad, 2 * i + 1)));
            }

        }

        return sum;
    }

    /**
     * Arcsin Function (sin inverse)
     *
     * @param rad input in radians
     * @return output of arcsin(rad) function
     */
    public static double arcsin(double rad) {

        double sum = 0;

        double numerator;
        double denominator;

        double twoNFact;
        double NFact;

        if (abs(rad) > 1) {
            return sum = Double.NaN;
        } else if (rad == 1) {
            return sum = 1.5707963267948966;
        } else {
            for (int i = 0; i <= 65; i++) {
                twoNFact = factorial(2 * i);
                numerator = twoNFact;
                NFact = factorial(i);
                denominator = (power(2, 2 * i)) * (power(NFact, 2));
                sum += ((numerator / denominator) * (power(rad, 2 * i + 1)) / (2 * i + 1));

            }

            return sum;
        }

    }

    /**
     * Arccos Function (cos inverse)
     *
     * @param rad in radians
     * @return output of arccos(rad) function
     */
    public static double arccos(double rad) {
        double value;

        if (abs(rad) >= 1) {
            return value = Double.NaN;
        } else {

            value = PI / 2 - arcsin(rad);
            return value;
        }
    }

    /**
     * Arccot Function (cot inverse)
     *
     * @param rad in radians
     * @return output of arccot(rad) function
     */
    public static double arccot(double rad) {
        double value;
        double a = arctan(rad);
        if (a >= 0) {
            value = (PI / 2) - a;
            return value;
        } else {
            return value = (-PI / 2) - a;
        }

    }

    /**
     * Arcsec Function (sec inverse)
     *
     * @param rad in radians
     * @return output of arcsec(rad) function
     */
    public static double arcsec(double rad) {
        double value;
        if (abs(rad) <= 1)
            return value = Double.NaN;
        else {

            value = arccos(1.0 / rad);
            return value;
        }

    }

    /**
     * Arccsc Function (csc inverse)
     *
     * @param rad in radians
     * @return output of arccsc(rad) function
     */
    public static double arccsc(double rad) {
        double value;
        if (abs(rad) <= 1)
            return value = Double.NaN;
        else {

            value = arcsin(1.0 / rad);
            return value;
        }

    }

    public static Double arccsc(int degrees) {
        return arccsc(new Double(degrees));
    }

    public static Double arcsec(int degrees) {
        return arcsec(new Double(degrees));
    }

    public static Double arccot(int degrees) {
        return arccot(new Double(degrees));
    }

    public static Double arccos(int degrees) {
        return arccos(new Double(degrees));
    }

    public static Double arcsin(int degrees) {
        return arcsin(new Double(degrees));
    }

    public static Double arctan(int degrees) {
        return arctan(new Double(degrees));
    }

    // Methods for sin, cos, tan, sec, csc, cot to accept integer values
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
