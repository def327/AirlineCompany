
package by.zyablov.airlinecompany.exeptions;

/**
 * Class {@code NoSuitableAircraftsException} is a type of {@code Exception},
 * that indicates that a suitable {@code Aircraft} object's weren't found.
 * 
 * @see by.zyablov.airlinecompany.beans.company.AirlineCompany
 * 
 */
public class NoSuitableAircraftsException extends Exception {

	/**
	 * This value is genereted by JVM to serialize
	 * {@code NoSuitableAircraftsException} class
	 */
	private static final long serialVersionUID = 2244188719053323887L;

	/**
	 * This value is a storage for {@code NoSuitableAircraftsException} message
	 * for user.
	 */
	private String exceptionMessage;

	/**
	 * Constructor.
	 * 
	 * @param exceptionMessage
	 *            - a storage for {@code NoSuitableAircraftsException} message
	 *            for user.
	 */
	public NoSuitableAircraftsException() {
		this.exceptionMessage = "There is no suitable aircrafts at the airliner company park!";
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * Returns a string representation of {@code NoSuitableAircraftsException}
	 * object.
	 * 
	 * @return a string, which is consisted of
	 *         {@link NoSuitableAircraftsException#exceptionMessage
	 *         exceptionMessage} field.
	 */
	@Override
	public String toString() {
		return super.toString();
	}

}
