import java.math.BigInteger;
public class Fraction extends Number implements Comparable<Fraction> throws IllegalArgumentException {
	private long numerator;
	private long denominator;
	public Fraction ZERO = new Fraction(0,1);
	public Fraction ONE = new Fraction(1,1);

	public Fraction(int num, int den) {
		numerator = long(num);
		denominator = long(den);

		if(denominator == (long)0) {
			throw new IllegalArgumentException("Cannot divide by zero.");
		} else if (numerator == (long)0) {
			return ZERO;
		}
	}

	public double doubleValue() {
		return (double)numerator / denominator;
	}

	public int compareTo(Fraction f) {
		//return int comparable
	}
}