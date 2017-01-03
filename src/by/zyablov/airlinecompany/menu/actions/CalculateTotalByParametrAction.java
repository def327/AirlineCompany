package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_EMPTY_PARK;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;

import by.zyablov.airlinecompany.enums.comandenums.GetTotalParametrEnum;
import by.zyablov.airlinecompany.enums.comandenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class CalculateTotalByParametrAction {
	
	
	/**
	 * !!! This action calculate a total amount of airacrafts parametr
	 * 
	 * @param consoleReader
	 */
	public static void run(AirlineManageSystem airlineCompanyManager, Scanner consoleReader){
		
		while (true) {
			try {

				System.out.println(MessagesForUserEnum.getMenuActionCalculateTotalByParametrMessageInString());

				String comandAction = consoleReader.nextLine();
				GetTotalParametrEnum getTotalParam = GetTotalParametrEnum.stringToEnum(comandAction);

				switch (getTotalParam) {
				case TOTAL_PEOPLE_CAPACITY: {
					System.out.println("A total people capacity of all aircrafts at the park is "
							+ airlineCompanyManager.getTotalAircraftsPeopleCapacity());
					return;
				}
				case TOTAL_WEIGHT_CAPACITY: {
					System.out.println("A total weight capacity of all aircrafts at the park is "
							+ airlineCompanyManager.getTotalAircraftsWeigthCapacity());
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

}
