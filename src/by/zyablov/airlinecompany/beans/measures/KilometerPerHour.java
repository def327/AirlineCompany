/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class KilometerPerHour extends Measure {

	private static final long serialVersionUID = 7246317486198153340L;

	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " km/h";
	}

	@Override
	public void setMeasureIntValue(int kilometrsPerHourValue) {
		this.measureValue = kilometrsPerHourValue;
	}

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param measureValue
	 */
	public KilometerPerHour(int kilometrsPerHourValue) {
		super(kilometrsPerHourValue);
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public KilometerPerHour() {
		super(0);
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "kilometrsPerHourValue = " + measureValue + " km/h";
	}

	/**
	 * !!! This method equals two KilometerPerHour
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
