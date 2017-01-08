package by.zyablov.airlinecompany.exeptions;

/**
 * Class {@code NoAirlineCompanyException} is a type of {@code Exception}, that
 * indicates that {@code AirlineCompany} object's haven't been created.
 * 
 * @see by.zyablov.airlinecompany.beans.company.AirlineCompany
 * 
 */
public class NoAirlineCompanyException extends Exception {

	/**
	 * This value is genereted by JVM to serialize
	 * {@code NoAirlineCompanyException} class
	 */
	private static final long serialVersionUID = 8799139799066220400L;

	/**
	 * This value is a storage for {@code NoAirlineCompanyException} message for
	 * user.
	 */
	private String exceptionMessage;

	/**
	 * Constructor.
	 * 
	 * @param exceptionMessage
	 *            - a storage for {@code NoAirlineCompanyException} message for
	 *            user.
	 */
	public NoAirlineCompanyException() {
		this.exceptionMessage = "Please at first create airline company!";
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * Returns a string representation of {@code NoAirlineCompanyException}
	 * object.
	 * 
	 * @return a string, which is consisted of
	 *         {@link NoAirlineCompanyException#exceptionMessage
	 *         exceptionMessage} field.
	 */
	@Override
	public String toString() {
		return exceptionMessage;
	}

}
