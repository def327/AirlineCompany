
package by.zyablov.airlinecompany.beans.measures;

/**
 * Class {@code KilometerPerHour} is an inheritor of {@code Measure} class.
 * Represents is a physical value of speed in kilometers per hour.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Measure
 * 
 */
public class KilometerPerHour extends Measure {

	/**
	 * This value is genereted by JVM to serialize {@code KilometerPerHour}
	 * class.
	 */
	private static final long serialVersionUID = 7246317486198153340L;

	/**
	 * Return's a value of kilometers per hour in int type.
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * Return's a string value of {@code KilometerPerHour} object.Also, this
	 * method generates a string, which consist's of {@link Measure#measureValue
	 * measureValue} and " km/h".
	 */
	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " km/h";
	}

	/**
	 * Set's an int value for a measureValue field of {@code KilometerPerHour}
	 * object.
	 * 
	 * @param kilometrsValue
	 *            - an int storage to keep a value of {@code KilometerPerHour}
	 *            object
	 */
	@Override
	public void setMeasureIntValue(int kilometrsPerHourValue) {
		this.measureValue = kilometrsPerHourValue;
	}

	/**
	 * Constructor.
	 * 
	 * @param kilometrsPerHourValue
	 *            - an int storage to keep a value of {@code KilometerPerHour}
	 *            object
	 */
	public KilometerPerHour(int kilometrsPerHourValue) {
		super(kilometrsPerHourValue);
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - an int storage to keep a value of {@code KilometerPerHour}
	 *            object
	 */
	public KilometerPerHour() {
		super(0);
	}

	/**
	 * Returns a string representation of {@code KilometerPerHour} object.
	 * 
	 * @return a string, which is consisted of <i>measureValue</i> field of
	 *         {@code KilometerPerHour} and <i>" km/h"</i> string.
	 */
	@Override
	public String toString() {
		return "kilometrsPerHourValue = " + (this.measureValue) + " km/h";
	}

	/**
	 * Indicates whether some other {@code KilometerPerHour} object is "equal to
	 * " this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code KilometerPerHour} object is
	 *         the same as obj argument; <b>{@code false}</b> otherwise.
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

		if (!(obj instanceof KilometerPerHour)) {
			return false;
		}

		KilometerPerHour other = (KilometerPerHour) obj;
		return (this.measureValue == other.measureValue);
	}
}
