/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class Kilometer extends Measure {

	private static final long serialVersionUID = -2846659323359916L;

	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " km";
	}

	@Override
	public void setMeasureIntValue(int kilometrsValue) {
		this.measureValue = kilometrsValue;
	}

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param measureValue
	 */
	public Kilometer(int kilometrsValue) {
		super(kilometrsValue);
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public Kilometer() {
		super(0);
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "kilometrsValue = " + measureValue + " km";
	}

	/**
	 * !!! This method equals two FuelSpendTonPerKm
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
