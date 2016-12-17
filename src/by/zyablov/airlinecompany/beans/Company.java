/**
 * 
 */
package by.zyablov.airlinecompany.beans;


import java.util.Date;

/**
 * @author Дмитрий
 *
 */
public abstract class Company {

	private int id;
	private String name;
	private String email;
	private Date foundDate; // fix change to type Date

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param foundDate
	 */
	public Company(int id, String name, String email, Date foundDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.foundDate = foundDate;
	}

	public Company() {
		this.id = 0;
		this.name = null;
		this.email = null;
		this.foundDate = null;
	}

	@Override
	public String toString() {
		return "id = " + this.id + "\n" + "name = " + this.name + "\n" + "email = " + this.email + "\n" + "foundDate = "
				+ this.foundDate;
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

		return ((this.id == other.id) && (this.name.equals(other.name)) && (this.email.equals(email))
				&& (this.foundDate.equals(other.foundDate)));
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the foundDate
	 */
	public Date getFoundDate() {
		return foundDate;
	}

	/**
	 * @param foundDate
	 *            the foundDate to set
	 */
	public void setFoundDate(Date foundDate) {
		this.foundDate = foundDate;
	}

}
