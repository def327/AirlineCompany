package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;

import by.zyablov.airlinecompany.beans.builders.BuilderAirlineCompany;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class CreateAirlineCompanyAction {
	
	/**
	 * !!! This action create a new airline company
	 * 
	 * @param consoleReader
	 */
	public static void run(AirlineManageSystem airlineCompanyManager, Scanner consoleReader){
		

		if (airlineCompanyManager.haveAirlinerCompany() == true) {
			System.out.println("You created an airliner company yet!");
			return;
		}

		BuilderAirlineCompany airlineCompanyBuilder = new BuilderAirlineCompany();

		System.out.println("Create Airliner company:");

		while (true) {

			// Enter a name of a new airline company
			System.out.println("Please chose a name of a new airline company:");
			System.out.println("Enter '1' to chose Belavia");
			System.out.println("Enter '2' to chose Lufthansa");
			System.out.println("Enter '3' to chose Emirates Airlines");
			String companyName = consoleReader.nextLine();

			// !!! NEED to Refactoring!!!
			switch (companyName) {
			case "1": {
				airlineCompanyBuilder.buildAirlineCompanyUsingOnlyAirlineCompanyName(("Belavia"));
				airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());

				System.out.println("You created a new airline company:");
				System.out.println(airlineCompanyManager.getFullAirlineCompanyInformation());
				return;
			}

			case "2": {
				airlineCompanyBuilder.buildAirlineCompanyUsingOnlyAirlineCompanyName(("Lufthansa"));
				airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());

				System.out.println("You created a new airline company:");
				System.out.println(airlineCompanyManager.getFullAirlineCompanyInformation());
				return;
			}

			case "3": {
				airlineCompanyBuilder.buildAirlineCompanyUsingOnlyAirlineCompanyName(("Emirates Airlines"));
				airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());

				System.out.println("You created a new airline company:");
				System.out.println(airlineCompanyManager.getFullAirlineCompanyInformation());
				return;
			}

			default: {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				break;
			}
			}
		}
		
	}

}
