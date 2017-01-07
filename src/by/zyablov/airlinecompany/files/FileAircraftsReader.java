package by.zyablov.airlinecompany.files;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.interfaces.FileAircraftsReaderable;

public abstract class FileAircraftsReader implements FileAircraftsReaderable {

	protected final String pathToFileInString = "src/datafiles/datalist.dat";

	/**
	 * !!! This method read a collection of aircrafts from data file
	 */
	public abstract List<Aircraft> readAircraftListFromFile() throws IOException, ClassNotFoundException;

}
