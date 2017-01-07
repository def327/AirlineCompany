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
	 * This is a string constant to split aircraft's fields for parsing from
	 * text file
	 */
	private final static String WORD_SPLITTER = "\\|";

	/**
	 * This is a string constant, referse to create an airliner aircraft object
	 */
	private final static String AIRLINER_AIRCRAFT = "AirlinerAircraft";

	/**
	 * This is a string constant, referse to create a cargo aircraft object
	 */
	private final static String CARGO_AIRCRAFT = "CargoAircraft";

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft type from text file
	 */
	private final static int AIRCRAFT_TYPE_ARRAY_INDEX = 0;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft id field from text file
	 */
	private final static int AIRCRAFT_ID_ARRAY_INDEX = 1;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft name field from text file
	 */
	private final static int AIRCRAFT_NAME_ARRAY_INDEX = 2;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft max weight capacity field from text file
	 */
	private final static int AIRCRAFT_MAX_WEIGHT_CAPACITY_ARRAY_INDEX = 3;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft fuel spending field from text file
	 */
	private final static int AIRCRAFT_FUEL_SPENDING_ARRAY_INDEX = 4;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft middle velocity field from text file
	 */
	private final static int AIRCRAFT_MIDDLE_VELOCITY_ARRAY_INDEX = 5;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an aircraft people capacity field from text file
	 */
	private final static int AIRCRAFT_PEOPLE_CAPACITY_ARRAY_INDEX = 6;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse an airliner type field from text file
	 */
	private final static int AIRCRAFT_AIRLINER_TYPE_ARRAY_INDEX = 7;

	/**
	 * This is a constant array index value for an airliner aircraft object to
	 * parse can airliner airliner have bussienss class field from text file
	 */
	private final static int AIRCRAFT_HAVE_BUSSINES_CLASS_ARRAY_INDEX = 8;

	/**
	 * This is a constant array index value for a cargo aircraft object to parse
	 * a cargo department size field from text file
	 */
	private final static int AIRCRAFT_CARGO_DEPARTMENT_SIZE_ARRAY_INDEX = 7;

	/**
	 * This is a constant array index value for a cargo aircraft object to parse
	 * a can transoprt danger goods field from text file
	 */
	private final static int AIRCRAFT_CAN_TRANSPORT_DANGER_GOODS_ARRAY_INDEX = 8;

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
				String[] fieldsOfAircraft = aircraftString.split(WORD_SPLITTER);

				if (fieldsOfAircraft[AIRCRAFT_TYPE_ARRAY_INDEX].equalsIgnoreCase(AIRLINER_AIRCRAFT)) {
					listOfAircraft.add(FileAircraftsStringTextReader.createAirlinerAicraft(fieldsOfAircraft));

				} else if (fieldsOfAircraft[AIRCRAFT_TYPE_ARRAY_INDEX].equalsIgnoreCase(CARGO_AIRCRAFT)) {
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
		buildAircraft.setId(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_ID_ARRAY_INDEX]));
		buildAircraft.setName(fieldsOfAircraft[AIRCRAFT_NAME_ARRAY_INDEX]);

		// Create BasicTeachAircraftData for a new airliner aircraft object
		BuilderBasicTechAiracft techDataBuild = createBasicAircraftTechData(fieldsOfAircraft);
		buildAircraft.setBasicTechSpecificationAircraft(techDataBuild.getResult());

		// Create AirlinerTechData for a new airliner aircraft object
		BuilderAirlinerAircraftTechData buildAirlinerTechData = createAirlinerAircraftTechData(fieldsOfAircraft);
		buildAircraft.setUniqueAircraftTechData(buildAirlinerTechData.getResult());

		return buildAircraft.getResult();
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
		techDataBuild
				.setMaxWeigthCapacity(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_MAX_WEIGHT_CAPACITY_ARRAY_INDEX]));
		techDataBuild.setFuelSpending(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_FUEL_SPENDING_ARRAY_INDEX]));
		techDataBuild.setMiddleVelocity(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_MIDDLE_VELOCITY_ARRAY_INDEX]));
		techDataBuild.setPeopleCapacity(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_PEOPLE_CAPACITY_ARRAY_INDEX]));

		return techDataBuild;
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
		buildAirlinerTechData.setAirlinerType(fieldsOfAircraft[AIRCRAFT_AIRLINER_TYPE_ARRAY_INDEX]);
		buildAirlinerTechData
				.setHavBusinesClass(Boolean.parseBoolean(fieldsOfAircraft[AIRCRAFT_HAVE_BUSSINES_CLASS_ARRAY_INDEX]));

		return buildAirlinerTechData;
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
		buildAircraft.setId(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_ID_ARRAY_INDEX]));
		buildAircraft.setName(fieldsOfAircraft[AIRCRAFT_NAME_ARRAY_INDEX]);

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
		buildCargoTechData
				.setCargoDepartmentSize(Integer.parseInt(fieldsOfAircraft[AIRCRAFT_CARGO_DEPARTMENT_SIZE_ARRAY_INDEX]));
		buildCargoTechData.setCanTransprtDangerGoods(
				Boolean.parseBoolean(fieldsOfAircraft[AIRCRAFT_CAN_TRANSPORT_DANGER_GOODS_ARRAY_INDEX]));

		return buildCargoTechData;
	}
}
