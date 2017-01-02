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
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;

/**
 * @author Дмитрий
 *
 */
public class AirlineManageSystem {

	private AirlineCompany airlineCompany;

	/**
	 * @param airlineCompany
	 */
	public AirlineManageSystem() {
		this.airlineCompany = null;
	}
	
	/*
	 * !!! Get the list of all aircrafts from airline company park
	 */
	public List<Aircraft> getListOfAicrafts() throws NoAirlineCompanyException{
		
		if(this.airlineCompany == null){
			throw new NoAirlineCompanyException();
		}
		
		return (this.airlineCompany.getListOfAircrafts());		
	}
	
	/*
	 * !!!  Get the List of aircrafts  from airline company park, which middle velocity parameter
	 * are included in the range  formed by values fromValueMidVelocity and toValueMidVelocity
	 * 
	 */
	public List<Aircraft> getListOfFoundAircraftsByMidVelocityRange(KilometerPerHour fromValueMidVelocity, KilometerPerHour toValueMidVelocity ) throws NoAirlineCompanyException{
		
		if(this.airlineCompany == null){
			throw new NoAirlineCompanyException();
		}
		
		return (this.airlineCompany.getListOfFoundAicraftsByMidVelocityRange(fromValueMidVelocity, toValueMidVelocity));		
	}
	 

	/*
	 * !!!  Get the List of aircrafts  from airline comapany park, which fuelspending parameter
	 * are included in the range  formed by values fromValueFuelSpending and toValueFuelSpending
	 * 
	 */
	 public List<Aircraft> getListOfFoundAircraftsByFuelSpendingRange(FuelSpendTonPerKm fromValueFuelSpending, FuelSpendTonPerKm toValueFuelSpending) throws NoAirlineCompanyException, AircraftEmptyParkException {
		 
			if(this.airlineCompany == null){
				throw new NoAirlineCompanyException();
			}
		 
		return (this.airlineCompany.getListOfFoundAicraftsByFuelSpendingRange(fromValueFuelSpending,toValueFuelSpending));	
	 }
	
	/*
	 * !!! Get the List of sort aircrafts by their middle velocity 
	 * 
	 */
	 public List<Aircraft> getListOfSortAircraftsByMidVelocity() throws NoAirlineCompanyException, AircraftEmptyParkException {
		 
			if(this.airlineCompany == null){
				throw new NoAirlineCompanyException();
			}
		 
		return (this.airlineCompany.getListOfSortedAircraftsByMidVelocity());	
	 }
	
	/*
	 * !!! Get the List of sort aircrafts by  their maximum people capacity
	 * 
	 */
	 public List<Aircraft> getListOfSortAircraftByPeopleCapacity() throws NoAirlineCompanyException, AircraftEmptyParkException{
		 
			if(this.airlineCompany == null){
				throw new NoAirlineCompanyException();
			}
		 
		 return (this.airlineCompany.getListOfSortedAircraftByPeopleCapacity());
	 }
	 
	 /*
	 * !!! Get the List of sort aicrafts by their fuel spending ()
	 * 
	 */
	 public List<Aircraft> getListOfSortAicraftByFuelSpending() throws NoAirlineCompanyException, AircraftEmptyParkException{
		 
			if(this.airlineCompany == null){
				throw new NoAirlineCompanyException();
			}
		 
		 return (this.airlineCompany.getListOfSortedAircraftByFuelSpending());
	 }
	 
	 /*
	 * !!! Get the List of sort aicrafts by their maximum weight capacity
	 */
	 public List<Aircraft> getListOfSortAicraftByMaxWeightCapacity() throws NoAirlineCompanyException, AircraftEmptyParkException{
		 
			if(this.airlineCompany == null){
				throw new NoAirlineCompanyException();
			}
		 
		 return (this.airlineCompany.getListOfSortedAircraftByMaxWeightCapacity());
	 }
	 
	 /*
	  * !!! Get aircraft  from airline company park
	  */
	 public Aircraft getAircraftkById(int idAircraft) throws NoAirlineCompanyException{
		 
			if(this.airlineCompany == null){
				throw new NoAirlineCompanyException();
			}
		 
		return (this.airlineCompany.getAircraftFormAircraftParkById(idAircraft));		 
	 }
	 
	/*
	 * !!! Add new aircraft to aircraft park of the airliner company
	 * 
	 */
	public boolean addAircraft(Aircraft newAircraft) throws NoAirlineCompanyException {
		
		if(this.airlineCompany == null){
			throw new NoAirlineCompanyException();
		}
		
		return (this.airlineCompany.addAircraftToPark(newAircraft));
	}

	/*
	 * !!! Remove existing aircraft from aircraft park of the airliner company
	 * 
	 */
	public boolean removeAircraft(Aircraft removingAircraft) throws NoAirlineCompanyException {
		
		if(this.airlineCompany == null){
			throw new NoAirlineCompanyException();
		}
		
		return (this.airlineCompany.removeAircraftFromPark(removingAircraft));
	}
	
	/**
	 * !!! Calculate a total amount people capacity of all aircrafts at the
	 * Aircraft park of airline company
	 * @throws NoAirlineCompanyException 
	 * 
	 */
	public PeopleCapacity getTotalAircraftsPeopleCapacity() throws AircraftEmptyParkException, NoAirlineCompanyException {
		
		if(this.airlineCompany == null){
			throw new NoAirlineCompanyException();
		}
		
		return (this.airlineCompany.getTotalAircraftsPeopleCapacity());
	}

	/**
	 * !!! Calculate a total amount weight capacity of all aircrafts at the
	 * Aircraft park of airline company
	 * @throws NoAirlineCompanyException 
	 * 
	 */
	public Tons getTotalAircraftsWeigthCapacity() throws AircraftEmptyParkException, NoAirlineCompanyException {
		
		if(this.airlineCompany == null){
			throw new NoAirlineCompanyException();
		}
		
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

	/**
	 * !!! This method return a full airliner company information to string 
	 * @return
	 */
	public String getFullAirlineCompanyInformation() {
		String fullCompanyInformation =( "Airline company name: " + this.airlineCompany.getCompanyName() + "\n" 
										+ "Airline company email: " + this.airlineCompany.getCompanyEmail() + "\n"
										+ "Airline company founding date: " + this.airlineCompany.getFoundDataParsedToString() + "\n"
										+ "A total amount of aircrafts at the airliner company park: " + this.airlineCompany.getTotalAmountOfAircraft() + " aircrafts");
		return fullCompanyInformation;
	}
	
	/**
	 *  !!! This method return an amount of aircrafts at the airliner company park
	 * @return
	 */
	public int getAircraftsTotalAmount(){
		return (this.airlineCompany.getTotalAmountOfAircraft());
	}
	
}
