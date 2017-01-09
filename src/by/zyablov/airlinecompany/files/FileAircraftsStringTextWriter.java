
package by.zyablov.airlinecompany.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft;
import by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft;
import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * Class {@code FileAircraftsStringTextReader} has method to write
 * {@code Aircraft} object's to data text file using parsing string.
 * 
 * @author Дмитрий
 *
 */
public class FileAircraftsStringTextWriter extends FileAircraftsWriter {

	/**
	 * This method write the list of aircrafts to text file
	 * 
	 * @param aircraftsList
	 * @throws IOException
	 */
	public void writeAircraftListToFile(List<Aircraft> aircraftsList) throws IOException {

		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(new File(pathToFileInString))));

		for (Iterator<Aircraft> iterator = aircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();

			if (aircraft instanceof AirlinerAircraft) {

				AirlinerAircraft airlinerAircraft = (AirlinerAircraft) aircraft;
				// Write all data of airlinerAircraft to text file in string
				out.println((String) FileAircraftsStringTextWriter.getParsedAirlinerAircraftFields(airlinerAircraft));

			} else if (aircraft instanceof CargoAircraft) {

				CargoAircraft cargoAircraft = (CargoAircraft) aircraft;
				// Write all data of cargoAircraft to text file in string
				out.println((String) FileAircraftsStringTextWriter.getParsedCargoAircraftFields(cargoAircraft));
			}
		}
		out.close();
	}

	/**
	 * This method parse fields of airliner aircraft to string with symbol -
	 * spliter "|"
	 * 
	 * @param airlinerAircraft
	 * @return parseAirlinerAircraftData
	 */
	private static String getParsedAirlinerAircraftFields(AirlinerAircraft airlinerAircraft) {

		// Parse all fields from airlinerAircraft to string

		// ---BasicTechAircraftData
		int idAircraft = 0;
		String nameAircraft = airlinerAircraft.getNameAircraft();
		Tons maxWeigthCapacity = (Tons) airlinerAircraft.getBasicTechAircraftData().getMaxWeigthCapacity();
		FuelSpendTonPerKm fuelSpending = (FuelSpendTonPerKm) airlinerAircraft.getBasicTechAircraftData()
				.getFuelSpending();
		KilometerPerHour midVelocity = (KilometerPerHour) airlinerAircraft.getBasicTechAircraftData()
				.getMiddleVelocity();
		PeopleCapacity peopleCapacity = (PeopleCapacity) airlinerAircraft.getBasicTechAircraftData()
				.getMaxPeopleCapacity();

		// ---AirlinerTechData
		String airlinerType = (String) airlinerAircraft.getAirlinerTechData().getAirlinerType();
		boolean havBusinesClass = (boolean) airlinerAircraft.getAirlinerTechData().isHavBusinesClass();

		// Create a string type value, which consists of parsed to string
		// airlinerAircraft fields
		String parseAirlinerAircraftData = parseAirlinerAircraftTechDataToString(idAircraft, nameAircraft,
				maxWeigthCapacity, fuelSpending, midVelocity, peopleCapacity, airlinerType, havBusinesClass);

		return parseAirlinerAircraftData;
	}

	/**
	 * This method method parse airliner tech data to string
	 * 
	 * @param idAircraft
	 * @param nameAircraft
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 * @param peopleCapacity
	 * @param airlinerType
	 * @param havBusinesClass
	 * @return a string parsing {@code AirlinerAircraft} object
	 */
	private static String parseAirlinerAircraftTechDataToString(int idAircraft, String nameAircraft,
			Tons maxWeigthCapacity, FuelSpendTonPerKm fuelSpending, KilometerPerHour midVelocity,
			PeopleCapacity peopleCapacity, String airlinerType, boolean havBusinesClass) {

		String parseAirlinerAircraftData = ("AirlinerAircraft" + "|" + idAircraft + "|" + nameAircraft + "|"
				+ maxWeigthCapacity.getMeasureValueInInt() + "|" + fuelSpending.getMeasureValueInInt() + "|"
				+ midVelocity.getMeasureValueInInt() + "|" + peopleCapacity.getMeasureValueInInt() + "|" + airlinerType
				+ "|" + havBusinesClass);

		return parseAirlinerAircraftData;
	}

	/**
	 * This method parse fields of cargo aircraft to string with spliter"|"
	 * 
	 * @param cargoAircraft
	 * @return parseCargoAircraftData
	 */
	private static String getParsedCargoAircraftFields(CargoAircraft cargoAircraft) {

		//// Parse all fields from cargoAircraft to string

		// ---BasicTechAircraftData
		int idAircraft = 0;
		String nameAircraft = cargoAircraft.getNameAircraft();
		Tons maxWeigthCapacity = (Tons) cargoAircraft.getBasicTechAircraftData().getMaxWeigthCapacity();
		FuelSpendTonPerKm fuelSpending = (FuelSpendTonPerKm) cargoAircraft.getBasicTechAircraftData().getFuelSpending();
		KilometerPerHour midVelocity = (KilometerPerHour) cargoAircraft.getBasicTechAircraftData().getMiddleVelocity();
		PeopleCapacity peopleCapacity = (PeopleCapacity) cargoAircraft.getBasicTechAircraftData()
				.getMaxPeopleCapacity();

		// ---CargoAircraftTechData
		CubicMeter cargoDepartmentSize = (CubicMeter) cargoAircraft.getCargoAircraftTechdata().getCargoDepartmentSize();
		;
		boolean canTransprtDangerGoods = (boolean) cargoAircraft.getCargoAircraftTechdata().isCanTransprtDangerGoods();

		// Create a string type value, which consists of parsed to string
		// cargoAircraft fields
		String parseCargoAircraftData = parseCargoAircraftTechDataToString(idAircraft, nameAircraft, maxWeigthCapacity,
				fuelSpending, midVelocity, peopleCapacity, cargoDepartmentSize, canTransprtDangerGoods);

		return parseCargoAircraftData;
	}

	/**
	 * This method method parse cargo aircraft tech data to string
	 * 
	 * @param idAircraft
	 * @param nameAircraft
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 * @param midVelocity
	 * @param peopleCapacity
	 * @param cargoDepartmentSize
	 * @param canTransprtDangerGoods
	 * @return a string parsing {@code CargoAircraft} object
	 */
	private static String parseCargoAircraftTechDataToString(int idAircraft, String nameAircraft,
			Tons maxWeigthCapacity, FuelSpendTonPerKm fuelSpending, KilometerPerHour midVelocity,
			PeopleCapacity peopleCapacity, CubicMeter cargoDepartmentSize, boolean canTransprtDangerGoods) {

		String parseCargoAircraftData = ("CargoAircraft" + "|" + idAircraft + "|" + nameAircraft + "|"
				+ maxWeigthCapacity.getMeasureValueInInt() + "|" + fuelSpending.getMeasureValueInInt() + "|"
				+ midVelocity.getMeasureValueInInt() + "|" + peopleCapacity.getMeasureValueInInt() + "|"
				+ cargoDepartmentSize.getMeasureValueInInt() + "|" + canTransprtDangerGoods);

		return parseCargoAircraftData;
	}

}
