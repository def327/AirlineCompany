/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.HashSet;
import java.util.Set;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class AircraftPark {

	private Set<Aircraft> aircraftListSet;
	private int amountOfAircraft;

	/**
	 * @param aircraftListSet
	 * @param amountOfAircraft
	 */
	public AircraftPark() {
		this.aircraftListSet = new HashSet<>();
		this.amountOfAircraft = 0;
	}

	/*
	 * This method add new aircraft to aircraftPark
	 * 
	 */
	public boolean addAirCraft(Aircraft newAircraft) {

		if (aircraftListSet.add(newAircraft)) {
			amountOfAircraft++;			//add counterAircraft from class Aircaft!!!
			return true;
		} else {
			return false;
		}
	}

	/*
	 * This method remove existing aircraft from aircraftPark
	 * 
	 */
	public boolean removeAircraft(Aircraft removingAircraft) {

		if (aircraftListSet.remove(removingAircraft)) {
			amountOfAircraft--;			//add counterAiracraft add counter from class Aircaft!!!
			return true;
		} else {
			return false;
		}
	}

	/*
	 * !!!
	 * This method return an amount value of all aircraft's peopleCapacity
	 * 
	 */
	public PeopleCapacity getTotalAmountPeopleCapacity() {
		int totalAmount = 0;
	
		for (Aircraft aircraft : aircraftListSet) {
			totalAmount = totalAmount + (int)aircraft.getBasicTechAircraftData().getPeopleCapacity().getMeasureValueInInt();
		}
		
		PeopleCapacity totalAmountPeopleCpacity = new PeopleCapacity(totalAmount);
		return totalAmountPeopleCpacity;
	}
	
	/*
	 * !!!
	 * This method return a total amount value of all aircraft's maxWeigthCapacity
	 * 
	 */	
	public Tons getTotalAmountWeigthCapacity(){
		int totalAmount = 0 ;
		
		for (Aircraft aircraft : aircraftListSet) {
			totalAmount = totalAmount + (int)aircraft.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInInt();
		}
		
		Tons totalAmountMaxWeigthCapacity = new Tons(totalAmount);
		return totalAmountMaxWeigthCapacity;
	}

	/*
	 * This method return a total value of all aicrafts at the aircraft park
	 */
	public int getTotalAmountOfAircraft() {
		return this.amountOfAircraft;
	}

	/**
	 * @return the aircraftListSet
	 */
	public Set<Aircraft> getAircraftListSet() {
		return aircraftListSet;
	}

	/**
	 * @param aircraftListSet the aircraftListSet to set
	 */
	public void setAircraftListSet(Set<Aircraft> aircraftListSet) {
		this.aircraftListSet = aircraftListSet;
	}

	/**
	 * @return the amountOfAircraft
	 */
	public int getAmountOfAircraft() {
		return amountOfAircraft;
	}

	/**
	 * @param amountOfAircraft the amountOfAircraft to set
	 */
	public void setAmountOfAircraft(int amountOfAircraft) {
		this.amountOfAircraft = amountOfAircraft;
	}

	@Override
	public String toString() {
		return "amountOfAircraft" + (this.amountOfAircraft);
	}

}
