/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import java.util.GregorianCalendar;

import by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark;
import by.zyablov.airlinecompany.beans.company.AirlineCompany;
import by.zyablov.airlinecompany.interfaces.CompanyBuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class BuilderAirlineCompany implements CompanyBuilderBehavior {

	private AirlineCompany airlineCompany;

	/**
	 * !!! This method fill all fields of a new airline company, just need only
	 * a name of a new company
	 * 
	 * @param companyName
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

	@Override
	public void setCompanyId(int companyId) {
		airlineCompany.setCompanyId(companyId);
	}

	@Override
	public void setCompanyName(String companyName) {
		airlineCompany.setCompanyName(companyName);
	}

	@Override
	public void setCompanyEmail(String companyEmail) {
		airlineCompany.setCompanyEmail(companyEmail);
	}

	@Override
	public void setCompanyFoundDate(GregorianCalendar companyFoundDate) {
		airlineCompany.setCompanyFoundDate(companyFoundDate);
	}

	public void setAircraftPark(AircraftPark aircraftPark) {
		airlineCompany.setAircraftPark(aircraftPark);
	}

	public AirlineCompany getResult() {
		return airlineCompany;
	}

	/**
	 * !!! This a constuctor without parameters
	 * 
	 * @param airlineCompany
	 */
	public BuilderAirlineCompany() {
		airlineCompany = new AirlineCompany();
	}

}
