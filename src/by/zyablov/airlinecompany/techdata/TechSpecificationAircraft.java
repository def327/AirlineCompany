/**
 * 
 */
package by.zyablov.airlinecompany.techdata;

import by.zyablov.airlinecompany.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.measures.KilometerPerHour;
import by.zyablov.airlinecompany.measures.Tons;

/**
 * @author Дмитрий
 *
 */

public class TechSpecificationAircraft {

	private Tons maxWeigthCapacity;

	private FuelSpendTonPerKm fuelSpending;

	private KilometerPerHour midVelocity;

	/**
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 */
	public TechSpecificationAircraft(Tons maxWeigthCapacity, FuelSpendTonPerKm fuelSpending,
			KilometerPerHour midVelocity) {

		this.maxWeigthCapacity = maxWeigthCapacity;
		this.fuelSpending = fuelSpending;
		this.midVelocity = midVelocity;
	}

	/**
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 */
	public TechSpecificationAircraft() {
		this.maxWeigthCapacity = null;
		this.fuelSpending = null;
		this.midVelocity = null;
	}

	/**
	 * @return the maxWeigthCapacity
	 */
	public Tons getMaxWeigthCapacity() {

		return maxWeigthCapacity;
	}

	/**
	 * @param maxWeigthCapacity
	 *            the maxWeigthCapacity to set
	 */
	public void setMaxWeigthCapacity(Tons maxWeigthCapacity) {

		this.maxWeigthCapacity = maxWeigthCapacity;
	}

	/**
	 * @return the fuelSpending
	 */
	public FuelSpendTonPerKm getFuelSpending() {

		return fuelSpending;
	}

	/**
	 * @param fuelSpending
	 *            the fuelSpending to set
	 */
	public void setFuelSpending(FuelSpendTonPerKm fuelSpending) {

		this.fuelSpending = fuelSpending;
	}

	/**
	 * @return the midVelocity
	 */
	public KilometerPerHour getMidVelocity() {

		return midVelocity;
	}

	/**
	 * @param midVelocity
	 *            the midVelocity to set
	 */
	public void setMidVelocity(KilometerPerHour midVelocity) {

		this.midVelocity = midVelocity;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof TechSpecificationAircraft)) {
			return false;
		}

		TechSpecificationAircraft other = (TechSpecificationAircraft) obj;
		return (this.fuelSpending.equals(other.fuelSpending) && (this.maxWeigthCapacity.equals(other.maxWeigthCapacity))
				&& (this.midVelocity.equals(other.midVelocity)) );
	}

	@Override
	public String toString() {
		return fuelSpending.toString() + "\n" + maxWeigthCapacity + "\n" + midVelocity;
	}

}
