package by.zyablov.airlinecompany.exeptions;

public class AircraftEmptyParkException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 539400269816089254L;

	private String exceptionMessage;

	/**
	 * @param exceptionMessage
	 */
	public AircraftEmptyParkException() {
		this.exceptionMessage = "Aircraft park object has no aircraft objects";
	}

	/**
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * @param exceptionMessage
	 *            the exceptionMessage to set
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	@Override
	public String toString() {
		return exceptionMessage;
	}

}
