/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class CubicMeter extends Measure {

	private static final long serialVersionUID = -5102375310062773220L;

	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " M^3";
	}

	@Override
	public void setMeasureIntValue(int cubicMetersValue) {
		this.measureValue = cubicMetersValue;
	}

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param cubicMetersValue
	 */
	public CubicMeter(int cubicMetersValue) {
		super(cubicMetersValue);
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public CubicMeter() {
		super(0);
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "cubicMetersValue = " + measureValue + " M^3";
	}

	/**
	 * !!! This method equals two CubicMeters
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
