
package by.zyablov.airlinecompany.beans.measures;

/**
 * Class {@code Kilometer} is an inheritor of {@code Measure} class. Represents
 * is a physical value of kilometers to measure a distance.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Measure
 * 
 */
public class Kilometer extends Measure {

	/**
	 * This value is genereted by JVM to serialize {@code Kilometer} class
	 */
	private static final long serialVersionUID = -2846659323359916L;

	/**
	 * Return's a value of kilometers in int type.
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * Return's a string value of {@code Kilometer} object.Also, this method
	 * generates a string, which consist's of {@link Measure#measureValue
	 * measureValue} and "km".
	 */
	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " km";
	}

	/**
	 * Set's an int value for a measureValue field of {@code Kilometer} object.
	 * 
	 * @param kilometrsValue
	 *            - an int storage to keep a value of {@code Kilometer} object
	 */
	@Override
	public void setMeasureIntValue(int kilometrsValue) {
		this.measureValue = kilometrsValue;
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - an int storage to keep a value of {@code Kilometer} object
	 */
	public Kilometer(int kilometrsValue) {
		super(kilometrsValue);
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - an int storage to keep a value of {@code Kilometer} object
	 * 
	 */
	public Kilometer() {
		super(0);
	}

	/**
	 * Returns a string representation of {@code Kilometer} object.
	 * 
	 * @return a string, which is consisted of <i>measureValue</i> field of
	 *         {@code Kilometer} and <i>" km"</i> string.
	 */
	@Override
	public String toString() {
		return "kilometrsValue = " + (this.measureValue) + " km";
	}

	/**
	 * Indicates whether some other {@code Kilometer} object is "equal to " this
	 * one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code Kilometer} object is the same
	 *         as obj argument; <b>{@code false}</b> otherwise.
	 * 
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Kilometer)) {
			return false;
		}

		Kilometer other = (Kilometer) obj;
		return (this.measureValue == other.measureValue);
	}
}
