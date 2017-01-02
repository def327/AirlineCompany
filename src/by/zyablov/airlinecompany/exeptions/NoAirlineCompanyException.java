package by.zyablov.airlinecompany.exeptions;

public class NoAirlineCompanyException  extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8799139799066220400L;
	
	private String exceptionMessage;

	/**
	 * @param exceptionMessage
	 */
	public NoAirlineCompanyException() {
		this.exceptionMessage = "Please at first create airline company!";
	}

	/**
	 * @return the exceptionMessage
	 */
	public String getExceptionMessage() {
		return exceptionMessage;
	}

	/**
	 * @param exceptionMessage the exceptionMessage to set
	 */
	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}
	
	@Override
	public String toString() {
		return exceptionMessage;
	}

	

}
