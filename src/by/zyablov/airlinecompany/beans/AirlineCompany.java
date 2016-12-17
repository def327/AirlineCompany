/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.Date;

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
		aircraftPark = null;
	}

	@Override
	public String toString() {
		return super.toString() + "\n" + "amountOfAircraft = " + aircraftPark.getAmountOfAircraft();
	}

}
