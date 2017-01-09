
package by.zyablov.airlinecompany.beans.measures;

/**
 * Class {@code FuelSpendTonPerKm} is an inheritor of {@code Measure} class.
 * Represents is a physical value of fuel consumption in tons per 1000
 * kilometers.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Measure
 * 
 */
public class FuelSpendTonPerKm extends Measure {

	/**
	 * This value is genereted by JVM to serialize {@code FuelSpendTonPerKm}
	 * class.
	 */
	private static final long serialVersionUID = 6914592884036514919L;

	/**
	 * Return's a value of fuel consumption in tons per 1000 kilometers int
	 * type.
	 */
	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/**
	 * Return's a string value of {@code FuelSpendTonPerKm} object.Also, this
	 * method generates a string, which consist's of {@link Measure#measureValue
	 * measureValue} and "tons / 1000km".
	 */
	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " tons / 1000km";
	}

	/**
	 * Set's an int value for a measureValue field of {@code FuelSpendTonPerKm}
	 * object.
	 * 
	 * @param fuelSpendTonPerKm
	 *            - a int storage to keep a value of {@code FuelSpendTonPerKm}
	 *            object
	 */
	@Override
	public void setMeasureIntValue(int fuelSpendTonPerKm) {
		super.measureValue = fuelSpendTonPerKm;
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - a storage to keep a value of {@code FuelSpendTonPerKm}
	 *            object
	 */
	public FuelSpendTonPerKm(int fuelSpendTonPerKm) {
		super(fuelSpendTonPerKm);
	}

	/**
	 * Constructor.
	 * 
	 * @param measureValue
	 *            - a storage to keep a value of {@code FuelSpendTonPerKm}
	 *            object
	 */
	public FuelSpendTonPerKm() {
		super(0);
	}

	/**
	 * Returns a string representation of {@code FuelSpendTonPerKm} object.
	 * 
	 * @return a string, which is consisted of <i>measureValue</i> field of
	 *         {@code FuelSpendTonPerKm} and <i>" tons / 1000km"</i> string.
	 */
	@Override
	public String toString() {
		return "fuelSpendTonPerKm = " + measureValue + " tons / 1000km";
	}

	/**
	 * Indicates whether some other {@code FuelSpendTonPerKm} object is "equal
	 * to " this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code FuelSpendTonPerKm} object is
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

		if (!(obj instanceof FuelSpendTonPerKm)) {
			return false;
		}

		FuelSpendTonPerKm other = (FuelSpendTonPerKm) obj;
		return (this.measureValue == other.measureValue);
	}
}
