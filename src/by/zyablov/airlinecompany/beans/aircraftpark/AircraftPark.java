
package by.zyablov.airlinecompany.beans.aircraftpark;

import java.util.HashSet;
import java.util.Set;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;

/**
 * Class {@code AircraftPark} represents a container, which includes aircrafts
 * object's. Also airline company has such container to storage different
 * aicrafts.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see  Aircraft
 * @see  by.zyablov.airlinecompany.beans.company.AirlineCompany
 *
 */
public class AircraftPark {

	/**
	 * This value is used to storage aircrafts.
	 */
	private Set<Aircraft> aircraftSet;

	/**
	 * This value is used to storage an amount of aircraft objects
	 * 
	 * @see {@link by.zyablov.airlinecompany.beans.aircrafts.Aircraft};
	 */
	private int aircraftsAmount;

	/**
	 * 
	 * This method adds a new {@code Aircraft} object to {@code AircraftPark}.
	 * After succseful adding, also this method increments
	 * <i>{@code aircraftsAmount}</i> field of {@code AircraftPark}.
	 * 
	 * @param newAircraft
	 *            an {@code Aircraft} object, which needs to add to
	 *            {@code AircraftPark}.
	 * @return <b>{@code true}</b> if an {@code Aircraft} object is added
	 *         successfully; <b>{@code false}</b> otherwise.
	 * 
	 * @see {@link by.zyablov.airlinecompany.beans.aircrafts.Aircraft};
	 * 
	 */
	public boolean addAirCraft(Aircraft newAircraft) {

		if (aircraftSet.add(newAircraft)) {
			aircraftsAmount++;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method remove an existing {@code Aircraft} object from
	 * {@code AircraftPark}.
	 * 
	 * After succseful removing, also this method decrements
	 * <i>{@code aircraftsAmount}</i> field of {@code AircraftPark}.
	 * 
	 * @param removingAircraft
	 *            an {@code Aircraft} object, which needs to remove from
	 *            {@code AircraftPark}.
	 * @return <b>{@code true}</b> if an {@code Aircraft} object is removed
	 *         successfully; <b>{@code false}</b> otherwise.
	 * 
	 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
	 */
	public boolean removeAircraft(Aircraft removingAircraft) {

		if (aircraftSet.remove(removingAircraft)) {
			aircraftsAmount--;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Returns a {@code PeopleCapacity} object, which includes a total amount of
	 * people capacity of all {@code Aircraft} objects in current
	 * {@code AircraftPark}.
	 * 
	 * 
	 * @return {@code PeopleCapacity} a total amount of {@code PeopleCapacity}
	 *         objects of {@code Aircraft} objects in in current
	 *         {@code AircraftPark}.
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 *             
	 * @see PeopleCapacity
	 * 
	 */
	public PeopleCapacity getTotalAmountPeopleCapacity() throws AircraftEmptyParkException {

		if (this.aircraftsAmount == 0) {
			throw new AircraftEmptyParkException();
		}

		int totalAmountPeopleCapacityInt = 0;

		for (Aircraft aircraft : aircraftSet) {
			totalAmountPeopleCapacityInt = totalAmountPeopleCapacityInt
					+ (int) aircraft.getBasicTechAircraftData().getMaxPeopleCapacity().getMeasureValueInInt();
		}

		PeopleCapacity totalAmountPeopleCpacity = new PeopleCapacity(totalAmountPeopleCapacityInt);
		return totalAmountPeopleCpacity;
	}

	/**
	 * Returns a {@code Tons} object, which includes a total amount of
	 * weight capacity of all {@code Aircraft} objects in current
	 * {@code AircraftPark}.
	 * 
	 * 
	 * @return {@code Tons} a total amount of weight capacity in {@code Tons}
	 *         objects of {@code Aircraft} objects in in current
	 *         {@code AircraftPark}.
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 */
	public Tons getTotalAmountWeigthCapacity() throws AircraftEmptyParkException {

		if (this.aircraftsAmount == 0) {
			throw new AircraftEmptyParkException();
		}

		int totalAmountWieghtCapacityInt = 0;

		for (Aircraft aircraft : aircraftSet) {
			totalAmountWieghtCapacityInt = totalAmountWieghtCapacityInt
					+ (int) aircraft.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInInt();
		}

		Tons totalAmountMaxWeigthCapacity = new Tons(totalAmountWieghtCapacityInt);
		return totalAmountMaxWeigthCapacity;
	}

	/**
	 * Returns a total amount of {@code Aircraft} objects at the aircraft park
	 * 
	 * @return aircraftsAmount - a total {@code Aircraft} objects in the
	 *         {@code AircraftPark}
	 * 
	 */
	public int getTotalAircraftsAmount() {
		return this.aircraftsAmount;
	}

	/**
	 * Constructor.
	 * 
	 * @param aircraftSet
	 *            - a HashSet collection to storage {@code Aircraft} objects
	 * @param aircraftsAmount
	 *            - a total amount of {@code Aircraft} objects
	 */
	public AircraftPark() {
		this.aircraftSet = new HashSet<>();
		this.aircraftsAmount = 0;
	}

	public Set<Aircraft> getAircraftSet() {
		return aircraftSet;
	}

	public void setAircraftSet(Set<Aircraft> aircraftSet) {
		this.aircraftSet = aircraftSet;
	}

	public int getAicraftsAmount() {
		return this.aircraftsAmount;
	}

	public void setAicraftsAmount(int amountOfAircraft) {
		this.aircraftsAmount = amountOfAircraft;
	}

	/**
	 * Returns a string representation of {@code AircraftPark} object.
	 * 
	 * @return a string, which is consisted of <i>aircraftsAmount</i> field of
	 *         {@code AircraftPark}.
	 */
	@Override
	public String toString() {
		return "amountOfAircraft" + (this.aircraftsAmount);
	}

}
