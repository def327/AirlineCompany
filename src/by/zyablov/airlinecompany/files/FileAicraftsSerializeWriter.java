
package by.zyablov.airlinecompany.files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * Class {@code FileAicraftsSerializeReader} has method to write
 * {@code Aircraft} object's to data file using serialization.
 * 
 * @author Дмитрий
 *
 */
public class FileAicraftsSerializeWriter extends FileAircraftsWriter {

	/**
	 * Wrie to data file a list of {@code Aircraft} objects.
	 * 
	 * @throws IOException
	 */
	public void writeAircraftListToFile(List<Aircraft> aircraftsList) throws IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File(pathToFileInString)))) {

			out.writeObject(aircraftsList);
		}
	}
}
