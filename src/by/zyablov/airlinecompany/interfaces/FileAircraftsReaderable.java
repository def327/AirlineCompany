package by.zyablov.airlinecompany.interfaces;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * Interface {@code FileAircraftsReaderable} is used to read {@code Aircraft}
 * objects from file.
 * 
 * @author Дмитрий
 */
public interface FileAircraftsReaderable {

	/**
	 * Returns a collection of {@code Aircraft} objects from data file.
	 * 
	 * @return a list of {@code Aircraft} objects
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public List<Aircraft> readAircraftListFromFile() throws IOException, ClassNotFoundException;

}
