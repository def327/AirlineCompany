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
	 * @param airlineCompany
	 */
	public BuilderAirlineCompany() {
		airlineCompany = new AirlineCompany();
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
	
	public void setAircraftPark(AircraftPark aircraftPark){
		airlineCompany.setAircraftPark(aircraftPark);
	}
	
	public AirlineCompany getResult(){
		return airlineCompany;
	}


	
}
