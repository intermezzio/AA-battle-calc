import java.math.BigInteger;
import java.util.ArrayList;

public class Fraction {
	private long numerator;
	private long denominator;
	public Fraction ZERO = new Fraction(0,1);
	public Fraction ONE = new Fraction(1,1);

	public Fraction(long num, long den) {
		long numerator = (long)num;
		long denominator = (long)den;

		if(denominator == (long)0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		} else if (numerator == (long)0) {
			numerator = 0;
			denominator = 1;
		}
	}

	public double doubleValue() {
		return (double)numerator / denominator;
	}

	public Fraction add(Fraction f) {
		long num = (long)f.numerator * denominator + (long)numerator * f.denominator;
		long den = (long) denominator * f.denominator;
		return new Fraction(num, den);
	}

	public Fraction multiply(Fraction f) {
		long num = (long)f.numerator * numerator;
		long den = (long)f.numerator * denominator;
		return new Fraction(num, den);
	}

	public Fraction subtract(Fraction f) {
		return add(f.negate());
	}

	public Fraction anti() {
		return new Fraction(denominator - numerator, denominator);
	}

	public Fraction negate() {
		return new Fraction(-1 * numerator, denominator);
	}

	public int compareTo(Fraction f) {
		//return int comparable
	  return 0;
	}
	/** Fraction Probability
	  * 		
	 */
	public static void appendFraction(ArrayList<Fraction> chances, Fraction f) {
		Fraction x = f.anti();
		chances.add(f.multiply(chances.get(chances.size() - 1)));
		for(int i = chances.size() - 1; i >= 1; i--) {
			chances.set(i, x.multiply(chances.get(i-1)).add(f.multiply(chances.get(i))));
		}
		chances.set(0, f.multiply(chances.get(0)));
		return;
	}
}