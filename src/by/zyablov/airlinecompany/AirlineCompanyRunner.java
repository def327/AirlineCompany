/**
 * 
 */
package by.zyablov.airlinecompany;

import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.menu.ApplicationMenu;

public class AirlineCompanyRunner {

	/**
	 * 
	 * @param args
	 * @throws NoAirlineCompanyException 
	 * @throws AircraftEmptyParkException 
	 *   
	 */
	public static void main(String[] args) throws NoAirlineCompanyException, AircraftEmptyParkException {
		
		ApplicationMenu mn = new ApplicationMenu();
		mn.mainMenuRun();
	}
		
}
