package by.zyablov.airlinecompany.exeptions;

public class EmptyAircraftsFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3247614855904998487L;

	private String exceptionMessage;

	/**
	 * @param exceptionMessage
	 */
	public EmptyAircraftsFileException() {
		this.exceptionMessage = "There are no aircrafts at the file! File is empty!";
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
