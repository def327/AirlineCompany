/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;

import java.util.Date;

import by.zyablov.airlinecompany.beans.company.AirlineCompany;
import by.zyablov.airlinecompany.interfaces.CompanyBuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class AirlineCompanyBuilder implements CompanyBuilderBehavior {
	
	private AirlineCompany airlineCompany;
	
	
	/**
	 * @param airlineCompany
	 */
	public AirlineCompanyBuilder() {
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
	public void setCompanyFoundDate(Date companyFoundDate) {
		airlineCompany.setCompanyFoundDate(companyFoundDate);		
	}
	
	public AirlineCompany getResult(){
		return airlineCompany;
	}
	
}
