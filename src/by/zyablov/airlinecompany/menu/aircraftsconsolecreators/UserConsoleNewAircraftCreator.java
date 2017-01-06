/**
 * 
 */
package by.zyablov.airlinecompany.menu.aircraftsconsolecreators;

import java.util.Scanner;

import by.zyablov.airlinecompany.beans.builders.BuilderAircraft;
import by.zyablov.airlinecompany.interfaces.NewAircraftConsoleCreatorBehavior;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * @author Дмитрий
 *
 */
public class UserConsoleNewAircraftCreator {
	private NewAircraftConsoleCreatorBehavior newAircraftconsoleCreator;

	/**
	 * !!! This method create via user console new aircraft and add it to airline company park
	 * 
	 * @param consoleReader
	 * @param airlineCompanyManager
	 */
	public void addNewAircraftByUserConsole(Scanner consoleReader, AirlineManageSystem airlineCompanyManager,
			BuilderAircraft aircraftBuilder) {

		this.newAircraftconsoleCreator.addAndCreateNewAircraft(consoleReader, airlineCompanyManager, aircraftBuilder);
	}
}
