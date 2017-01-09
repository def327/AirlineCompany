
package by.zyablov.airlinecompany.interfaces;

import java.util.Scanner;

import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * Interface {@code NewAircraftConsoleCreatorBehavior} uses to create a new
 * {@code Aircraft} objects by user console.
 * 
 * @author Дмитрий
 *
 */
public interface NewAircraftConsoleCreatorBehavior {

	/**
	 * This method create new aircraft and add it to airline company park
	 * 
	 * @param consoleReader
	 * @param airlineCompanyManager
	 * @param aircraftBuilder
	 */
	void addAndCreateNewAircraft(Scanner consoleReader, AirlineManageSystem airlineCompanyManager,
			AircraftBuilderBehavior aircraftBuilder);
}
