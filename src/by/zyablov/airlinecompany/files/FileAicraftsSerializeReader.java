
package by.zyablov.airlinecompany.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * Class {@code FileAicraftsSerializeReader} has method to read {@code Aircraft}
 * object's from data file using serialization.
 * 
 * @author Дмитрий
 *
 */
public class FileAicraftsSerializeReader extends FileAircraftsReader {

	/**
	 * Returns a list of {@code Aircraft} objects from file.
	 * 
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	@SuppressWarnings("unchecked")
	public List<Aircraft> readAircraftListFromFile() throws IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File(pathToFileInString)))) {

			List<Aircraft> aircraftsList = new LinkedList<>();
			aircraftsList = (List<Aircraft>) in.readObject();

			return aircraftsList;
		}

	}

}
