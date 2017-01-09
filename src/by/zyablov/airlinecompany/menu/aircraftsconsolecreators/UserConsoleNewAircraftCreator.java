
package by.zyablov.airlinecompany.menu.aircraftsconsolecreators;

import java.util.Scanner;

import by.zyablov.airlinecompany.interfaces.AircraftBuilderBehavior;
import by.zyablov.airlinecompany.interfaces.NewAircraftConsoleCreatorBehavior;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * Class {@code UserConsoleNewAircraftCreator} is used for user console menu to
 * choosed a way of creating a new Aircraft.
 * 
 * 
 * @author Дмитрий
 *
 */
public class UserConsoleNewAircraftCreator {

	/**
	 * This field is used to choose a way how to create a new aircraft for a
	 * user
	 */
	private NewAircraftConsoleCreatorBehavior newAircraftconsoleCreator;

	/**
	 * This method create via user console new aircraft and add it to airline
	 * company park
	 * 
	 * @param consoleReader
	 * @param airlineCompanyManager
	 */
	public void addNewAircraftByUserConsole(Scanner consoleReader, AirlineManageSystem airlineCompanyManager,
			AircraftBuilderBehavior aircraftBuilder) {

		this.newAircraftconsoleCreator.addAndCreateNewAircraft(consoleReader, airlineCompanyManager, aircraftBuilder);
	}
}
