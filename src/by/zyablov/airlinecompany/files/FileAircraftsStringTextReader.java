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
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerAircraftTechData;
import by.zyablov.airlinecompany.beans.builders.BuilderBasicTechAiracft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraftTechData;

/**
 * @author Дмитрий
 *
 */
public class FileAircraftsStringTextReader extends FileAircraftsReader {

	/**
	 * !!! This method get the list of aircrafts, which was parsed from text
	 * file
	 * 
	 * @return
	 * @throws IOException
	 */
	public List<Aircraft> readAircraftListFromFile() throws IOException {

		try (BufferedReader in = new BufferedReader(new FileReader(new File(pathToFileInString)))) {
			List<Aircraft> listOfAircraft = new LinkedList<>();
			String aircraftString = null;

			while ((aircraftString = in.readLine()) != null) {
				String[] fieldsOfAircraft = aircraftString.split("\\|");

				if (fieldsOfAircraft[0].equalsIgnoreCase("AirlinerAircraft")) {
					listOfAircraft.add(FileAircraftsStringTextReader.createAirlinerAicraft(fieldsOfAircraft));

				} else if (fieldsOfAircraft[0].equalsIgnoreCase("CargoAircraft")) {
					listOfAircraft.add(FileAircraftsStringTextReader.createCargoAicraft(fieldsOfAircraft));
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
		BuilderAircraft buildAircraft = new BuilderAirlinerAircraft();
		buildAircraft.setId(Integer.parseInt(fieldsOfAircraft[1]));
		buildAircraft.setName(fieldsOfAircraft[2]);

		// Create BasicTeachAircraftData for a new airliner aircraft object
		BuilderBasicTechAiracft techDataBuild = createBasicAircraftTechData(fieldsOfAircraft);
		buildAircraft.setBasicTechSpecificationAircraft(techDataBuild.getResult());

		// Create AirlinerTechData for a new airliner aircraft object
		BuilderAirlinerAircraftTechData buildAirlinerTechData = createAirlinerAircraftTechData(fieldsOfAircraft);
		buildAircraft.setUniqueAircraftTechData(buildAirlinerTechData.getResult());

		return buildAircraft.getResult();
	}

	/**
	 * !!! This method create AirlinerTechData for a new airliner aircraft
	 * object
	 * 
	 * @param fieldsOfAircraft
	 * @return
	 */
	private static BuilderAirlinerAircraftTechData createAirlinerAircraftTechData(String[] fieldsOfAircraft) {

		BuilderAirlinerAircraftTechData buildAirlinerTechData = new BuilderAirlinerAircraftTechData();
		buildAirlinerTechData.setAirlinerType(fieldsOfAircraft[7]);
		buildAirlinerTechData.setHavBusinesClass(Boolean.parseBoolean(fieldsOfAircraft[8]));

		return buildAirlinerTechData;
	}

	/**
	 * !!! This method create BasicTeachAircraftData for a new airliner aircraft
	 * object
	 * 
	 * @param fieldsOfAircraft
	 * @return
	 * @throws NumberFormatException
	 */
	private static BuilderBasicTechAiracft createBasicAircraftTechData(String[] fieldsOfAircraft)
			throws NumberFormatException {

		BuilderBasicTechAiracft techDataBuild = new BuilderBasicTechAiracft();
		techDataBuild.setMaxWeigthCapacity(Integer.parseInt(fieldsOfAircraft[3]));
		techDataBuild.setFuelSpending(Integer.parseInt(fieldsOfAircraft[4]));
		techDataBuild.setMiddleVelocity(Integer.parseInt(fieldsOfAircraft[5]));
		techDataBuild.setPeopleCapacity(Integer.parseInt(fieldsOfAircraft[6]));

		return techDataBuild;
	}

	/**
	 * !!! This method create a cargo aircraft object with the fields, which
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

		// Create BasicTeachAircraftData for a new cargo aircraft object
		BuilderBasicTechAiracft techDataBuild = createBasicAircraftTechData(fieldsOfAircraft);
		buildAircraft.setBasicTechSpecificationAircraft(techDataBuild.getResult());

		// Create CargoTechData for a new cargo aircraft
		BuilderCargoAircraftTechData buildCargoTechData = createCargoAircraftTechData(fieldsOfAircraft);
		buildAircraft.setUniqueAircraftTechData(buildCargoTechData.getResult());

		return buildAircraft.getResult();
	}

	/**
	 * !!! This method create CargoTechData for a new airliner aircraft
	 * 
	 * @param fieldsOfAircraft
	 * @return
	 * @throws NumberFormatException
	 */
	private static BuilderCargoAircraftTechData createCargoAircraftTechData(String[] fieldsOfAircraft)
			throws NumberFormatException {

		BuilderCargoAircraftTechData buildCargoTechData = new BuilderCargoAircraftTechData();
		buildCargoTechData.setCargoDepartmentSize(Integer.parseInt(fieldsOfAircraft[7]));
		buildCargoTechData.setCanTransprtDangerGoods(Boolean.parseBoolean(fieldsOfAircraft[7]));

		return buildCargoTechData;
	}
}
