/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.company.AirlineCompany;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class AirlineManageSystem {

	AirlineCompany airlineCompany;

	/**
	 * @param airlineCompany
	 */
	public AirlineManageSystem() {
		this.airlineCompany = new AirlineCompany();
	}

//	/*
//	 * !!! Find a necessary aircraft by it's fuelSpending
//	 * 
//	 */
//	 public Aircraft findAircrafByFuelSpending() {
//	
//	 }
//	
//	/*
//	 * !!!Sort aircrafts by  their midVelocity 
//	 * 
//	 */
//	 public Aircraft sortAircraftsByMidVelocity() {
//	
//	 }
	
	/*
	 * !!! Add new aircraft to aircraft park of the airliner company
	 * 
	 */
	public boolean addAircraft(Aircraft newAircraft) {
		return this.airlineCompany.addAircraftToPark(newAircraft);
	}

	/*
	 * !!! Remove existing aircraft from aircraft park of the airliner company
	 * 
	 */
	public boolean removeAircraft(Aircraft removingAircraft) {
		return this.airlineCompany.removeAircraftFromPark(removingAircraft);
	}

	/*
	 * !!! Calculate a total amount people capacity of all aircrafts at the
	 * Aircraft park of airline company
	 * 
	 */
	public PeopleCapacity calculateTotalPeopleCapacity() {
		return this.airlineCompany.getTotalAircraftsPeopleCapacity();
	}

	/*
	 * !!! Calculate a total amount weight capacity of all aircrafts at the
	 * Aircraft park of airline company
	 * 
	 */
	public Tons calcTotalAircraftsWeigthCapacity() {
		return this.airlineCompany.getTotalAircraftsWeightCapacity();
	}

	/**
	 * @return the airlineCompany
	 */
	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}

	/**
	 * @param airlineCompany
	 *            the airlineCompany to set
	 */
	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}

}
