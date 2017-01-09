package by.zyablov.airlinecompany.interfaces;

/**
 * Interface {@code Measureable} represents methods of a physical values.
 * 
 * @author Дмитрий
 *
 */
public interface Measureable {

	/**
	 * Returns a measure value of a physical value in String type.
	 * 
	 * @return value in String type
	 */
	String getMeasureValueInString();

	/**
	 * Sets measure value in int type.
	 * 
	 * @param measureValue
	 *            - the value of the measurement
	 */
	void setMeasureIntValue(int measureValue);

	/**
	 * Returns a measure value of a physical value in int type.
	 * 
	 * @return value in int type
	 */
	int getMeasureValueInInt();

}
