package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE;

import java.io.IOException;

import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class SaveAircraftsToFileAction {

	/**
	 * This method action save all aircrafts information to file
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager) {
		try {

			airlineCompanyManager.saveAircraftsToFile();
			System.out.println("Saved information about aircrafts to file");

		} catch (NoAirlineCompanyException e) {
			System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
		} catch (AircraftEmptyParkException e) {
			System.out.println(WARNING_MESSAGE_EMPTY_PARK);
		} catch (IOException e) {
			System.out.println(WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE);
		}

	}

}
