package by.zyablov.airlinecompany.files;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.interfaces.FileAircraftsWriterable;

public abstract class FileAircraftsWriter implements FileAircraftsWriterable {

	protected final String pathToFileInString = "src/datafiles/datalist.dat";

	/**
	 * !!! This method write a collection of aircrafts to data file
	 */
	public abstract void writeAircraftListToFile(List<Aircraft> aircraftsList) throws IOException;

}
