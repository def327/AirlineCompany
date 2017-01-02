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

	/**
	 * 
	 */
	private static final long serialVersionUID = 8074903153153914987L;
	
	
	
	private Tons maxWeigthCapacity;
	private FuelSpendTonPerKm fuelSpending;
	private KilometerPerHour midVelocity;
	private PeopleCapacity maxPeopleCapacity;

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
		this.maxPeopleCapacity = peopleCapacity;
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
		this.maxPeopleCapacity = new PeopleCapacity();
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
	 * @return the maxPeopleCapacity
	 */
	public PeopleCapacity getMaxPeopleCapacity() {
		return maxPeopleCapacity;
	}

	/**
	 * @param maxPeopleCapacity the maxPeopleCapacity to set
	 */
	public void setMaxPeopleCapacity(PeopleCapacity maxPeopleCapacity) {
		this.maxPeopleCapacity = maxPeopleCapacity;
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
				&& (this.midVelocity.equals(other.midVelocity)) && (this.maxPeopleCapacity.equals(other.maxPeopleCapacity)));
	}

	@Override
	public String toString() {
		return (this.fuelSpending + "\n" + this.maxWeigthCapacity + "\n" + this.midVelocity + "\n" + this.maxPeopleCapacity);
	}


}
