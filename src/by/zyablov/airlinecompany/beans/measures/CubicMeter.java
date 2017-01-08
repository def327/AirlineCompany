
package by.zyablov.airlinecompany.beans.measures;

/**
 * Class {@code CubicMeter} is an inheritor of {@code Measure} class. Represents
 * is a physical value of cubic meters to measure a volume.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Measure
 * 
 */
public class CubicMeter extends Measure {

	/**
	 * This value is genereted by JVM to serialize {@code CubicMeter} class
	 */
	private static final long serialVersionUID = -5102375310062773220L;

	/**
	 * Return's a value of cubic meters in int type.
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * Return's a string value of {@code CubicMeter} object.Also, this method
	 * generates a string, which consist's of {@link Measure#measureValue
	 * measureValue} and "M^3".
	 */
	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " M^3";
	}

	/**
	 * Set's an int value for a measureValue field of {@code CubicMeter} object.
	 * 
	 * @param cubicMetersValue
	 *            - an int storage to keep a value of {@code CubicMeter} object
	 * 
	 */
	@Override
	public void setMeasureIntValue(int cubicMetersValue) {
		this.measureValue = cubicMetersValue;
	}

	/**
	 * Constructor.
	 * 
	 * @param cubicMetersValue
	 *            - a storage to keep a value of {@code CubicMeter} object
	 */
	public CubicMeter(int cubicMetersValue) {
		super(cubicMetersValue);
	}

	/**
	 * Constructor.
	 * 
	 * @param cubicMetersValue
	 *            - a storage to keep a value of {@code CubicMeter} object
	 */
	public CubicMeter() {
		super(0);
	}

	/**
	 * Returns a string representation of {@code CubicMeter} object.
	 * 
	 * @return a string, which is consisted of <i>measureValue</i> field of
	 *         {@code CubicMeter} and <i>" M^3"</i> string.
	 */
	@Override
	public String toString() {
		return "cubicMetersValue = " + (this.measureValue) + " M^3";
	}

	/**
	 * Indicates whether some other {@code CubicMeter} object is "equal to "
	 * this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code CubicMeter} object is the same
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

		if (!(obj instanceof CubicMeter)) {
			return false;
		}

		CubicMeter other = (CubicMeter) obj;
		return (this.measureValue == other.measureValue);
	}
}
