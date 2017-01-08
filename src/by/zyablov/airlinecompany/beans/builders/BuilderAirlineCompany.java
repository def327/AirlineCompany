
package by.zyablov.airlinecompany.beans.builders;

import java.util.GregorianCalendar;

import by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark;
import by.zyablov.airlinecompany.beans.company.AirlineCompany;
import by.zyablov.airlinecompany.interfaces.CompanyBuilderBehavior;

/**
 * Class {@code BuilderAirlineCompany} creates {@code AirlineCompany} object and
 * initializes it's fields.
 * 
 * @see by.zyablov.airlinecompany.beans.company.BuilderAirlineCompany
 *
 */
public class BuilderAirlineCompany implements CompanyBuilderBehavior {

	/**
	 * A value of {@code AirlineCompany} object to create and initialize
	 */
	private AirlineCompany airlineCompany;

	/**
	 * This method fill all fields of a new airline company, just need only a
	 * name of a new company
	 * 
	 * @param companyName
	 *            - a name of a new {@code AirlineCompany} object
	 */
	public void buildAirlineCompanyUsingOnlyAirlineCompanyName(String companyName) {
		airlineCompany.setCompanyName(companyName);

		// Make all symbols at the compnay name to lower case and delete spaces
		// beetwen words
		airlineCompany.setCompanyEmail(companyName.toLowerCase().replace(" ", "") + "@workmail.com");

		/*
		 * Create a сompany founding date, get a date from operating system just
		 * at at the time of creation new GregorianCalendar object
		 */
		GregorianCalendar companyFoundDate = new GregorianCalendar();
		airlineCompany.setCompanyFoundDate(companyFoundDate);

		// Generate a unic company id for a new airline company
		airlineCompany.setCompanyId((int) (Math.random() * 300));
	}

	/**
	 * Set's an unique ID for {@code AirlineCompany} object
	 * 
	 * @param companyId
	 *            - a value is a unique ID
	 * 
	 */
	@Override
	public void setCompanyId(int companyId) {
		airlineCompany.setCompanyId(companyId);
	}

	/**
	 * Set's a name for {@code AirlineCompany} object.
	 * 
	 * @param companyName
	 *            - this value is a name of {@code AirlineCompany} object.
	 */
	@Override
	public void setCompanyName(String companyName) {
		airlineCompany.setCompanyName(companyName);
	}

	/**
	 * Set's a companyEmail for {@code AirlineCompany} object.
	 * 
	 * @param companyEmail
	 *            - this value is an email of {@code AirlineCompany} object.
	 */
	@Override
	public void setCompanyEmail(String companyEmail) {
		airlineCompany.setCompanyEmail(companyEmail);
	}

	/**
	 * Set's a companyFoundDate for {@code AirlineCompany} object.
	 * 
	 * @param companyFoundDate
	 *            - this value is a date of companie's founding of
	 *            {@code AirlineCompany} object.
	 */
	@Override
	public void setCompanyFoundDate(GregorianCalendar companyFoundDate) {
		airlineCompany.setCompanyFoundDate(companyFoundDate);
	}

	/**
	 * Set's an aircraftPark for {@code AirlineCompany} object
	 * 
	 * @param aircraftPark
	 *            - represents a container, which includes {@code Aircraft}
	 *            object's.
	 * 
	 */
	public void setAircraftPark(AircraftPark aircraftPark) {
		airlineCompany.setAircraftPark(aircraftPark);
	}

	/**
	 * Return's a initialized {@code AirlineCompany} object
	 */
	public AirlineCompany getResult() {
		return airlineCompany;
	}

	/**
	 * Constructor.
	 * 
	 * @param airlineCompany
	 *            - {@code AirlineCompany} object to create and initialize
	 */
	public BuilderAirlineCompany() {
		airlineCompany = new AirlineCompany();
	}

}
