package by.zyablov.airlinecompany.interfaces;

import java.util.GregorianCalendar;

import by.zyablov.airlinecompany.beans.company.Company;

/**
 * Interface {@code CompanyBuilderBehavior} is used to create and initialize
 * fields of {@code Company} object.
 * 
 * @author Дмитрий
 *
 */
public interface CompanyBuilderBehavior extends BuilderBehavior {

	void setCompanyId(int companyId);

	void setCompanyName(String companyName);

	void setCompanyEmail(String companyEmail);

	void setCompanyFoundDate(GregorianCalendar companyFoundDate);

	/**
	 * Returns a created {@code Company} object.
	 * 
	 * @return a created {@code Company} object with initialized fields.
	 */
	Company getResult();

}
