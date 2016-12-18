/**
 * 
 */
package by.zyablov.airlinecompany.beans.company;

import java.util.Date;

import by.zyablov.airlinecompany.beans.AircraftPark;

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
		aircraftPark = new AircraftPark();
	}

	@Override
	public String toString() {
		return (super.toString() + "\n" + "amountOfAircraft = " + aircraftPark.getAmountOfAircraft());
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
