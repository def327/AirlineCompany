
package by.zyablov.airlinecompany.tools;

/**
 * Class {@code IdAircraftMakeManager} generates a unique int value for
 * {@code Aircraft} object's id field.
 * 
 * @author Дмитрий
 *
 */
public class IdAircraftMakeManager {

	static int randomCounter = 0;
	static final int VALUE_RANGE_LIMIT = 1234578;

	/**
	 * This method generate unique Id for aircraft using hash and static field
	 * randomCounter
	 * 
	 * @return a unique int value
	 */
	public static int getUniqueIdAircraft(String aircraftName) {

		randomCounter++;
		int customHashValue = (HashMakeManager.createHashValue((aircraftName + randomCounter)));

		if (customHashValue <= 0) {
			customHashValue = customHashValue * (-1);
		}

		int uniqueIdAircraft = customHashValue / VALUE_RANGE_LIMIT;
		return ((uniqueIdAircraft + 1) * 2);
	}

}
