/**
 * 
 */
package by.zyablov.airlinecompany.menu.aircraftsconsolecreators;

import by.zyablov.airlinecompany.interfaces.NewAircraftConsoleCreatorBehavior;

/**
 * @author Дмитрий
 *
 */
public class UserConsoleNewAircraftCreator {
	
	private NewAircraftConsoleCreatorBehavior newAircraftconsoleCreator;
	
	public void createNewAircraftByUserConsole() {
		
		this.newAircraftconsoleCreator.createNewAircraft();
	}

}
