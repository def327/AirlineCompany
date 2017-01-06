/**
 * 
 */
package by.zyablov.airlinecompany.exeptions;

/**
 * @author Дмитрий
 *
 */
public class NoSuitableAircraftsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2244188719053323887L;

	private String exceptionMessage;

	/**
	 * @param exceptionMessage
	 */
	public NoSuitableAircraftsException() {
		this.exceptionMessage = "There is no suitable aircrafts at the airliner company park!";
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
		return super.toString();
	}

}
