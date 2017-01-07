package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraft;
import by.zyablov.airlinecompany.enums.comandsenums.GetAicraftTypeToAddEnum;
import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.interfaces.NewAircraftConsoleCreatorBehavior;
import by.zyablov.airlinecompany.menu.aircraftsconsolecreators.NewAirlinerAircraftConsoleCreator;
import by.zyablov.airlinecompany.menu.aircraftsconsolecreators.NewCargoAircraftConsoleCreator;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class AddNewAirecraftAction {

	/**
	 * !!! This action create and add new aicraft
	 * @param airlineCompanyManager
	 * @param consoleReader
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {
		while (true) {
			try {

				if (!airlineCompanyManager.haveAirlinerCompany()) {
					throw new NoAirlineCompanyException();
				}

				GetAicraftTypeToAddEnum getAicraftTypeToCreate = choseAircraftTypeToAdd(consoleReader);

				switch (getAicraftTypeToCreate) {
				case ADD_NEW_AIRLINE_AIRCRAFT: {
					NewAircraftConsoleCreatorBehavior newAircraftConsoleCreator = new NewAirlinerAircraftConsoleCreator();
					newAircraftConsoleCreator.addAndCreateNewAircraft(consoleReader, airlineCompanyManager, new BuilderAirlinerAircraft());
					return;
				}
				case ADD_NEW_CARGO_AIRCRAFT: {
					NewAircraftConsoleCreatorBehavior newAircraftConsoleCreator = new NewCargoAircraftConsoleCreator();
					newAircraftConsoleCreator.addAndCreateNewAircraft(consoleReader, airlineCompanyManager, new BuilderCargoAircraft());
					return;
				}
				}
			} catch (NoAirlineCompanyException e) {
				System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}

	}

	/**
	 * !!! This method get a type of aircraft to create
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static GetAicraftTypeToAddEnum choseAircraftTypeToAdd(Scanner consoleReader) {
		System.out.println(MessagesForUserEnum.getMenuActionAddNewAirecraft());

		String comandAction = consoleReader.nextLine();
		GetAicraftTypeToAddEnum getAicraftTypeToCreate = GetAicraftTypeToAddEnum.stringToEnum(comandAction);
		return getAicraftTypeToCreate;
	}



}
