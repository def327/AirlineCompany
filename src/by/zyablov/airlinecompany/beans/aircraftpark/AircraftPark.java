/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircraftpark;

import java.util.HashSet;
import java.util.Set;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;

/**
 * @author Дмитрий
 *
 */
public class AircraftPark {

	private Set<Aircraft> aircraftSet;
	private int aircraftsAmount;

	/**
	 * @param aircraftSet
	 * @param aircraftsAmount
	 */
	public AircraftPark() {
		this.aircraftSet = new HashSet<>();
		this.aircraftsAmount = 0;
	}

	/**
	 * !!! This method add new aircraft to aircraftPark
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
	 * !!! This method remove existing aircraft from aircraftPark
	 * 
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
	 * !!! This method return an amount value of all aircraft's peopleCapacity
	 * 
	 */
	public PeopleCapacity getTotalAmountPeopleCapacity() throws AircraftEmptyParkException {
		
		if(this.aircraftsAmount == 0){
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
	 * !!! This method return a total amount value of all aircraft's
	 * maxWeigthCapacity
	 * 
	 */
	public Tons getTotalAmountWeigthCapacity() throws AircraftEmptyParkException {
		
		if(this.aircraftsAmount == 0){
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
	 * !!! This method return a total amount of aircrafts at the aircraft park
	 * 
	 */
	public int getTotalAircraftsAmount() {
		return this.aircraftsAmount;
	}

	/**
	 * @return the aircraftListSet
	 */
	public Set<Aircraft> getAircraftSet() {
		return aircraftSet;
	}

	/**
	 * @param aircraftListSet
	 *            the aircraftListSet to set
	 */
	public void setAircraftSet(Set<Aircraft> aircraftSet) {
		this.aircraftSet = aircraftSet;
	}

	/**
	 * @return the amountOfAircraft
	 */
	public int getAicraftsAmount() {
		return this.aircraftsAmount;
	}

	/**
	 * @param amountOfAircraft
	 *            the amountOfAircraft to set
	 */
	public void setAicraftsAmount(int amountOfAircraft) {
		this.aircraftsAmount = amountOfAircraft;
	}

	@Override
	public String toString() {
		return "amountOfAircraft" + (this.aircraftsAmount);
	}


}
