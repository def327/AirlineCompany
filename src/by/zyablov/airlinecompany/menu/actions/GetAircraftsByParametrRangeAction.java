package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NO_SUITABLE_AIRCRAFTS;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.enums.comandsenums.GetByRangeParametrEnum;
import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.exeptions.NoSuitableAircraftsException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

/**
 * Class {@code GetAircraftsByParametrRangeAction} represents an action to show
 * all aircraft which parametrs are suitable for search range.
 * 
 * @author Дмитрий
 *
 */
public class GetAircraftsByParametrRangeAction {

	/**
	 * This action show all aircrafts, which are suitable for paramert range
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {

		while (true) {
			try {
				GetByRangeParametrEnum getSortType = choseRangedParametr(airlineCompanyManager, consoleReader);

				switch (getSortType) {

				case RANGE_BY_FUEL_SPENDING: {
					showAircraftsRangedByFuelSpend(airlineCompanyManager, consoleReader);
					return;
				}

				case RANGE_BY_MIDDLE_VELOCITY: {
					showAircraftsRangedByMiddleVelocity(airlineCompanyManager, consoleReader);
					return;
				}
				}
			} catch (NoAirlineCompanyException e) {
				System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
				break;
			} catch (AircraftEmptyParkException e) {
				System.out.println(WARNING_MESSAGE_EMPTY_PARK);
				break;
			} catch (NoSuitableAircraftsException e) {
				System.out.println(WARNING_MESSAGE_NO_SUITABLE_AIRCRAFTS);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				// go to actionGetAircraftsByParametrRange menu
				continue;
			}
		}

	}

	/**
	 * This method get a type of a ranged parametr to show all aircrafts from
	 * airline company park
	 * 
	 * @param airlineCompanyManager
	 * @param consoleReader
	 * 
	 * @return a type of parametr for a searching range
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	private static GetByRangeParametrEnum choseRangedParametr(AirlineManageSystem airlineCompanyManager,
			Scanner consoleReader) throws NoAirlineCompanyException, AircraftEmptyParkException {

		// To check: did you create an airline company
		if (!airlineCompanyManager.haveAirlinerCompany()) {
			throw new NoAirlineCompanyException();
		}

		// To check: if there are any aircrafts at hte airline compamy
		// park
		if (airlineCompanyManager.getAircraftsTotalAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		System.out.println(MessagesForUserEnum.getMenuActionGetAircraftsByParametrRangeMessageInString());

		String comandAction = consoleReader.nextLine();
		GetByRangeParametrEnum getSortType = GetByRangeParametrEnum.stringToEnum(comandAction);
		return getSortType;
	}

	/**
	 * This method show all aircrafts from airline company park ranged by
	 * minimum and maximum aircraft's fuel spending
	 * 
	 * @param airlineCompanyManager
	 * @param consoleReader
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * @throws NoSuitableAircraftsException
	 */
	private static void showAircraftsRangedByFuelSpend(AirlineManageSystem airlineCompanyManager, Scanner consoleReader)
			throws NoAirlineCompanyException, AircraftEmptyParkException, NoSuitableAircraftsException {

		int valueFromFuelSpendingInt = getMinimumAircraftFuelSpendingInInt(consoleReader);
		int valueToFuelSpendingInt = getMaximumAircraftFuelSpendingInInt(consoleReader, valueFromFuelSpendingInt);

		showToUserConsoleAircraftsRangedByFuelSpending(airlineCompanyManager, valueFromFuelSpendingInt,
				valueToFuelSpendingInt);
	}

	/**
	 * This method return a minimum value of aircraft's fuel spending, which is
	 * entered from console by user
	 * 
	 * @param consoleReader
	 * @param valueFromFuelSpendingInt
	 * 
	 * @return minimum {@code FuelSpendTonPerKm} object, which is parsed to int
	 *         type
	 */
	private static int getMinimumAircraftFuelSpendingInInt(Scanner consoleReader) {
		while (true) {
			try {
				System.out.println("Please enter a minimum fuel aircraft spending:");

				String numberString = consoleReader.nextLine();
				int valueFromFuelSpendingInt = Integer.parseInt(numberString);

				if (valueFromFuelSpendingInt <= 0) {
					throw new NumberFormatException();
				}

				return valueFromFuelSpendingInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * 
	 * This method return a maximum value of aircraft's fuel spending, which is
	 * entered from console by user
	 * 
	 * @param consoleReader
	 * @param valueFromFuelSpendingInt
	 * @param valueToFuelSpendingInt
	 * 
	 * @return maximum {@code FuelSpendTonPerKm} object, which is parsed to int
	 *         type
	 */
	private static int getMaximumAircraftFuelSpendingInInt(Scanner consoleReader, int valueFromFuelSpendingInt) {
		while (true) {
			try {
				System.out.println("Please enter a maximum fuel aircraft spending:");

				String numberString = consoleReader.nextLine();
				int valueToFuelSpendingInt = Integer.parseInt(numberString);

				if (valueToFuelSpendingInt < valueFromFuelSpendingInt | valueToFuelSpendingInt <= 0) {
					throw new NumberFormatException();
				}

				return valueToFuelSpendingInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * This method show aircrafts to user console ranged by minimum and maximum
	 * aircraft's fuel spending
	 * 
	 * @param airlineCompanyManager
	 * @param valueFromFuelSpendingInt
	 * @param valueToFuelSpendingInt
	 * 
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * @throws NoSuitableAircraftsException
	 */
	private static void showToUserConsoleAircraftsRangedByFuelSpending(AirlineManageSystem airlineCompanyManager,
			int valueFromFuelSpendingInt, int valueToFuelSpendingInt)
			throws NoAirlineCompanyException, AircraftEmptyParkException, NoSuitableAircraftsException {

		FuelSpendTonPerKm fromValueFuelSpending = new FuelSpendTonPerKm(valueFromFuelSpendingInt);
		FuelSpendTonPerKm toValueFuelSpending = new FuelSpendTonPerKm(valueToFuelSpendingInt);

		List<Aircraft> aircraftsList = airlineCompanyManager
				.getListOfFoundAircraftsByFuelSpendingRange(fromValueFuelSpending, toValueFuelSpending);

		if (aircraftsList.size() == 0) {
			throw new NoSuitableAircraftsException();
		}

		for (Iterator<Aircraft> iterator = aircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println("Aircraft ID: " + aircraft.getIdAircraft() + " Aircraft Name: "
					+ aircraft.getNameAircraft() + " fuel spending: "
					+ aircraft.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString());
		}
	}

	/**
	 * This method show all aircrafts from airline company park ranged by
	 * minimum and maximum aircraft's middle velocity
	 * 
	 * @param airlineCompanyManager
	 * @param consoleReader
	 * 
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws NoSuitableAircraftsException
	 * @throws AircraftEmptyParkException
	 */
	private static void showAircraftsRangedByMiddleVelocity(AirlineManageSystem airlineCompanyManager,
			Scanner consoleReader)
			throws NoAirlineCompanyException, NoSuitableAircraftsException, AircraftEmptyParkException {

		int valueFromMidVelocityInt = getMinimumAircraftMiddleVelocityInInt(consoleReader);
		int valueToMidVelocityInt = getMaximumAircraftMiddleVelocityInInt(consoleReader, valueFromMidVelocityInt);

		showToUserConsoleAircraftsRangedByMiddleVelocity(airlineCompanyManager, valueFromMidVelocityInt,
				valueToMidVelocityInt);
	}

	/**
	 * This method show aircrafts to user console ranged by minimum and maximum
	 * aircraft's middle velocity
	 * 
	 * @param airlineCompanyManager
	 * @param valueFromMidVelocityInt
	 * @param valueToMidVelocityInt
	 * 
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws NoSuitableAircraftsException
	 * @throws AircraftEmptyParkException
	 */
	private static void showToUserConsoleAircraftsRangedByMiddleVelocity(AirlineManageSystem airlineCompanyManager,
			int valueFromMidVelocityInt, int valueToMidVelocityInt)
			throws NoAirlineCompanyException, NoSuitableAircraftsException, AircraftEmptyParkException {

		KilometerPerHour fromValueMidVelocity = new KilometerPerHour(valueFromMidVelocityInt);
		KilometerPerHour toValueMidVelocity = new KilometerPerHour(valueToMidVelocityInt);
		List<Aircraft> aircraftsList = airlineCompanyManager
				.getListOfFoundAircraftsByMidVelocityRange(fromValueMidVelocity, toValueMidVelocity);

		if (aircraftsList.size() == 0) {
			throw new NoSuitableAircraftsException();
		}

		for (Iterator<Aircraft> iterator = aircraftsList.iterator(); iterator.hasNext();) {
			Aircraft aircraft = (Aircraft) iterator.next();
			System.out.println("Aircraft ID: " + aircraft.getIdAircraft() + "Aircraft Name: "
					+ aircraft.getNameAircraft() + " middle velocity: "
					+ aircraft.getBasicTechAircraftData().getMiddleVelocity().getMeasureValueInString());
		}
	}

	/**
	 * This method return a minimum value of aircraft's middle velocity, which
	 * is entered from console by user
	 * 
	 * @param consoleReader
	 * @param valueFromMidVelocityInt
	 * @return minimum {@code KilometerPerHour} object, which is parsed to int
	 *         type
	 */
	private static int getMinimumAircraftMiddleVelocityInInt(Scanner consoleReader) {
		while (true) {
			try {
				System.out.println("Please enter a minimum aircraft velocity:");

				String numberString = consoleReader.nextLine();
				int valueFromMidVelocityInt = Integer.parseInt(numberString);

				if (valueFromMidVelocityInt <= 0) {
					throw new NumberFormatException();
				}

				return valueFromMidVelocityInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * This method return a maximum value of aircraft's middle velocity, which
	 * is entered from console by user *
	 * 
	 * @param consoleReader
	 * @param valueFromMidVelocityInt
	 * @param valueToMidVelocityInt
	 * 
	 * @return maximum {@code KilometerPerHour} object, which is parsed to int
	 *         type
	 */
	private static int getMaximumAircraftMiddleVelocityInInt(Scanner consoleReader, int valueFromMidVelocityInt) {
		while (true) {
			try {
				System.out.println("Please enter a maximum aircraft velocity:");

				String numberString = consoleReader.nextLine();
				int valueToMidVelocityInt = Integer.parseInt(numberString);

				if (valueToMidVelocityInt < valueFromMidVelocityInt | valueToMidVelocityInt <= 0) {
					throw new NumberFormatException();
				}

				return valueToMidVelocityInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

}
