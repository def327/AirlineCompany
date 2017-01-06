package by.zyablov.airlinecompany.interfaces;

import java.io.IOException;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

public interface FileAircraftsWriterable {
	
	/**
	 * This method write a collection of aircrafts to data file
	 * @param aircraftsList
	 * @throws IOException
	 */
	public void writeAircraftListToFile(List<Aircraft> aircraftsList)throws IOException ;
}
