package by.zyablov.airlinecompany.files;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.interfaces.FileAircraftsWriterable;

/**
 * Class {@code FileAircraftsWriter} writes {@code Aircraft} objects to file in
 * OS.
 * 
 * @author Дмитрий
 */
public abstract class FileAircraftsWriter implements FileAircraftsWriterable {

	/**
	 * A path to file with {@code Aircraft} objects in OS.
	 */
	protected final String pathToFileInString = "src/datafiles/datalist.dat";

	/**
	 * This method writes a collection of {@code Aircraft} objects to data file
	 */
	public abstract void writeAircraftListToFile(List<Aircraft> aircraftsList) throws IOException;

}
