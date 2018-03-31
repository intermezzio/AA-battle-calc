import java.math.BigInteger;
public class Fraction extends Number implements Comparable<Fraction> throws IllegalArgumentException {
	private long numerator;
	private long denominator;
	public Fraction ZERO = new Fraction(0,1);
	public Fraction ONE = new Fraction(1,1);

	public Fraction(int num, int den) {
		numerator = new BigInteger(num);
		denominator = new BigInteger(den);
	}
}