package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;

import by.zyablov.airlinecompany.enums.comandsenums.GetTotalParametrEnum;
import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * Class {@code CalculateTotalByParametrAction} represents an action to
 * calculate a summary of any parametr of each aircraft in airliner company
 * park.
 * 
 * @author Дмитрий
 *
 */
public class CalculateTotalByParametrAction {

	/**
	 * This action calculates a total amount of airacrafts parametr
	 * 
	 * @param consoleReader
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {

		while (true) {
			try {

				if (!airlineCompanyManager.haveAirlinerCompany()) {
					throw new NoAirlineCompanyException();
				}

				if (airlineCompanyManager.getAircraftsTotalAmount() == 0) {
					throw new AircraftEmptyParkException();
				}

				GetTotalParametrEnum getTotalParam = getTotalParametrTypeToCalculate(consoleReader);

				switch (getTotalParam) {
				case TOTAL_PEOPLE_CAPACITY: {
					showToUserConsoleTotalAircraftsPeopleCapacity(airlineCompanyManager);
					return;
				}

				case TOTAL_WEIGHT_CAPACITY: {
					showToUserConsoleTotalAicraftsWeightCapacity(airlineCompanyManager);
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
				// go to the actionCalculateTotalByParametr menu
				continue;
			}
		}

	}

	/**
	 * This method ges a total paramtr type to calculate
	 * 
	 * @param consoleReader
	 * @return a type of parametr to calculate
	 */
	private static GetTotalParametrEnum getTotalParametrTypeToCalculate(Scanner consoleReader) {
		System.out.println(MessagesForUserEnum.getMenuActionCalculateTotalByParametrMessageInString());

		String comandAction = consoleReader.nextLine();
		GetTotalParametrEnum getTotalParam = GetTotalParametrEnum.stringToEnum(comandAction);
		return getTotalParam;
	}

	/**
	 * This method show to console a total value of aircrafts weight capacity
	 * 
	 * @param airlineCompanyManager
	 * @throws AircraftEmptyParkException
	 * @throws NoAirlineCompanyException
	 */
	private static void showToUserConsoleTotalAicraftsWeightCapacity(AirlineManageSystem airlineCompanyManager)
			throws AircraftEmptyParkException, NoAirlineCompanyException {
		System.out.println("A total weight capacity of all aircrafts at the park is "
				+ airlineCompanyManager.getTotalAircraftsWeigthCapacity());
	}

	/**
	 * This method show to console a total value of aircrafts people capacity
	 * 
	 * @param airlineCompanyManager
	 * @throws AircraftEmptyParkException
	 * @throws NoAirlineCompanyException
	 */
	private static void showToUserConsoleTotalAircraftsPeopleCapacity(AirlineManageSystem airlineCompanyManager)
			throws AircraftEmptyParkException, NoAirlineCompanyException {
		System.out.println("A total people capacity of all aircrafts at the park is "
				+ airlineCompanyManager.getTotalAircraftsPeopleCapacity());
	}

}
