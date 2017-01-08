
package by.zyablov.airlinecompany.beans.company;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Class {@code Company} represents a company, which includes id, companie's
 * name, companie's email and companie's date of found. Also
 * {@code AirlineCompany} class inherits {@code Company} and give's more
 * opportunitie's to manage airline company.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.beans.company.AirlineCompany
 * 
 */
public abstract class Company {

	/**
	 * This value is a unique ID for {@code Company} object.
	 */
	private int companyId;

	/**
	 * This value is a name of {@code Company} object.
	 */
	private String companyName;

	/**
	 * This value is a email of {@code Company} object.
	 */
	private String companyEmail;

	/**
	 * This value is a date of found of {@code Company} object.
	 */
	private GregorianCalendar companyFoundDate;

	/**
	 * Returns an {@code Company} object's found date, which is parsed to
	 * string. Notice, that {@code SimpleDateFormat} object uses <i>"EN"</i>
	 * locale and <i>"yyyy MMMM dd"</i> date format.
	 * 
	 * @return a found date of company in String
	 */
	public String getFoundDataParsedToString() {
		SimpleDateFormat simpleDataformat = new SimpleDateFormat("yyyy MMMM dd", new Locale("en", "EN"));
		String stringFoundData = simpleDataformat.format(this.companyFoundDate.getTime());
		return stringFoundData;
	}

	/**
	 * Constructor.
	 * 
	 * @param id
	 *            - a unique ID for {@code Company} object.
	 * @param name
	 *            - a name of {@code Company} object.
	 * @param email
	 *            - a email of {@code Company} object.
	 * @param foundDate
	 *            - a email of {@code Company} object.
	 */
	public Company(int id, String name, String email, GregorianCalendar foundDate) {
		this.companyId = id;
		this.companyName = name;
		this.companyEmail = email;
		this.companyFoundDate = foundDate;
	}

	/**
	 * Constructor.
	 * 
	 * @param id
	 *            - a unique ID for {@code Company} object.
	 * @param name
	 *            - a name of {@code Company} object.
	 * @param email
	 *            - a email of {@code Company} object.
	 * @param foundDate
	 *            - a email of {@code Company} object.
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
	 * Returns a string representation of {@code Company} object.
	 * 
	 * @return a string, which is consisted of
	 *         <i>companyId</i>,<i>companyName</i>,<i>companyEmail</i> and
	 *         <i>companyFoundDate</i> fields of {@code Company}.
	 */
	@Override
	public String toString() {
		return "id = " + (this.companyId) + "\n" + "name = " + (this.companyName) + "\n" + "email = "
				+ (this.companyEmail) + "\n" + "foundDate = " + (this.companyFoundDate);
	}

	/**
	 * Indicates whether some other {@code Company} object is "equal to " this
	 * one
	 * 
	 * @param obj
	 *            - the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code Aircraft} object is the same
	 *         as obj argument; <b>{@code false}</b> otherwise.
	 * 
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
