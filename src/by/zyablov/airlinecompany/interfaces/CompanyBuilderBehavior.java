package by.zyablov.airlinecompany.interfaces;

import java.util.GregorianCalendar;

import by.zyablov.airlinecompany.beans.company.Company;

public interface CompanyBuilderBehavior extends BuilderBehavior {

	void setCompanyId(int companyId);

	void setCompanyName(String companyName);

	void setCompanyEmail(String companyEmail);

	void setCompanyFoundDate(GregorianCalendar companyFoundDate);

	Company getResult();

}
