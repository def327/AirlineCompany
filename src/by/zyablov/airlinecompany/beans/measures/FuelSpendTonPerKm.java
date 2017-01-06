/**
 * 
 */
package by.zyablov.airlinecompany.beans.measures;

/**
 * @author Дмитрий
 *
 */
public class FuelSpendTonPerKm extends Measure {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6914592884036514919L;

	/**
	 * @param measureValue
	 */
	public FuelSpendTonPerKm(int fuelSpendTonPerKm) {
		super(fuelSpendTonPerKm);
	}

	public FuelSpendTonPerKm() {
		super(0);
	}

	@Override
	public int getMeasureValueInInt() {
		return measureValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see by.zyablov.airlinecompany.interfaces.Measureable#getMeasureValue()
	 */
	@Override
	public String getMeasureValueInString() {
		return this.measureValue + " tons / 1000km";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * by.zyablov.airlinecompany.interfaces.Measureable#setMeasureValue(int)
	 */
	@Override
	public void setMeasureIntValue(int fuelSpendTonPerKm) {
		super.measureValue = fuelSpendTonPerKm;
	}

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

	@Override
	public String toString() {
		return "fuelSpendTonPerKm = " + measureValue + " tons / 1000km";
	}

}
