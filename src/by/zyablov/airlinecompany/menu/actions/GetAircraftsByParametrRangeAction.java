package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_NO_SUITABLE_AIRCRAFTS;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.enums.comandenums.GetByRangeParametrEnum;
import by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.exeptions.NoSuitableAircraftsException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class GetAircraftsByParametrRangeAction {
	
	/**
	 * !!! This action show all aircrafts, which are suitable for paramert range
	 */
	public static void run(AirlineManageSystem airlineCompanyManager, Scanner consoleReader){
		while (true) {

			try {

				// To check: did you create an airline company
				if (airlineCompanyManager.getAirlineCompany() == null) {
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

				switch (getSortType) {

				case RANGE_BY_FUEL_SPENDING: {

					int valueFromFuelSpendingInt = 0;
					int valueToFuelSpendingInt = 0;

					while (true) {
						try {
							System.out.println("Please enter a minimum fuel aircraft spending:");

							String numberString = consoleReader.nextLine();
							valueFromFuelSpendingInt = Integer.parseInt(numberString);

							if (valueFromFuelSpendingInt <= 0) {
								throw new NumberFormatException();
							}
							break;
						} catch (NumberFormatException e) {
							System.out.println(WARNING_MESSAGE_TRY_AGAIN);
							continue;
						}
					}

					while (true) {
						try {
							System.out.println("Please enter a maximum fuel aircraft spending:");

							String numberString = consoleReader.nextLine();
							valueToFuelSpendingInt = Integer.parseInt(numberString);

							if (valueToFuelSpendingInt < valueFromFuelSpendingInt | valueToFuelSpendingInt <= 0) {
								throw new NumberFormatException();
							}
							break;
						} catch (NumberFormatException e) {
							System.out.println(WARNING_MESSAGE_TRY_AGAIN);
							continue;
						}
					}
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
					return;
				}

				case RANGE_BY_MIDDLE_VELOCITY: {

					int valueFromMidVelocityInt = 0;
					int valueToMidVelocityInt = 0;

					while (true) {
						try {
							System.out.println("Please enter a minimum aircraft velocity:");

							String numberString = consoleReader.nextLine();
							valueFromMidVelocityInt = Integer.parseInt(numberString);

							if (valueFromMidVelocityInt <= 0) {
								throw new NumberFormatException();
							}
							break;
						} catch (NumberFormatException e) {
							System.out.println(WARNING_MESSAGE_TRY_AGAIN);
							continue;
						}
					}

					while (true) {
						try {
							System.out.println("Please enter a maximum aircraft velocity:");

							String numberString = consoleReader.nextLine();
							valueToMidVelocityInt = Integer.parseInt(numberString);

							if (valueToMidVelocityInt < valueFromMidVelocityInt | valueToMidVelocityInt <= 0) {
								throw new NumberFormatException();
							}
							break;
						} catch (NumberFormatException e) {
							System.out.println(WARNING_MESSAGE_TRY_AGAIN);
							continue;
						}
					}

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
								+ aircraft.getBasicTechAircraftData().getMidVelocity().getMeasureValueInString());
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

}
