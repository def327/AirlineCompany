/**
 * 
 */
package by.zyablov.airlinecompany.beans.company;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author Дмитрий
 *
 */
public abstract class Company {

	private int companyId;
	private String companyName;
	private String companyEmail;
	private GregorianCalendar companyFoundDate;

	/**
	 * !!! This method return a company found date parsed to string
	 * 
	 * @return
	 */
	public String getFoundDataParsedToString() {
		SimpleDateFormat simpleDataformat = new SimpleDateFormat("yyyy MMMM dd", new Locale("en", "EN"));
		String stringFoundData = simpleDataformat.format(this.companyFoundDate.getTime());
		return stringFoundData;
	}

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param id
	 * @param name
	 * @param email
	 * @param foundDate
	 */
	public Company(int id, String name, String email, GregorianCalendar foundDate) {
		this.companyId = id;
		this.companyName = name;
		this.companyEmail = email;
		this.companyFoundDate = foundDate;
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public Company() {
		this.companyId = 0;
		this.companyName = null;
		this.companyEmail = null;
		this.companyFoundDate = null;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public GregorianCalendar getCompanyFoundDate() {
		return companyFoundDate;
	}

	public void setCompanyFoundDate(GregorianCalendar companyFoundDate) {
		this.companyFoundDate = companyFoundDate;
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "id = " + this.companyId + "\n" + "name = " + this.companyName + "\n" + "email = " + this.companyEmail
				+ "\n" + "foundDate = " + this.companyFoundDate;
	}

	/**
	 * !!! This method equals two companies
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Company)) {
			return false;
		}

		Company other = (Company) obj;
		return ((this.companyId == other.companyId) && (this.companyName.equals(other.companyName))
				&& (this.companyEmail.equals(companyEmail)) && (this.companyFoundDate.equals(other.companyFoundDate)));
	}

}
