package by.zyablov.airlinecompany.interfaces;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

public interface FileAircraftsReaderable {
	
	/**
	 * This method read a collection of aircrafts from data file
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public List<Aircraft> readAircraftListFromFile() throws IOException, ClassNotFoundException ;

}
