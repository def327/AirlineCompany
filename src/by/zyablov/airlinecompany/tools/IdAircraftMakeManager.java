/**
 * 
 */
package by.zyablov.airlinecompany.tools;

/**
 * @author Дмитрий
 *
 */
public class IdAircraftMakeManager {
	
	static int randomCounter;
	static final int VALUE_RANGE_LIMIT =  1234578;
	
	
	static{
		randomCounter = 0;
	}
	
	/**
	 *  !!! This method generate unique Id for aircraft using hash and static field randomCounter
	 * @return
	 */
	public static int getUniqueIdAircraft(String aircraftName){	
		
		randomCounter++;
		int customHashValue = (HashMakeManager.createHashValue((aircraftName + randomCounter)));
		
		if(customHashValue <= 0 ){
			customHashValue  = customHashValue * (-1);
		}
		
		int uniqueIdAircraft = customHashValue/VALUE_RANGE_LIMIT;
		return ((uniqueIdAircraft + 1)*2);		
	}

}
