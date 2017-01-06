package by.zyablov.airlinecompany.menu.aircraftsconsolecreators;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;
import java.util.regex.Pattern;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderAircraft;
import by.zyablov.airlinecompany.beans.builders.BuilderBasicTechAiracft;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.interfaces.NewAircraftConsoleCreatorBehavior;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;
import by.zyablov.airlinecompany.tools.IdAircraftMakeManager;

public abstract class NewAircraftConsoleCreator implements NewAircraftConsoleCreatorBehavior {

	/**
	 * !!! This method add new aircraft for airline company park
	 * 
	 * @param airlineCompanyManager
	 * @param aircraftBuilder
	 */
	public void addAndCreateNewAircraft(Scanner consoleReader, AirlineManageSystem airlineCompanyManager,
			BuilderAircraft aircraftBuilder) {

		Aircraft newAircraft = createNewAircraft(consoleReader, aircraftBuilder);

		try {
			if (!(airlineCompanyManager.addAircraft(newAircraft))) {
				System.out.println("Problems to add new aircraft to airline company park!");
				return;
			} else {
				System.out.println("You created an new aircraft with fields:");
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
	private Aircraft createNewAircraft(Scanner consoleReader, BuilderAircraft aircraftBuilder) {

		String newAicraftName = getNameForNewAicraft(consoleReader);
		aircraftBuilder.setName(newAicraftName);
		aircraftBuilder.setId(getIdForNewAicraft(newAicraftName));
		aircraftBuilder.setBasicTechSpecificationAircraft(getBasicTechAircraftDataForNewAicraft(consoleReader));

		aircraftBuilder.setUniqueAircraftTechData(getUniqueAircraftTechDataBehavior(consoleReader));

		return aircraftBuilder.getResult();
	}

	/**
	 * !!! This method return a name for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private String getNameForNewAicraft(Scanner consoleReader) {
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
	private int getIdForNewAicraft(String aircraftName) {
		int uniqueAicraftId = IdAircraftMakeManager.getUniqueIdAircraft(aircraftName);
		return uniqueAicraftId;
	}

	/**
	 * !!! This method return a basic tech data object for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	private BasicTechAircraftData getBasicTechAircraftDataForNewAicraft(Scanner consoleReader) {

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
	private int getPeopleCapacity(Scanner consoleReader) {
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
	private int getMiddleVelocity(Scanner consoleReader) {
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
	private int getFuelSpending(Scanner consoleReader) {
		while (true) {

			final int minimumFuelSpending = 2;
			final int maximumFuelSpending = 30;

			System.out.println("Choose a fuel spending for a new aircraft (from 2 tons / 1000km to 30 tons / 1000km):");
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
	private int getMaxWeightCapacity(Scanner consoleReader) {
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
	 * !!! This method an unique tech data object for a new aircraft
	 * 
	 * @param consoleReader
	 * @return
	 */
	protected abstract UniqueAircraftTechDataBehavior getUniqueAircraftTechDataBehavior(Scanner consoleReader);

}
