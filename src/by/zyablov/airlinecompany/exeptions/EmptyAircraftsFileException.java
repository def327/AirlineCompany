package by.zyablov.airlinecompany.exeptions;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * Class {@code EmptyAircraftsFileException} is a type of {@code Exception},
 * that indicates there are no {@code Aircraft} objects in a data file.
 * 
 * @see by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark
 * @see Aircraft
 * 
 */
public class EmptyAircraftsFileException extends Exception {

	/**
	 * This value is genereted by JVM to serialize
	 * {@code EmptyAircraftsFileException} class
	 */
	private static final long serialVersionUID = -3247614855904998487L;

	/**
	 * This value is a storage for {@code EmptyAircraftsFileException} message
	 * for user.
	 */
	private String exceptionMessage;

	/**
	 * Constructor.
	 * 
	 * @param exceptionMessage
	 *            - a storage for {@code EmptyAircraftsFileException} message
	 *            for user.
	 */
	public EmptyAircraftsFileException() {
		this.exceptionMessage = "There are no aircrafts at the file! File is empty!";
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	/**
	 * Returns a string representation of {@code EmptyAircraftsFileException}
	 * object.
	 * 
	 * @return a string, which is consisted of
	 *         {@link EmptyAircraftsFileException#exceptionMessage
	 *         exceptionMessage} field.
	 */
	@Override
	public String toString() {
		return exceptionMessage;
	}

}
