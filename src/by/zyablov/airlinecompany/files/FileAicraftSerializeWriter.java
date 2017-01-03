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
public class FileAicraftSerializeWriter{

	public static void writeAircraftListToFile(List<Aircraft> aircraftsList) throws FileNotFoundException, IOException  {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream(new File("src/datafiles/datalist.dat")))) {
			
			out.writeObject(aircraftsList);
		}
	}
}
