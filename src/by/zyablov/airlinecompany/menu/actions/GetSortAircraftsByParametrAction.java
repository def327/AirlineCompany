package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.enums.comandsenums.GetSortTypesEnum;
import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class GetSortAircraftsByParametrAction {

	/**
	 * !!! This action show all aircrafts, sorted by parametr
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {
		while (true) {
			try {
				
				if(!airlineCompanyManager.haveAirlinerCompany()){
					throw new NoAirlineCompanyException();
				}
				
				if(airlineCompanyManager.getAircraftsTotalAmount() == 0){
					throw new AircraftEmptyParkException();
				}
				
				GetSortTypesEnum getSortType = choseParametrTypeToSortAircrafts(consoleReader);
				
				switch (getSortType) {
				case SORT_BY_FUEL_SPEND: {
					showSortedAircraftsByFuelSpend(airlineCompanyManager);
					return;
				}
				
				case SORT_BY_MIDDLE_VELOCITY: {
					showSortedAircraftsByMiddleVelocity(airlineCompanyManager);
					return;
				}
				
				case SORT_BY_PEOPLE_CAPACITY: {
					showSortedAircraftsByPeopleCapacity(airlineCompanyManager);
					return;
				}
				
				case SORT_BY_WEIGHT_CAPACITY: {
					showSortedAircraftsByWeightCapacity(airlineCompanyManager);
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

	/**
	 * !!! This method get a type of a sort parametr to show all aircrafts from airline company park
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static GetSortTypesEnum choseParametrTypeToSortAircrafts(Scanner consoleReader) {
		System.out.println(MessagesForUserEnum.getMenuActionGetSortAircraftsByParametrMessageInString());

		String comandAction = consoleReader.nextLine();
		GetSortTypesEnum getSortType = GetSortTypesEnum.stringToEnum(comandAction);
		return getSortType;
	}

	/**
	 *  !!! This method show all aircrafts to user console sorted by weight capacity
	 *  
	 * @param airlineCompanyManager
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static void showSortedAircraftsByWeightCapacity(AirlineManageSystem airlineCompanyManager)
			throws NoAirlineCompanyException, AircraftEmptyParkException {
		List<Aircraft> sortedAircraftsList = airlineCompanyManager.getListOfSortAicraftByMaxWeightCapacity();

		for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println("Aircrafts ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
					+ aircraft.getNameAircraft() + " maximum weight capacity: "
					+ aircraft.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInString());
		}
	}

	/**
	 *  !!! This method show all aircrafts to user console sorted by people capacity
	 * @param airlineCompanyManager
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static void showSortedAircraftsByPeopleCapacity(AirlineManageSystem airlineCompanyManager)
			throws NoAirlineCompanyException, AircraftEmptyParkException {
		
		List<Aircraft> sortedAircraftsList = airlineCompanyManager.getListOfSortAircraftByPeopleCapacity();

		for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println("Aircrafts ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
					+ aircraft.getNameAircraft() + " maximum people capacity: "
					+ aircraft.getBasicTechAircraftData().getMaxPeopleCapacity().getMeasureValueInString());
		}
	}

	/**
	 *  !!! This method show all aircrafts to user console sorted by middle velocity
	 * @param airlineCompanyManager
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static void showSortedAircraftsByMiddleVelocity(AirlineManageSystem airlineCompanyManager)
			throws NoAirlineCompanyException, AircraftEmptyParkException {
		List<Aircraft> sortedAircraftsList = airlineCompanyManager.getListOfSortAircraftsByMidVelocity();

		for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println("Aircrafts ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
					+ aircraft.getNameAircraft() + " middle velocity: "
					+ aircraft.getBasicTechAircraftData().getMiddleVelocity().getMeasureValueInString());
		}
	}

	/**
	 *  !!! This method show all aircrafts to user console sorted by fuel spending
	 *  
	 * @param airlineCompanyManager
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static void showSortedAircraftsByFuelSpend(AirlineManageSystem airlineCompanyManager)
			throws NoAirlineCompanyException, AircraftEmptyParkException {
		List<Aircraft> sortedAircraftsList = airlineCompanyManager.getListOfSortAicraftByFuelSpending();

		for (Iterator<Aircraft> iterator = sortedAircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println("Aircraft ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
					+ aircraft.getNameAircraft() + " fuel spending: "
					+ aircraft.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString());
		}
	}

}
