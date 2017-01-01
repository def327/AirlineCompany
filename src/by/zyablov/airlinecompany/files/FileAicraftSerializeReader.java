/**
 * 
 */
package by.zyablov.airlinecompany.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;


/**
 * @author Дмитрий
 *
 */

public class FileAicraftSerializeReader {

	@SuppressWarnings("unchecked")
	public static List<Aircraft> readAircraftListFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("datafiles/datalist.dat")))) {
			
			List<Aircraft> aircraftsList = new LinkedList<>();
			aircraftsList = (List<Aircraft>) in.readObject();
			
			return aircraftsList;
		}
		
	}

}
