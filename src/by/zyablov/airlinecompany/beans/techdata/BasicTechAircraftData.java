/**
 * 
 */
package by.zyablov.airlinecompany.beans.techdata;

import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */

public class BasicTechAircraftData {

	private Tons maxWeigthCapacity;
	private FuelSpendTonPerKm fuelSpending;
	private KilometerPerHour midVelocity;
	private PeopleCapacity peopleCapacity;

	/**
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 */
	public BasicTechAircraftData(Tons maxWeigthCapacity, FuelSpendTonPerKm fuelSpending,
			KilometerPerHour midVelocity, PeopleCapacity peopleCapacity) {

		this.maxWeigthCapacity = maxWeigthCapacity;
		this.fuelSpending = fuelSpending;
		this.midVelocity = midVelocity;
		this.peopleCapacity = peopleCapacity;
	}

	/**
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 */
	public BasicTechAircraftData() {
		this.maxWeigthCapacity = new Tons();
		this.fuelSpending = new FuelSpendTonPerKm();
		this.midVelocity = new KilometerPerHour();
		this.peopleCapacity = new PeopleCapacity();
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

	/**
	 * @return the peopleCapacity
	 */
	public PeopleCapacity getPeopleCapacity() {
		return peopleCapacity;
	}

	/**
	 * @param peopleCapacity
	 *            the peopleCapacity to set
	 */
	public void setPeopleCapacity(PeopleCapacity peopleCapacity) {
		this.peopleCapacity = peopleCapacity;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof BasicTechAircraftData)) {
			return false;
		}

		BasicTechAircraftData other = (BasicTechAircraftData) obj;
		return ((this.fuelSpending.equals(other.fuelSpending)) && (this.maxWeigthCapacity.equals(other.maxWeigthCapacity))
				&& (this.midVelocity.equals(other.midVelocity)) && (this.peopleCapacity.equals(other.peopleCapacity)));
	}

	@Override
	public String toString() {
		return (this.fuelSpending + "\n" + this.maxWeigthCapacity + "\n" + this.midVelocity + "\n" + this.peopleCapacity);
	}

}