/**
 * 
 */
package by.zyablov.airlinecompany.tools;

import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.company.AirlineCompany;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
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
	 * !!!  Get the List of aircrafts  from airline comapany park, which middle velocity parameter
	 * are included in the range  formed by values fromValueMidVelocity and toValueMidVelocity
	 * 
	 */
	public List<Aircraft> getListOfFoundAircraftsByMidVelocityRange(KilometerPerHour fromValueMidVelocity, KilometerPerHour toValueMidVelocity ){
		return (this.airlineCompany.getListOfFoundAicraftsByMidVelocityRange(fromValueMidVelocity, toValueMidVelocity));		
	}
	 

	/*
	 * !!!  Get the List of aircrafts  from airline comapany park, which fuelspending parameter
	 * are included in the range  formed by values fromValueFuelSpending and toValueFuelSpending
	 * 
	 */
	 public List<Aircraft> getListOfFoundAircraftsByFuelSpendingRange(FuelSpendTonPerKm fromValueFuelSpending, FuelSpendTonPerKm toValueFuelSpending) {
		return (this.airlineCompany.getListOfFoundAicraftsByFuelSpendingRange(fromValueFuelSpending,toValueFuelSpending));	
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
	 
	 /*
	  * !!! Get aircraft  from airline company park
	  */
	 public Aircraft getAircraftkById(int idAircraft){
		return (this.airlineCompany.getAircraftFormAircraftParkById(idAircraft));		 
	 }
	 
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
		return (this.airlineCompany.getTotalAircraftsPeopleCapacity());
	}

	/*
	 * !!! Calculate a total amount weight capacity of all aircrafts at the
	 * Aircraft park of airline company
	 * 
	 */
	public Tons calcTotalAircraftsWeigthCapacity() {
		return (this.airlineCompany.getTotalAircraftsWeightCapacity());
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
