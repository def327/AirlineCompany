/**
 * 
 */
package by.zyablov.airlinecompany.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

/**
 * @author Дмитрий
 *
 */
public class FileAicraftsWriter {

	public static void writeAircraftListToFile(List<Aircraft> aircraftsList) throws FileNotFoundException, IOException {
		ObjectOutputStream out = null;
		try {
			File file = new File("datafiles/datalist.dat");
			out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(aircraftsList);
		}finally {			
			out.close();
		}
	}
}
