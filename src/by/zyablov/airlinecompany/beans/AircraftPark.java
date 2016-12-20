/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.ArrayList;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class AircraftPark {

	private List<Aircraft> listAircrafts;
	private int amountOfAircraft;

	/**
	 * @param listAircrafts
	 * @param amountOfAircraft
	 */
	public AircraftPark() {
		this.listAircrafts = new ArrayList<>();
		this.amountOfAircraft = 0;
	}

	/*
	 * This method add new aircraft to aircraftPark
	 * 
	 */
	public boolean addAirCraft(Aircraft newAircraft) {

		if (listAircrafts.add(newAircraft)) {
			amountOfAircraft++;
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

		if (listAircrafts.remove(removingAircraft)) {
			amountOfAircraft--;
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
	
		for (Aircraft aircraft : listAircrafts) {
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
		
		for (Aircraft aircraft : listAircrafts) {
			totalAmount = totalAmount + (int)aircraft.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInInt();
		}
		
		Tons totalAmountMaxWeigthCapacity = new Tons(totalAmount);
		return totalAmountMaxWeigthCapacity;
	}

	/*
	 * !!!
	 * This method return a total amount of all aircrafts at the aircraft park
	 * 
	 */
	public int getTotalAmountOfAircraft() {
		return this.amountOfAircraft;
	}

	public List<Aircraft> getListOfAircrafts() {
		return this.listAircrafts;
	}

	@Override
	public String toString() {
		return "amountOfAircraft" + this.amountOfAircraft;
	}

}
