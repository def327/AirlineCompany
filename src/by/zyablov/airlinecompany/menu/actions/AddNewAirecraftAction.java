package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;
import java.util.regex.Pattern;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAirlinerAircraftTechData;
import by.zyablov.airlinecompany.beans.builders.BuilderBasicTechAiracft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderCargoAircraftTechData;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.enums.aircraftenums.AirlinerTypeEnum;
import by.zyablov.airlinecompany.enums.comandsenums.GetAicraftTypeToAddEnum;
import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;
import by.zyablov.airlinecompany.tools.IdAircraftMakeManager;

public class AddNewAirecraftAction {

	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {
		while (true) {
			try {

				if (!airlineCompanyManager.haveAirlinerCompany()) {
					throw new NoAirlineCompanyException();
				}

				GetAicraftTypeToAddEnum getAicraftTypeToCreate = choseAircraftTypeToAdd(consoleReader);

				switch (getAicraftTypeToCreate) {
				case ADD_NEW_AIRLINE_AIRCRAFT: {
					addNewAircraft(consoleReader, airlineCompanyManager, new BuilderAirlinerAircraft(),
							new AirlinerTechData());
					return;
				}
				case ADD_NEW_CARGO_AIRCRAFT: {
					addNewAircraft(consoleReader, airlineCompanyManager, new BuilderCargoAircraft(),
							new CargoAircraftTechData());
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

	/**
	 * !!! This method add new aircraft for airline company park
	 * 
	 * @param airlineCompanyManager
	 * @param aircraftBuilder
	 */
	private static void addNewAircraft(Scanner consoleReader, AirlineManageSystem airlineCompanyManager,
			BuilderAircraft aircraftBuilder, UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {

		Aircraft newAircraft = createNewAircraft(consoleReader, aircraftBuilder, uniqueAircraftTechDataBehavior);
		try {
			if (!(airlineCompanyManager.addAircraft(newAircraft))) {
				System.out.println("Problems to add new aircraft to airline company park!");
				return;
			}else{
				System.out.println("You created an new aircraft with fields:" );
				System.out.println(newAircraft.getFullAircraftInformationDataToString());
			}
		} catch (NoAirlineCompanyException e) {
			System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
		}
	}

	/**
	 * !!! This method create a new aircraft for airline company park
	 * 
	 * @param airlineCompanyManager
	 * @param aircraft
	 */
	private static Aircraft createNewAircraft(Scanner consoleReader, BuilderAircraft aircraftBuilder,
			UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {

		String newAicraftName = getNameForNewAicraft(consoleReader);
		aircraftBuilder.setName(newAicraftName);
		aircraftBuilder.setId(getIdForNewAicraft(newAicraftName));
		aircraftBuilder.setBasicTechSpecificationAircraft(getBasicTechAircraftDataForNewAicraft(consoleReader));
		aircraftBuilder.setUniqueAircraftTechData(
				getUniqueAircraftTechDataBehavior(consoleReader, uniqueAircraftTechDataBehavior));

		return aircraftBuilder.getResult();
	}

	/**
	 * !!! This method return a name for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static String getNameForNewAicraft(Scanner consoleReader) {
		while (true) {
			System.out.println("Choose a name for a new aircraft(FOR EXAMPLE: TU - 563):");
			String newAicraftName = consoleReader.nextLine();

			if (Pattern.matches("[A-Z][0-9A-Za-z- ]+", newAicraftName)) {
				return newAicraftName;
			} else {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * !!! This method return an int unique id for a new aircraft
	 * 
	 * @return
	 */
	private static int getIdForNewAicraft(String aircraftName) {
		int uniqueAicraftId = IdAircraftMakeManager.getUniqueIdAircraft(aircraftName);
		return uniqueAicraftId;
	}

	/**
	 * !!! This method return a basic tech data object for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static BasicTechAircraftData getBasicTechAircraftDataForNewAicraft(Scanner consoleReader) {

		BuilderBasicTechAiracft basicTechDataBuilder = new BuilderBasicTechAiracft();

		basicTechDataBuilder.setPeopleCapacity(getPeopleCapacity(consoleReader));
		basicTechDataBuilder.setMiddleVelocity(getMiddleVelocity(consoleReader));
		basicTechDataBuilder.setFuelSpending(getFuelSpending(consoleReader));
		basicTechDataBuilder.setMaxWeigthCapacity(getMaxWeightCapacity(consoleReader));

		return basicTechDataBuilder.getResult();
	}

	/**
	 * !!! This method return an int value of people capacity for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static int getPeopleCapacity(Scanner consoleReader) {
		while (true) {

			final int minimumPeopleCapacity = 1;
			final int maximumPeopleCapacity = 2000;

			System.out.println("Choose a maximum people capacity for a new aircraft (from 1 people to 2000 people):");
			String newAicraftPeopleCapacity = consoleReader.nextLine();

			try {

				int newAicraftPeopleCapacityInInt = Integer.parseInt(newAicraftPeopleCapacity);

				if ((newAicraftPeopleCapacityInInt < minimumPeopleCapacity)
						|| (newAicraftPeopleCapacityInInt > maximumPeopleCapacity)) {
					throw new NumberFormatException();
				}
				return newAicraftPeopleCapacityInInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * !!! This method return an int value of middle velocity for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static int getMiddleVelocity(Scanner consoleReader) {
		while (true) {

			final int minimumVelocity = 100;
			final int maximumVelocity = 3000;

			System.out.println("Choose a middle velocity for a new aircraft (from 100 km/h to 3000 km/h):");
			String newAircraftMiddleVelocity = consoleReader.nextLine();

			try {

				int newAircraftMiddleVelocityInInt = Integer.parseInt(newAircraftMiddleVelocity);

				if ((newAircraftMiddleVelocityInInt < minimumVelocity)
						|| (newAircraftMiddleVelocityInInt > maximumVelocity)) {
					throw new NumberFormatException();
				}
				return newAircraftMiddleVelocityInInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * !!! This method return an int value of fuel spending for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static int getFuelSpending(Scanner consoleReader) {
		while (true) {

			final int minimumFuelSpending = 2;
			final int maximumFuelSpending = 30;

			System.out
					.println("Choose a fuel spending for a new aircraft (from 2 tons / 1000km to 30 tons / 1000km):");
			String newAircraftFuelSpending = consoleReader.nextLine();

			try {

				int newAircraftFuelSpendingInInt = Integer.parseInt(newAircraftFuelSpending);

				if ((newAircraftFuelSpendingInInt < minimumFuelSpending)
						|| (newAircraftFuelSpendingInInt > maximumFuelSpending)) {
					throw new NumberFormatException();
				}
				return newAircraftFuelSpendingInInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * !!! This method return an int value of weight capacity for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static int getMaxWeightCapacity(Scanner consoleReader) {
		while (true) {

			final int minimumWeightCapacity = 2;
			final int maximumWeightCapacity = 5000;

			System.out.println("Choose a maximum weight capacity for a new aircraft (from 2 tons to 5000 tons:");
			String newAircraftWeightCapacity = consoleReader.nextLine();

			try {

				int newAircraftWeightCapacityInInt = Integer.parseInt(newAircraftWeightCapacity);

				if ((newAircraftWeightCapacityInInt < minimumWeightCapacity)
						|| (newAircraftWeightCapacityInInt > maximumWeightCapacity)) {
					throw new NumberFormatException();
				}
				return newAircraftWeightCapacityInInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * !!! This method return an unique tech data object for a new aircraft
	 * 
	 * @param uniqueAircraftTechDataBehavior
	 * @return
	 */
	private static UniqueAircraftTechDataBehavior getUniqueAircraftTechDataBehavior(Scanner consoleReader,
			UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {

		if (uniqueAircraftTechDataBehavior instanceof AirlinerTechData) {
			return (AirlinerTechData) getAirlinerTechData(consoleReader);
		} else {
			return (CargoAircraftTechData) getCargoAircraftTechData(consoleReader);
		}
	}

	/**
	 * !!! This method return a cargo aicraft tech data object for a new
	 * aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static CargoAircraftTechData getCargoAircraftTechData(Scanner consoleReader) {

		BuilderCargoAircraftTechData newCargoAircraftTechDataBuilder = new BuilderCargoAircraftTechData();
		newCargoAircraftTechDataBuilder.setCargoDepartmentSize(getCargoDepartmentSize(consoleReader));
		newCargoAircraftTechDataBuilder.setCanTransprtDangerGoods(getCanTransportDangerGoods(consoleReader));
		return newCargoAircraftTechDataBuilder.getResult();
	}

	/**
	 * !!! This method return an int value of department size for cargo aircraft
	 * tech data object
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static int getCargoDepartmentSize(Scanner consoleReader) {
		while (true) {

			final int minimumCargoDepartmentSize = 5;
			final int maximumCargoDepartmentSize = 2000;

			System.out.println("Choose a cargo department size for a new cargo aircraft (from 5 M^3  to 2000 M^3):");
			String newAircraftCargoDepartmentSize = consoleReader.nextLine();

			try {

				int newAircraftCargoDepartmentSizeInInt = Integer.parseInt(newAircraftCargoDepartmentSize);

				if ((newAircraftCargoDepartmentSizeInInt < minimumCargoDepartmentSize)
						|| (newAircraftCargoDepartmentSizeInInt > maximumCargoDepartmentSize)) {
					throw new NumberFormatException();
				}
				return newAircraftCargoDepartmentSizeInInt;

			} catch (NumberFormatException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
		}
	}

	/**
	 * This method return a boolean value of cargo aircraft opportunity to
	 * transport danger goods for cargo aircraft tech data object
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static boolean getCanTransportDangerGoods(Scanner consoleReader) {
		while (true) {

			System.out.println("Can a new cargo aircraft transport danger goods:");
			System.out.println("--Enter '1' to allow for a new cargo aircraft transport danger goods");
			System.out.println("--Enter '2' no to allow for a new cargo aircraft transport danger goods");

			String answer = consoleReader.nextLine();

			switch (answer) {

			case "1": {
				return true;
			}

			case "2": {
				return false;
			}

			default: {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
			}
		}
	}

	/**
	 * !!! This method return a cargo aicraft tech data object for a new
	 * aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static AirlinerTechData getAirlinerTechData(Scanner consoleReader) {

		BuilderAirlinerAircraftTechData newAirlinerAircraftTechDataBuilder = new BuilderAirlinerAircraftTechData();

		newAirlinerAircraftTechDataBuilder.setAirlinerType(getAirlinerAircraftType(consoleReader));
		newAirlinerAircraftTechDataBuilder.setHavBusinesClass(getHavBusinesClass(consoleReader));

		return newAirlinerAircraftTechDataBuilder.getResult();
	}

	/**
	 * !!! This method return a airline aicraft type for airline aircraft tech data object
	 * @param consoleReader
	 * @return
	 */
	private static String getAirlinerAircraftType(Scanner consoleReader) {
		while (true) {

			try {
				System.out.println("Has a new airline aircraft bussiness class:");
				System.out.println(
						"--Enter '1' to choose a local type to transport passengers over distances up to 1000 km");
				System.out.println(
						"--Enter '2' to choose a regional type to transport passengers over distances up to 3000 km");
				System.out.println(
						"--Enter '3' to choose long-haul type to transport passengers over distances over 6000 km");
				String answer = consoleReader.nextLine();

				AirlinerTypeEnum airlineAircraftType = AirlinerTypeEnum.stringToEnum(answer);
				return airlineAircraftType.getAirlinerType();
			} catch (IllegalArgumentException e) {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}

		}
	}

	/**
	 * !!! This method return a boolean value of airline aircraft opportunity to
	 * have bussiness class for airline aircraft tech data object
	 * 
	 * @param consoleReader
	 * @return
	 */
	private static boolean getHavBusinesClass(Scanner consoleReader) {
		while (true) {

			System.out.println("Has a new airline aircraft bussiness class:");
			System.out.println("--Enter '1' have bussiness class");
			System.out.println("--Enter '2' don't bussiness class ");

			String answer = consoleReader.nextLine();

			switch (answer) {

			case "1": {
				return true;
			}

			case "2": {
				return false;
			}

			default: {
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
			}
		}
	}

}
