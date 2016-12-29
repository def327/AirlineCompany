/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.List;

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

	/*
	 * !!! Find a necessary aircraft by it's fuelSpending
	 * 
	 */
	 public Aircraft findAircrafByFuelSpending() {
		return null;
	
	 }
	
	/*
	 * !!! Get the List of sort aircrafts by their middle velocity 
	 * 
	 */
	 public List<Aircraft> getListOfSortAircraftsByMidVelocity() {
		return (this.airlineCompany.getListOfSortedAircraftsByMidVelocity());	
	 }
	
	/*
	 * !!! Get the List of sort aircrafts by  their maximum people capacity
	 * 
	 */
	 public List<Aircraft> getListOfSortAircraftByPeopleCapacity(){
		 return (this.airlineCompany.getListOfSortedAircraftByPeopleCapacity());
	 }
	 
	 /*
	 * !!! Get the List of sort aicrafts by their fuel spending ()
	 * 
	 */
	 public List<Aircraft> getListOfSortAicraftByFuelSpending(){
		 return (this.airlineCompany.getListOfSortedAircraftByFuelSpending());
	 }
	 
	 /*
	 * !!! Get the List of sort aicrafts by their maximum weight capacity
	 */
	 public List<Aircraft> getListOfSortAicraftByMaxWeightCapacity(){
		 return (this.airlineCompany.getListOfSortedAircraftByMaxWeightCapacity());
	 }
	 
	  
	 /**
	  * 	FIX methods to remove and to delete aircraft
	  * 
	  */
	 
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
	
//---------------------------------------------------------------------------------		
//---------------------------------------------------------------------------------
	
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
