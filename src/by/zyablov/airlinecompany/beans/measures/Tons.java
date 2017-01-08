
package by.zyablov.airlinecompany.beans.measures;

/**
 * Class {@code Tons} is an inheritor of {@code Measure} class. Represents is a
 * physical value of weight in tons.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Measure
 * 
 */
public class Tons extends Measure {

	/**
	 * This value is genereted by JVM to serialize {@code Tons} class.
	 */
	private static final long serialVersionUID = 8363057548547864061L;

	/**
	 * Return's a value of tons in int type.
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * Return's a string value of {@code Tons} object. Also, this method
	 * generates a string, which consist's of {@link Measure#measureValue
	 * measureValue} and " tons".
	 */
	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " tons";
	}

	/**
	 * Set's an int value for a measureValue field of {@code Tons} object.
	 * 
	 * @param tonsValue
	 *            - an int storage to keep a value of {@code Tons} object
	 */
	@Override
	public void setMeasureIntValue(int tonsValue) {
		this.measureValue = tonsValue;
	}

	/**
	 * Constructor.
	 * 
	 * @param tonsValue
	 *            - an int storage to keep a value of {@code Tons} object
	 */
	public Tons(int tonsValue) {
		super(tonsValue);
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - an int storage to keep a value of {@code Tons} object
	 */
	public Tons() {
		super(0);
	}

	/**
	 * Returns a string representation of {@code Tons} object.
	 * 
	 * @return a string, which is consisted of <i>measureValue</i> field of
	 *         {@code Tons} and <i>" tons"</i> string.
	 */
	@Override
	public String toString() {
		return "tonsValue = " + (this.measureValue) + " tons";
	}

	/**
	 * Indicates whether some other {@code Tons} object is "equal to " this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code Tons} object is the same as
	 *         obj argument; <b>{@code false}</b> otherwise.
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

		if (!(obj instanceof Tons)) {
			return false;
		}

		Tons other = (Tons) obj;
		return (this.measureValue == other.measureValue);
	}

}
