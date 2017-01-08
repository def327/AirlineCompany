package by.zyablov.airlinecompany.exeptions;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * Class {@code AircraftEmptyParkException} is a type of {@code Exception}, that
 * indicates that {@code AircraftPark} object doesn't have {@code Aircraft}
 * objects.
 * 
 * @see by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark
 * @see Aircraft
 * 
 */
public class AircraftEmptyParkException extends Exception {

	/**
	 * This value is genereted by JVM to serialize
	 * {@code AircraftEmptyParkException} class
	 */
	private static final long serialVersionUID = 539400269816089254L;

	/**
	 * This value is a storage for {@code AircraftEmptyParkException} message
	 * for user.
	 */
	private String exceptionMessage;

	/**
	 * Constructor.
	 * 
	 * @param exceptionMessage
	 *            - a storage for {@code AircraftEmptyParkException} message for
	 *            user
	 * 
	 */
	public AircraftEmptyParkException() {
		this.exceptionMessage = "Aircraft park object has no aircraft objects";
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * Returns a string representation of {@code AircraftEmptyParkException}
	 * object.
	 * 
	 * @return a string, which is consisted of
	 *         {@link AircraftEmptyParkException#exceptionMessage
	 *         exceptionMessage} field.
	 */
	@Override
	public String toString() {
		return exceptionMessage;
	}

}
