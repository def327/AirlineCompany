/**
 * 
 */
package by.zyablov.airlinecompany.beans.company;


import java.util.GregorianCalendar;

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

	public Company() {
		this.companyId = 0;
		this.companyName = null;
		this.companyEmail = null;
		this.companyFoundDate = null;
	}

	@Override
	public String toString() {
		return "id = " + this.companyId + "\n" + "name = " + this.companyName + "\n" + "email = " + this.companyEmail + "\n" + "foundDate = "
				+ this.companyFoundDate;
	}

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

		return ((this.companyId == other.companyId) && (this.companyName.equals(other.companyName)) && (this.companyEmail.equals(companyEmail))
				&& (this.companyFoundDate.equals(other.companyFoundDate)));
	}

	/**
	 * @return the companyId
	 */
	public int getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	/**
	 * @return the companyEmail
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}

	/**
	 * @param companyEmail the companyEmail to set
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	/**
	 * @return the companyFoundDate
	 */
	public GregorianCalendar getCompanyFoundDate() {
		return companyFoundDate;
	}

	/**
	 * @param companyFoundDate the companyFoundDate to set
	 */
	public void setCompanyFoundDate(GregorianCalendar companyFoundDate) {
		this.companyFoundDate = companyFoundDate;
	}

	

}
