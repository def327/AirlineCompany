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

	public void addAircraft(Aircraft newAircraft) {
		this.airlineCompany.addAircraftToPark(newAircraft);
	}

	public void removeAircraft() {

	}

//	public PeopleCapacity calcTotalAircraftsPeopleCapacity() {
//
//	}
//
//	public Tons calcTotalAircraftsWeigthCapacity() {
//			
//	}
//
//	public Aircraft findAircrafByFuelSpending() {
//
//	}
	
	/**
	 * @return the airlineCompany
	 */
	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}

	/**
	 * @param airlineCompany the airlineCompany to set
	 */
	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}
	

}
