/**
 * 
 */
package by.zyablov.airlinecompany.menu;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlineCompany;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.enums.comandenums.GetByRangeParametrEnum;
import by.zyablov.airlinecompany.enums.comandenums.GetSortTypesEnum;
import by.zyablov.airlinecompany.enums.comandenums.GetTotalParametrEnum;
import by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.enums.comandenums.UserComandEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.exeptions.NoSuitableAircraftsException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.*;

/**
 * @author Дмитрий
 *
 */
public class ApplicationMenu {

	private AirlineManageSystem airlineCompanyManager;

	public ApplicationMenu() {
		airlineCompanyManager = new AirlineManageSystem();
	}

	public void actionMainMenuRun() {

		// Create only one Scanner object for a whole menu
		Scanner inReader = new Scanner(System.in);

		while (true) {
			try {
				System.out.println(MessagesForUserEnum.getMainMenuActionsMessageInString());

				String comandAction = inReader.nextLine();
				UserComandEnum action = UserComandEnum.stringToEnum(comandAction);

				switch (action) {
				case ADD_NEW_AIRCRAFT: {
					actionAddNewAirecraft();
					break;
				}
				case CALCULATE_TOTAL_BY_PARAMETR: {
					actionCalculateTotalByParametr(inReader);
					break;
				}
				case CREATE_AIRLINE_COMPANY: {
					actionCreateAirlineCompany(inReader);
					break;
				}
				case EXIT_APPLICATION: {
					actionExitProgram();
					inReader.close(); // Close the scanner
					break;
				}
				case GET_AICRAFT_LIST_BY_PARAMETR_RANGE: {
					actionGetAircraftsByParametrRange(inReader);
					break;
				}
				case GET_FULL_AIRCRAFT_INFORMATION_FROM_BASE: {
					actionGetFullAircraftInforamationFromBase();
					break;
				}
				case GET_SORT_AIRCRAFT_LIST: {
					actionGetSortAircraftsByParametr(inReader);
					break;
				}
				case REMOVE_AIRCRAFT: {
					actionRemoveAircraft();
					break;
				}
				case SAVE_AIRCRAFTS_TO_FILE: {
					actionSaveAircraftsToFile();
					break;
				}
				default:
					System.out.println("TRY AGAIN");
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	private void actionSaveAircraftsToFile() {
		// TODO Auto-generated method stub

	}

	private void actionRemoveAircraft() {
		// TODO Auto-generated method stub

	}

	/**
	 * !!! This action show all aircrafts, sorted by parametr
	 */
	private void actionGetSortAircraftsByParametr(Scanner consoleReader) {

		while (true) {

			try {

				System.out.println(MessagesForUserEnum.getMenuActionGetSortAircraftsByParametrMessageInString());

				String comandAction = consoleReader.nextLine();
				GetSortTypesEnum getSortType = GetSortTypesEnum.stringToEnum(comandAction);

				switch (getSortType) {
				case SORT_BY_FUEL_SPEND: {
					List<Aircraft> sortedAircraftsList = this.airlineCompanyManager
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
					List<Aircraft> sortedAircraftsList = this.airlineCompanyManager
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
					List<Aircraft> sortedAircraftsList = this.airlineCompanyManager
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
					List<Aircraft> sortedAircraftsList = this.airlineCompanyManager
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

	private void actionGetFullAircraftInforamationFromBase() {
		// TODO Auto-generated method stub

	}

	/**
	 * !!! This action show all aircrafts, which are suitable for paramert range
	 */
	private void actionGetAircraftsByParametrRange(Scanner consoleReader) {

		while (true) {

			try {

				// To check: did you create an airline company
				if (this.airlineCompanyManager.getAirlineCompany() == null) {
					throw new NoAirlineCompanyException();
				}

				// To check: if there are any aircrafts at hte airline compamy
				// park
				if (this.airlineCompanyManager.getAircraftsTotalAmount() == 0) {
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

					if (aircraftsList == null) {
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

					if (aircraftsList == null) {
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

	private void actionExitProgram() {
		// TODO Auto-generated method stub
		System.out.println("Exit the program");
		System.exit(0);
	}

	/**
	 * !!! This action create a new airline company
	 * 
	 * @param consoleReader
	 */
	private void actionCreateAirlineCompany(Scanner consoleReader) {
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
				this.airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());

				System.out.println("You created a new airline company:");
				System.out.println(this.airlineCompanyManager.getFullAirlineCompanyInformation());
				return;
			}

			case "2": {
				airlineCompanyBuilder.buildAirlineCompanyUsingOnlyAirlineCompanyName(("Lufthansa"));
				this.airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());

				System.out.println("You created a new airline company:");
				System.out.println(this.airlineCompanyManager.getFullAirlineCompanyInformation());
				return;
			}

			case "3": {
				airlineCompanyBuilder.buildAirlineCompanyUsingOnlyAirlineCompanyName(("Emirates Airlines"));
				this.airlineCompanyManager.setAirlineCompany(airlineCompanyBuilder.getResult());

				System.out.println("You created a new airline company:");
				System.out.println(this.airlineCompanyManager.getFullAirlineCompanyInformation());
				return;
			}

			default: {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				break;
			}
			}
		}
	}

	/**
	 * !!! This action calculate a total amount of airacrafts parametr
	 * 
	 * @param consoleReader
	 */
	private void actionCalculateTotalByParametr(Scanner consoleReader) {

		while (true) {
			try {

				System.out.println(MessagesForUserEnum.getMenuActionCalculateTotalByParametrMessageInString());

				String comandAction = consoleReader.nextLine();
				GetTotalParametrEnum getTotalParam = GetTotalParametrEnum.stringToEnum(comandAction);

				switch (getTotalParam) {
				case TOTAL_PEOPLE_CAPACITY: {
					System.out.println("A total people capacity of all aircrafts at the park is "
							+ this.airlineCompanyManager.getTotalAircraftsPeopleCapacity());
					return;
				}
				case TOTAL_WEIGHT_CAPACITY: {
					System.out.println("A total weight capacity of all aircrafts at the park is "
							+ this.airlineCompanyManager.getTotalAircraftsWeigthCapacity());
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

	private void actionAddNewAirecraft() {
		// TODO Auto-generated method stub
	}

}
