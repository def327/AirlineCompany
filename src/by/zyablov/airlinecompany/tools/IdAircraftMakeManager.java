/**
 * 
 */
package by.zyablov.airlinecompany.tools;

/**
 * @author Дмитрий
 *
 */
public class IdAircraftMakeManager {
	
	public static int getUniqueIdAircraft(int counterValue){
		return ((counterValue + 1)*2);		
	}

}
