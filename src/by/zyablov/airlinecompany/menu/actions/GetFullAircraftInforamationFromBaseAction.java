package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class GetFullAircraftInforamationFromBaseAction {
	
	
	/**
	 * !!! This action show a full information about a certain aircraft from
	 * airliner company park
	 * 
	 * @param consoleReader
	 */
	public static void run(AirlineManageSystem airlineCompanyManager, Scanner consoleReader){
		
		List<Aircraft> aircraftsList = null;

		try {
			aircraftsList = airlineCompanyManager.getListOfAicrafts();

			System.out.println("Aircrafts at the airline company park:");

			for (Iterator<Aircraft> iterator = aircraftsList.iterator(); iterator.hasNext();) {
				Aircraft aircraft = (Aircraft) iterator.next();
				System.out.println(
						"Aircraft ID: " + aircraft.getIdAircraft() + " Aircraft Name: " + aircraft.getNameAircraft());
			}

			int idAircraft = 0;
			while (true) {
				try {
					System.out.println("Please enter aircraft id from a table above:");

					String idString = consoleReader.nextLine();
					idAircraft = Integer.parseInt(idString);

					if (idAircraft <= 0) {
						throw new NumberFormatException();
					}

					Aircraft foundAircraft = airlineCompanyManager.getAircraftkById(idAircraft);

					if (foundAircraft == null) {
						System.out.println(WARNING_MESSAGE_TRY_AGAIN);
						continue;
					}
					
					System.out.println(foundAircraft.getFullAircraftInformationDataToString());
					break;
				} catch (NumberFormatException e) {
					System.out.println(WARNING_MESSAGE_TRY_AGAIN);
					continue;
				}
			}

		} catch (NoAirlineCompanyException e) {
			System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
			return;
		} catch (AircraftEmptyParkException e) {
			System.out.println(WARNING_MESSAGE_EMPTY_PARK);
			return;
		}
		
	}

}
