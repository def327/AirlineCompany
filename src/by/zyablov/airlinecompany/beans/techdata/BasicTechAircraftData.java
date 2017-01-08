
package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * Class {@code BasicTechAircraftData} represents a basic technical information
 * for {@code Aircraft} class such as maximum weight capacity, fuel spending in
 * tons per kilometer, middle velocity in kilometers per hour and maximum people
 * capacity of aircraft to transport.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see Tons
 * @see FuelSpendTonPerKm
 * @see KilometerPerHour
 * @see PeopleCapacity
 * 
 */
public class BasicTechAircraftData implements Serializable {

	/**
	 * This value is genereted by JVM to serialize {@code BasicTechAircraftData}
	 * class
	 */
	private static final long serialVersionUID = 8074903153153914987L;

	/**
	 * This field is a value of maximum weight capacity for {@code Aircraft}
	 * object.
	 */
	private Tons maxWeigthCapacity;

	/**
	 * This field is a value of an average fuel spending in tons per kilometer
	 * for {@code Aircraft} object.
	 */
	private FuelSpendTonPerKm fuelSpending;

	/**
	 * This field is a value of middle velocity in kilometers per hour for
	 * {@code Aircraft} object.
	 */
	private KilometerPerHour middleVelocity;

	/**
	 * This field is a value of maximum people capacity for {@code Aircraft}
	 * object.
	 */
	private PeopleCapacity maxPeopleCapacity;

	/**
	 * Constructor.
	 * 
	 * @param maxWeigthCapacity
	 *            - a value of maximum weight capacity
	 * @param fuelSpending
	 *            - a value of an average fuel spending in tons per kilometer
	 * @param midVelocity
	 *            - a value of middle velocity in kilometers per hour
	 * @param peopleCapacity
	 *            - a value of maximum people capacity
	 */
	public BasicTechAircraftData(Tons maxWeigthCapacity, FuelSpendTonPerKm fuelSpending, KilometerPerHour midVelocity,
			PeopleCapacity peopleCapacity) {

		this.maxWeigthCapacity = maxWeigthCapacity;
		this.fuelSpending = fuelSpending;
		this.middleVelocity = midVelocity;
		this.maxPeopleCapacity = peopleCapacity;
	}

	/**
	 * Constructor.
	 * 
	 * @param maxWeigthCapacity
	 *            - a value of maximum weight capacity
	 * @param fuelSpending
	 *            - a value of an average fuel spending in tons per kilometer
	 * @param midVelocity
	 *            - a value of middle velocity in kilometers per hour
	 * @param peopleCapacity
	 *            - a value of maximum people capacity
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
	 * Returns a string representation of {@code BasicTechAircraftData} object.
	 * 
	 * @return a string, which is consisted of
	 *         <i>fuelSpending</i>,<i>maxWeigthCapacity</i>,
	 *         <i>middleVelocity</i> and <i>maxPeopleCapacity</i> fields of
	 *         {@code BasicTechAircraftData}.
	 */
	@Override
	public String toString() {
		return ((this.fuelSpending) + "\n" + (this.maxWeigthCapacity) + "\n" + (this.middleVelocity) + "\n"
				+ (this.maxPeopleCapacity));
	}

	/**
	 * Indicates whether some other {@code BasicTechAircraftData} object is
	 * "equal to " this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code BasicTechAircraftData} object
	 *         is the same as obj argument; <b>{@code false}</b> otherwise.
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
