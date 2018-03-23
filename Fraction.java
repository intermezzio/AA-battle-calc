import java.math.BigInteger;
public class Fraction extends Number implements Comparable<Fraction> {
	private BigInteger numerator;
	private BigInteger denominator;

	public Fraction(int num, int den) {
		numerator = new BigInteger(num);
		denominator = new BigInteger(den);
	}
}