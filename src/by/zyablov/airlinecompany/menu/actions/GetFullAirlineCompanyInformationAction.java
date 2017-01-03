/**
 * 
 */
package by.zyablov.airlinecompany.menu.actions;

import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * @author Дмитрий
 *
 */
public class GetFullAirlineCompanyInformationAction {
		
	/**
	 * !!! This method show a full information about airline company
	 */
	public static void run(AirlineManageSystem airlineCompanyManager){
		System.out.println(airlineCompanyManager.getFullAirlineCompanyInformation());			
	}

}
