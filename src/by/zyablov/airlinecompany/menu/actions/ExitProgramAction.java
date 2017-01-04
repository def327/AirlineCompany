package by.zyablov.airlinecompany.menu.actions;

import static by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum.WARNING_MESSAGE_TRY_AGAIN;

import java.util.Scanner;

import by.zyablov.airlinecompany.enums.comandsenums.MessagesForUserEnum;
import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class ExitProgramAction {

	/**
	 * !!! This action save save all aircrafts information to file and exit the
	 * program
	 */
	public static void runAction(AirlineManageSystem airlineCompanyManager, Scanner consoleReader) {

		while (true) {
			System.out.println(MessagesForUserEnum.getMenuActionExitProgramInString());
			String answer = consoleReader.nextLine();

			switch (answer) {
			case "1": {
				
				if(airlineCompanyManager.haveAirlinerCompany()){				
				//Save aircrafts data inforamation to file
				SaveAircraftsToFileAction.runAction(airlineCompanyManager);
				}else{
					System.out.println("You didn't create a airline company, exit program without saving to file!");
				}
				closeResoursesAndExitProgram(consoleReader);
				break;
			}
			case "2": {
				closeResoursesAndExitProgram(consoleReader);
				break;
			}
			default:{
				System.out.println(WARNING_MESSAGE_TRY_AGAIN);
				continue;
			}
			}
		}
	}

	/**
	 * !!! This method close necessary reosurses and exit program
	 * 
	 * @param consoleReader
	 */
	private static void closeResoursesAndExitProgram(Scanner consoleReader) {
		System.out.println("Exit the program!");
		// Closed program resoures
		consoleReader.close();
		// Exit the program
		System.exit(0);
	}
}
