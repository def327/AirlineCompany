package by.zyablov.airlinecompany.menu.aircraftsconsolecreators;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerAircraftTechData;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.enums.aircraftenums.AirlinerTypeEnum;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * Class {@code NewAirlinerAircraftConsoleCreator} is used to create a new
 * airliner aircraft via user console menu.
 * 
 * @author Дмитрий
 *
 */
public class NewAirlinerAircraftConsoleCreator extends NewAircraftConsoleCreator {

	/**
	 * This method returns an airliner tech data object for a new aircraft
	 * 
	 * @param uniqueAircraftTechDataBehavior
	 * 
	 * @return a unique technical information for a new airliner aircraft
	 */
	protected UniqueAircraftTechDataBehavior getUniqueAircraftTechDataBehavior(Scanner consoleReader) {

		AirlinerTechData airlinerTechData = getAirlinerTechData(consoleReader);
		return airlinerTechData;

	}

	/**
	 * This method returns a airliner aicraft tech data object for a new
	 * airliner aircraft
	 * 
	 * @param consoleReader
	 * 
	 * @return airliner technical data information for a new airliner aircraft
	 */
	private AirlinerTechData getAirlinerTechData(Scanner consoleReader) {

		BuilderAirlinerAircraftTechData newAirlinerAircraftTechDataBuilder = new BuilderAirlinerAircraftTechData();

		newAirlinerAircraftTechDataBuilder.setAirlinerType(getAirlinerAircraftType(consoleReader));
		newAirlinerAircraftTechDataBuilder.setHavBusinesClass(getHavBusinesClass(consoleReader));

		return newAirlinerAircraftTechDataBuilder.getResult();
	}

	/**
	 * This method returns a airline aicraft type for airline aircraft tech data
	 * object
	 * 
	 * @param consoleReader
	 * 
	 * @return a type of a new airliner aircraft
	 */
	private String getAirlinerAircraftType(Scanner consoleReader) {
		while (true) {

			try {
				System.out.println("What is a type of aircraft on the flight distance:");
				System.out.println(
						"--Enter '1' to choose a local type to transport passengers over distances up to 1000 km");
				System.out.println(
						"--Enter '2' to choose a regional type to transport passengers over distances up to 3000 km");
				System.out.println(
						"--Enter '3' to choose long-haul type to transport passengers over distances over 6000 km");
				String answer = consoleReader.nextLine();

				AirlinerTypeEnum airlineAircraftType = AirlinerTypeEnum.stringToEnum(answer);
				return airlineAircraftType.getAirlinerType();
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}

		}
	}

	/**
	 * This method returns a boolean value of airline aircraft opportunity to
	 * have bussiness class for airline aircraft tech data object
	 * 
	 * @param consoleReader
	 * 
	 * @return opportunity to have bussiness class for a new airline aircraft
	 */
	private boolean getHavBusinesClass(Scanner consoleReader) {
		while (true) {

			System.out.println("Has a new airline aircraft bussiness class:");
			System.out.println("--Enter '1' have bussiness class");
			System.out.println("--Enter '2' don't bussiness class ");

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
