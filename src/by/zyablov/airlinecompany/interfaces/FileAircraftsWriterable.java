package by.zyablov.airlinecompany.interfaces;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * Interface {@code FileAircraftsWriterable} is used to write {@code Aircraft}
 * objects to file.
 * 
 * @author Дмитрий
 */
public interface FileAircraftsWriterable {

	/**
	 * Writes a collection of {@code Aircraft} objects to data file.
	 * 
	 * @throws IOException
	 */
	public void writeAircraftListToFile(List<Aircraft> aircraftsList) throws IOException;
}
