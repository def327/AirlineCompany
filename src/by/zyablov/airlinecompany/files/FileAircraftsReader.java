package by.zyablov.airlinecompany.files;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.interfaces.FileAircraftsReaderable;

/**
 * Class {@code FileAircraftsReader} reads {@code Aircraft} objects from file in
 * OS.
 * 
 * @author Дмитрий
 */
public abstract class FileAircraftsReader implements FileAircraftsReaderable {

	/**
	 * A path to file with {@code Aircraft} objects in OS.
	 */
	protected final String pathToFileInString = "src/datafiles/datalist.dat";

	/**
	 * This method reads a collection of {@code Aircraft} objects from data file
	 */
	public abstract List<Aircraft> readAircraftListFromFile() throws IOException, ClassNotFoundException;

}
