package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.enums.comandenums.GetSortTypesEnum;
import by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class GetSortAircraftsByParametrAction {
	
	/**
	 * !!! This action show all aircrafts, sorted by parametr
	 */
	public static void run(AirlineManageSystem airlineCompanyManager, Scanner consoleReader ){
		

		while (true) {

			try {

				System.out.println(MessagesForUserEnum.getMenuActionGetSortAircraftsByParametrMessageInString());

				String comandAction = consoleReader.nextLine();
				GetSortTypesEnum getSortType = GetSortTypesEnum.stringToEnum(comandAction);

				switch (getSortType) {
				case SORT_BY_FUEL_SPEND: {
					List<Aircraft> sortedAircraftsList = airlineCompanyManager
							.getListOfSortAicraftByFuelSpending();

					for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
						Aircraft aircraft = (Aircraft) iterator.next();
						System.out.println("Aircraft ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
								+ aircraft.getNameAircraft() + " fuel spending: "
								+ aircraft.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString());
					}
					return;
				}
				case SORT_BY_MIDDLE_VELOCITY: {
					List<Aircraft> sortedAircraftsList = airlineCompanyManager
							.getListOfSortAircraftsByMidVelocity();

					for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
						Aircraft aircraft = (Aircraft) iterator.next();
						System.out.println("Aircrafts ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
								+ aircraft.getNameAircraft() + " middle velocity: "
								+ aircraft.getBasicTechAircraftData().getMidVelocity().getMeasureValueInString());
					}
					return;
				}
				case SORT_BY_PEOPLE_CAPACITY: {
					List<Aircraft> sortedAircraftsList = airlineCompanyManager
							.getListOfSortAircraftByPeopleCapacity();

					for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
						Aircraft aircraft = (Aircraft) iterator.next();
						System.out.println("Aircrafts ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
								+ aircraft.getNameAircraft() + " maximum people capacity: "
								+ aircraft.getBasicTechAircraftData().getMaxPeopleCapacity().getMeasureValueInString());
					}
					return;
				}
				case SORT_BY_WEIGHT_CAPACITY: {
					List<Aircraft> sortedAircraftsList = airlineCompanyManager
							.getListOfSortAicraftByMaxWeightCapacity();

					for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
						Aircraft aircraft = (Aircraft) iterator.next();
						System.out.println("Aircrafts ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
								+ aircraft.getNameAircraft() + " maximum weight capacity: "
								+ aircraft.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInString());
					}
					return;
				}
				}
			} catch (NoAirlineCompanyException e) {
				System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
				break;
			} catch (AircraftEmptyParkException e) {
				System.out.println(WARNING_MESSAGE_EMPTY_PARK);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				// go to actionGetSortAircraftsByParametr menu
				continue;
			}
		}
		
	}

}
