/**
 * 
 */
package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;

import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */

public class BasicTechAircraftData implements Serializable {

	private static final long serialVersionUID = 8074903153153914987L;

	private Tons maxWeigthCapacity;
	private FuelSpendTonPerKm fuelSpending;
	private KilometerPerHour middleVelocity;
	private PeopleCapacity maxPeopleCapacity;

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 */
	public BasicTechAircraftData(Tons maxWeigthCapacity, FuelSpendTonPerKm fuelSpending, KilometerPerHour midVelocity,
			PeopleCapacity peopleCapacity) {

		this.maxWeigthCapacity = maxWeigthCapacity;
		this.fuelSpending = fuelSpending;
		this.middleVelocity = midVelocity;
		this.maxPeopleCapacity = peopleCapacity;
	}

	/**
	 * !!! This a constuctor without parameters
	 * 
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param middleVelocity
	 */
	public BasicTechAircraftData() {
		this.maxWeigthCapacity = new Tons();
		this.fuelSpending = new FuelSpendTonPerKm();
		this.middleVelocity = new KilometerPerHour();
		this.maxPeopleCapacity = new PeopleCapacity();
	}

	public Tons getMaxWeigthCapacity() {
		return maxWeigthCapacity;
	}

	public void setMaxWeigthCapacity(Tons maxWeigthCapacity) {
		this.maxWeigthCapacity = maxWeigthCapacity;
	}

	public FuelSpendTonPerKm getFuelSpending() {
		return fuelSpending;
	}

	public void setFuelSpending(FuelSpendTonPerKm fuelSpending) {
		this.fuelSpending = fuelSpending;
	}

	public KilometerPerHour getMiddleVelocity() {
		return middleVelocity;
	}

	public void setMiddleVelocity(KilometerPerHour middleVelocity) {
		this.middleVelocity = middleVelocity;
	}

	public PeopleCapacity getMaxPeopleCapacity() {
		return maxPeopleCapacity;
	}

	public void setMaxPeopleCapacity(PeopleCapacity maxPeopleCapacity) {
		this.maxPeopleCapacity = maxPeopleCapacity;
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return (this.fuelSpending + "\n" + this.maxWeigthCapacity + "\n" + this.middleVelocity + "\n"
				+ this.maxPeopleCapacity);
	}

	/**
	 * !!! This method equals two BasicTechAircraftData
	 */
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
		return ((this.fuelSpending.equals(other.fuelSpending))
				&& (this.maxWeigthCapacity.equals(other.maxWeigthCapacity))
				&& (this.middleVelocity.equals(other.middleVelocity))
				&& (this.maxPeopleCapacity.equals(other.maxPeopleCapacity)));
	}
}
