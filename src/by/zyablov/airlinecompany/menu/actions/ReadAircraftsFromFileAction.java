package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_NEED_AIRLINE_COMPANY;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_PROBLEM_EMPTY_AIRCRAFT_FILE;
import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE;

import java.io.FileNotFoundException;
import java.io.IOException;

import by.zyablov.airlinecompany.exeptions.EmptyAircraftsFileException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class ReadAircraftsFromFileAction {
	
	public  static boolean loadAicraftsFromFile = false;
	
	/**
	 * !!! method action read data information about aircrafts from file
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager){
		try {
			
			if(loadAicraftsFromFile){
				System.out.println("You loaded all information about aircrafts from data file yet!");
				return;
			}
			
			airlineCompanyManager.readAircraftsFromFile();
			System.out.println("Loaded information about aircrafts from data file");
			loadAicraftsFromFile = true;
			
		} catch (NoAirlineCompanyException e) {
			System.out.println(WARNING_MESSAGE_NEED_AIRLINE_COMPANY);
		} catch (EmptyAircraftsFileException e) {
			System.out.println(WARNING_MESSAGE_PROBLEM_EMPTY_AIRCRAFT_FILE);
		} catch (FileNotFoundException e) {
			System.out.println(WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE);
		} catch (ClassNotFoundException e) {
			System.out.println(WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE);
		} catch (IOException e) {
			System.out.println(WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE);
		}
	}

}
