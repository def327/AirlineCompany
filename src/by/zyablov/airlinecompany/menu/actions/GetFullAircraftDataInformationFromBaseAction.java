package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class GetFullAircraftDataInformationFromBaseAction {

	/**
	 * !!! This action show a full information about a certain aircraft from
	 * airliner company park
	 * 
	 * @param consoleReader
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {
		try {

			Aircraft foundAircraft = getAircraftByIdFromAicraftPark(airlineCompanyManager, consoleReader);
			showToUserConsoleFullAircraftInformationData(foundAircraft);

		} catch (NoAirlineCompanyException e) {
			System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
			return;
		} catch (AircraftEmptyParkException e) {
			System.out.println(WARNING_MESSAGE_EMPTY_PARK);
			return;
		}
	}

	/**
	 * !!! This method return an aircraft by id from airline company park
	 * 
	 * @param airlineCompanyManager
	 * @param consoleReader
	 * @return
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static Aircraft getAircraftByIdFromAicraftPark(AirlineManageSystem airlineCompanyManager,
			Scanner consoleReader) throws NoAirlineCompanyException, AircraftEmptyParkException {
		while (true) {
			try {

				showToUserConsoleAircraftsFromAirlineCompanyPark(airlineCompanyManager);

				String idString = consoleReader.nextLine();
				int idAircraft = Integer.parseInt(idString);

				if (idAircraft <= 0) {
					throw new NumberFormatException();
				}

				Aircraft foundAircraft = airlineCompanyManager.getAircraftkById(idAircraft);

				if (foundAircraft == null) {
					System.out.println(WARNING_MESSAGE_TRY_AGAIN);
					continue;
				} else {
					return foundAircraft;
				}

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * !!! This method show to console aircraft's full data information
	 * 
	 * @param foundAircraft
	 */
	private static void showToUserConsoleFullAircraftInformationData(Aircraft foundAircraft) {
		System.out.println(foundAircraft.getFullAircraftInformationDataToString());
	}

	/**
	 * !!! This method show all aircrafts to console
	 * 
	 * @param airlineCompanyManager
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static void showToUserConsoleAircraftsFromAirlineCompanyPark(AirlineManageSystem airlineCompanyManager)
			throws NoAirlineCompanyException, AircraftEmptyParkException {

		List<Aircraft> aircraftsList = airlineCompanyManager.getListOfAicrafts();

		System.out.println("Please enter aircraft id from a table below:");
		System.out.println("Aircrafts at the airline company park:");

		for (Iterator<Aircraft> iterator = aircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println(
					"Aircraft ID: " + aircraft.getIdAircraft() + " Aircraft Name: " + aircraft.getNameAircraft());
		}
	}
}
