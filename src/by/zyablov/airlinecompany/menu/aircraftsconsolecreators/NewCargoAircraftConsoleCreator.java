package by.zyablov.airlinecompany.menu.aircraftsconsolecreators;

import java.util.Scanner;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraftTechData;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;

/**
 * Class {@code NewCargoAircraftConsoleCreator} is used to create a new cargo
 * aircraft via user console menu.
 * 
 * @author Дмитрий
 *
 */
public class NewCargoAircraftConsoleCreator extends NewAircraftConsoleCreator {

	/**
	 * This method return a cargo aicraft tech data object for a new aircraft
	 * 
	 * @param consoleReader
	 * 
	 * @return cargo technical data information for a new cargo aircraft
	 */
	protected CargoAircraftTechData getUniqueAircraftTechDataBehavior(Scanner consoleReader) {

		BuilderCargoAircraftTechData newCargoAircraftTechDataBuilder = new BuilderCargoAircraftTechData();
		newCargoAircraftTechDataBuilder.setCargoDepartmentSize(getCargoDepartmentSize(consoleReader));
		newCargoAircraftTechDataBuilder.setCanTransprtDangerGoods(getCanTransportDangerGoods(consoleReader));
		return newCargoAircraftTechDataBuilder.getResult();
	}

	/**
	 * This method return an int value of department size for cargo aircraft
	 * tech data object
	 * 
	 * @param consoleReader
	 * 
	 * @return a size of department for a new cargo aircraft
	 */
	private static int getCargoDepartmentSize(Scanner consoleReader) {
		while (true) {

			final int minimumCargoDepartmentSize = 5;
			final int maximumCargoDepartmentSize = 2000;

			System.out.println("Choose a cargo department size for a new cargo aircraft (from 5 M^3  to 2000 M^3):");
			String newAircraftCargoDepartmentSize = consoleReader.nextLine();

			try {

				int newAircraftCargoDepartmentSizeInInt = Integer.parseInt(newAircraftCargoDepartmentSize);

				if ((newAircraftCargoDepartmentSizeInInt < minimumCargoDepartmentSize)
						|| (newAircraftCargoDepartmentSizeInInt > maximumCargoDepartmentSize)) {
					throw new NumberFormatException();
				}
				return newAircraftCargoDepartmentSizeInInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * This method return a boolean value of cargo aircraft opportunity to
	 * transport danger goods for cargo aircraft tech data object
	 * 
	 * @param consoleReader
	 * 
	 * @return opportunity to transport danger goods for a new cargo aircraft
	 */
	private static boolean getCanTransportDangerGoods(Scanner consoleReader) {
		while (true) {

			System.out.println("Can a new cargo aircraft transport danger goods:");
			System.out.println("--Enter '1' to allow for a new cargo aircraft transport danger goods");
			System.out.println("--Enter '2' no to allow for a new cargo aircraft transport danger goods");

			String answer = consoleReader.nextLine();

			switch (answer) {

			case "1": {
				return true;
			}

			case "2": {
				return false;
			}

			default: {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
			}
		}
	}

}