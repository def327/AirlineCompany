/**
 * 
 */
package by.zyablov.airlinecompany.beans.company;

import java.util.Date;

import by.zyablov.airlinecompany.beans.AircraftPark;
import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class AirlineCompany extends Company {

	private AircraftPark aircraftPark;

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param today
	 * @param aircraftPark
	 */
	public AirlineCompany(int id, String name, String email, Date today, AircraftPark aircraftPark) {
		super(id, name, email, today);
		this.aircraftPark = aircraftPark;
	}

	/**
	 * 
	 */
	public AirlineCompany() {
		super();
		this.aircraftPark = new AircraftPark();
	}
	
	/*
	 * !!!
	 * This method @return true if new aircraft will be added to park successfully
	 *  else @return false
	 */
	public boolean addAircraftToPark(Aircraft newAircraft){
		return this.aircraftPark.addAirCraft(newAircraft);
	}
	
	/*
	 * !!!
	 * This method @return true if new aircraft will be removed to park successfully
	 * else @return false
	 */
	public boolean removeAircraftFromPark(Aircraft removingAircraft){
		return this.aircraftPark.removeAircraft(removingAircraft);
	}

	/*
	 * !!!
	 * This method calculate amount of all aircraft's people capacity
	 * 
	 */
	public PeopleCapacity getTotalAircraftsPeopleCapacity(){
		return this.aircraftPark.getTotalAmountPeopleCapacity();
	}
	
	/*
	 * !!!
	 * This method calculate amount of all aircraft's maxWeightCapacity
	 * 
	 */	
	public Tons getTotalAircraftsWeightCapacity(){
		return this.aircraftPark.getTotalAmountWeigthCapacity();
	}
	@Override
	public String toString() {
		return (super.toString() + "\n" + "amountOfAircraft = " + aircraftPark.getTotalAmountOfAircraft());
	}

	/**
	 * @return the aircraftPark
	 */
	public AircraftPark getAircraftPark() {
		return aircraftPark;
	}

	/**
	 * @param aircraftPark the aircraftPark to set
	 */
	public void setAircraftPark(AircraftPark aircraftPark) {
		this.aircraftPark = aircraftPark;
	}

	
}
