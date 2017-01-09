package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;

import by.zyablov.airlinecompany.beans.builders.BuilderAirlineCompany;
import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * Class {@code CreateAirlineCompanyAction} represents an action to create a new
 * aircraft airline company.
 * 
 * @author Дмитрий
 *
 */
public class CreateAirlineCompanyAction {

	/**
	 * This action create a new airline company
	 * 
	 * @param consoleReader
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {

		if (airlineCompanyManager.haveAirlinerCompany()) {
			System.out.println("You created an airliner company yet!");
			return;
		}

		BuilderAirlineCompany airlineCompanyBuilder = new BuilderAirlineCompany();

		String airlineCompanyName = choseNameForNewAirlineCompany(airlineCompanyManager, consoleReader,
				airlineCompanyBuilder);
		createAirlineCompany(airlineCompanyManager, airlineCompanyBuilder, airlineCompanyName);
		showToUserConsoleAirlineCompanyInformation(airlineCompanyManager);
	}

	/**
	 * Choose a name from list for a new airline company
	 * 
	 * @param airlineCompanyManager
	 * @param consoleReader
	 * @param airlineCompanyBuilder
	 */
	private static String choseNameForNewAirlineCompany(AirlineManageSystem airlineCompanyManager,
			Scanner consoleReader, BuilderAirlineCompany airlineCompanyBuilder) {

		System.out.println("Please chose a name to create a new airline company:");
		while (true) {

			System.out.println(MessagesForUserEnum.getMenuActionCreateAirlineCompanyInString());
			String companyName = consoleReader.nextLine();

			switch (companyName) {

			case "1": {
				return "Belavia";
			}
			case "2": {
				return "Lufthansa";
			}
			case "3": {
				createAirlineCompany(airlineCompanyManager, airlineCompanyBuilder, "Emirates Airlines");
				return "Emirates Airlines";
			}
			case "4": {
				createAirlineCompany(airlineCompanyManager, airlineCompanyBuilder, "Air France");
				return "Air France";
			}
			default: {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
			}
		}
	}

	/**
	 * This method create airline company using only selected airline company
	 * name
	 * 
	 * @param airlineCompanyManager
	 * @param airlineCompanyBuilder
	 */
	private static void createAirlineCompany(AirlineManageSystem airlineCompanyManager,
			BuilderAirlineCompany airlineCompanyBuilder, String airlineCompanyName) {

		airlineCompanyBuilder.buildAirlineCompanyUsingOnlyAirlineCompanyName((airlineCompanyName));
		airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());
	}

	/**
	 * This method show full to console information about new created airline
	 * company
	 * 
	 * @param airlineCompanyManager
	 */
	private static void showToUserConsoleAirlineCompanyInformation(AirlineManageSystem airlineCompanyManager) {
		System.out.println("You created a new airline company:");
		System.out.println(airlineCompanyManager.getFullAirlineCompanyInformation());
	}

}
