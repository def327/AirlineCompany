/**
 * 
 */
package by.zyablov.airlinecompany.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAirliner;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerTechData;
import by.zyablov.airlinecompany.beans.builders.BuilderBasicTechAiracft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraftTechData;

/**
 * @author Дмитрий
 *
 */
public class FileAircraftTextReader {

	/**
	 * !!! This method get the list of aircrafts, which was parsed from text
	 * file
	 * 
	 * @return
	 * @throws IOException
	 */
	public static List<Aircraft> readAircraftListFromFile() throws IOException {

		try (BufferedReader in = new BufferedReader(new FileReader(new File("datafiles/txtdatalist.txt")))) {
			List<Aircraft> listOfAircraft = new LinkedList<>();
			String aircraftString = null;

			while ((aircraftString = in.readLine()) != null) {
				String[] fieldsOfAircraft = aircraftString.split("\\|");
						
				if (fieldsOfAircraft[0].equalsIgnoreCase("AirlinerAircraft")) {
					listOfAircraft.add(FileAircraftTextReader.createAirlinerAicraft(fieldsOfAircraft));

				} else if (fieldsOfAircraft[0].equalsIgnoreCase("CargoAircraft")) {
					listOfAircraft.add(FileAircraftTextReader.createCargoAicraft(fieldsOfAircraft));
				}
			}

			return listOfAircraft;
		}
	}

	/**
	 * !!! This method create airliner aircraft object with the fields, which
	 * were parsed from text file
	 * 
	 * @param fieldsOfAircraft
	 * @return AirlinerAircraft object
	 */
	private static Aircraft createAirlinerAicraft(String[] fieldsOfAircraft) {

		// Create a new airliner aircraft object
		BuilderAircraft buildAircraft = new BuilderAirliner();
		buildAircraft.setId(Integer.parseInt(fieldsOfAircraft[1]));
		buildAircraft.setName(fieldsOfAircraft[2]);

		// Create basicTeachAircraftData for a new airliner aircraft object
		BuilderBasicTechAiracft techDataBuild = new BuilderBasicTechAiracft();
		techDataBuild.setMaxWeigthCapacity(Integer.parseInt(fieldsOfAircraft[3]));
		techDataBuild.setFuelSpending(Integer.parseInt(fieldsOfAircraft[4]));
		techDataBuild.setMidVelocity(Integer.parseInt(fieldsOfAircraft[5]));
		techDataBuild.setPeopleCapacity(Integer.parseInt(fieldsOfAircraft[6]));

		buildAircraft.setTechSpecificationAircraft(techDataBuild.getResult());

		// --b)Create AirlinerTechData
		BuilderAirlinerTechData buildAirlinerTechData = new BuilderAirlinerTechData();
		buildAirlinerTechData.setAirlinerType(fieldsOfAircraft[7]);
		buildAirlinerTechData.setHavBusinesClass(Boolean.parseBoolean(fieldsOfAircraft[8]));

		buildAircraft.setUniqueAircraftTechData(buildAirlinerTechData.getResult());

		return buildAircraft.getResult();
	}

	/**
	 * !!! This method create cargo aircraft object with the fields, which
	 * were parsed from text file
	 * 
	 * @param fieldsOfAircraft
	 * @return CargorAircraft object
	 */
	private static Aircraft createCargoAicraft(String[] fieldsOfAircraft) {

		// Create a new cargo aircraft object
		BuilderAircraft buildAircraft = new BuilderCargoAircraft();
		buildAircraft.setId(Integer.parseInt(fieldsOfAircraft[1]));
		buildAircraft.setName(fieldsOfAircraft[2]);

		// Create basicTeachAircraftData for a new cargo aircraft object
		BuilderBasicTechAiracft techDataBuild = new BuilderBasicTechAiracft();
		
		techDataBuild.setMaxWeigthCapacity(Integer.parseInt(fieldsOfAircraft[3]));
		techDataBuild.setFuelSpending(Integer.parseInt(fieldsOfAircraft[4]));
		techDataBuild.setMidVelocity(Integer.parseInt(fieldsOfAircraft[5]));
		techDataBuild.setPeopleCapacity(Integer.parseInt(fieldsOfAircraft[6]));

		buildAircraft.setTechSpecificationAircraft(techDataBuild.getResult());
		
		 // Create CargoTechData
		 BuilderCargoAircraftTechData buildCargoTechData = new BuilderCargoAircraftTechData();		 
		 buildCargoTechData.setCargoDepartmentSize(Integer.parseInt(fieldsOfAircraft[7]));
		 buildCargoTechData.setCanTransprtDangerGoods(Boolean.parseBoolean(fieldsOfAircraft[7]));
		
		 buildAircraft.setUniqueAircraftTechData(buildCargoTechData.getResult());
		
		return buildAircraft.getResult();
	}

}
