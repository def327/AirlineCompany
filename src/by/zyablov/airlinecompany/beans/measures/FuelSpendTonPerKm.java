/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class FuelSpendTonPerKm extends Measure {

	private static final long serialVersionUID = 6914592884036514919L;

	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " tons / 1000km";
	}

	@Override
	public void setMeasureIntValue(int fuelSpendTonPerKm) {
		super.measureValue = fuelSpendTonPerKm;
	}

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param measureValue
	 */
	public FuelSpendTonPerKm(int fuelSpendTonPerKm) {
		super(fuelSpendTonPerKm);
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public FuelSpendTonPerKm() {
		super(0);
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "fuelSpendTonPerKm = " + measureValue + " tons / 1000km";
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

		if (!(obj instanceof FuelSpendTonPerKm)) {
			return false;
		}

		FuelSpendTonPerKm other = (FuelSpendTonPerKm) obj;
		return (this.measureValue == other.measureValue);
	}
}
