/**
 * 
 */
package by.zyablov.airlinecompany.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * @author Дмитрий
 *
 */

public class FileAicraftsReader {

	@SuppressWarnings("unchecked")
	public static void readAircraftListFromFile(List<Aircraft> aircraftsList)
			throws ClassNotFoundException, IOException {

		ObjectInputStream in = null;
		try {
			File file = new File("datafiles/datalist.dat");
			in = new ObjectInputStream(new FileInputStream(file));
			aircraftsList = (List<Aircraft>)in.readObject();
		} finally {
			in.close();
		}
	}

}
