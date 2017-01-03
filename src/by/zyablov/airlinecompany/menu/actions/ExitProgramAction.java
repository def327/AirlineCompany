package by.zyablov.airlinecompany.menu.actions;

import java.util.Scanner;

import by.zyablov.airlinecompany.tools.AirlineManageSystem;

public class ExitProgramAction {
	
	
	/**
	 * !!! This action save save all aircrafts information to file and exit the
	 * program
	 */
	public static void run(AirlineManageSystem airlineCompanyManager, Scanner consoleReader){
		
		/**
		 *  !!! FIX BUG SAVE TO FILE BEFORE EXIT !!!
		 */
		
		// Closed program resoures
		consoleReader.close();
		
		System.out.println("Exit the program!");

		// Exit the program
		System.exit(0);
		
	}

}
