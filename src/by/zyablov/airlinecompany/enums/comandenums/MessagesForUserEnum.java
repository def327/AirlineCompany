package by.zyablov.airlinecompany.enums.comandenums;

public enum MessagesForUserEnum {

	// ----Warnings messages
	WARNING_MESSAGE_TRY_AGAIN("Try again!"),

	WARNING_MESSAGE_EMPTY_PARK("The aircraft park of airline company is empty!"),

	WARNING_MESSAGE_NEED_AIRLINE_COMPANY("At first create an airline company!"),

	WARNING_MESSAGE_NO_SUITABLE_AIRCRAFTS(
			"There aren't any aircrafts at the park, which are suitable for search query!"),

	WARNING_MESSAGE_PROBLEM_WRITE_OR_READ_FILE(
			"There are some problems with writing/reading data to/from a file, please wait for a new version of program with fix bugs)))"),

	WARNING_MESSAGE_PROBLEM_EMPTY_AIRCRAFT_FILE("There are no aircrafts at the file! File is empty!"),

	// ----Main menu actions messages
	MESSAGE_CREATE_AIRLINE_COMPANY("----Enter '1' to create airline new airline company:"),

	MESSAGE_CALCULATE_TOTAL_BY_PARAMETR(
			"----Enter '2' to calculate a total parametr of all aircrafts at the airline company park:"),

	MESSAGE_GET_SORT_AIRCRAFT_LIST("----Enter '3' to show aircrafts, which will be sorted by selected parametr:"),

	MESSAGE_GET_AICRAFT_LIST_BY_PARAMETR_RANGE(
			"----Enter '4' to show all aircrafts with suitable parameters, which are included in the range:"),

	MESSAGE_GET_FULL_AIRCRAFT_INFORMATION_FROM_BASE(
			"----Enter '5' to get full information about aircraft from the airliner company park:"),

	MESSAGE_ADD_NEW_AIRCRAFT("----Enter '6' to create and add a new aircraft to airliner company park:"),

	MESSAGE_REMOVE_AIRCRAFT("----Enter '7' to remove a suitable aircraft from the airliner company park:"),

	MESSAGE_SAVE_AIRCRAFTS_TO_FILE("----Enter '8' to save aircrafts information to data file:"),

	MESSAGE_READ_AICRAFTS_FROM_FILE("----Enter '9' to get aircrafts information from data file:"),

	MESSAGE_GET_FULL_INFORMATION_ABOUT_COMPANY("----Enter '10' to get full data information about airline company:"),

	MESSAGE_EXIT_APPLICATION("----Enter '11' to exit the application:"),

	// ---Special messages for action CALCULATE_TOTAL_BY_PARAMETR
	MESSAGE_CHOSE_TOTAL_PEOPLE_CAPACITY(
			"---Enter '1' to calculate a total people capacity of all aircrafts at the airline company park:"),

	MESSAGE_CHOSE_TOTAL_WEIGHT_CAPACITY(
			"---Enter '2' to calculate a total weight capacity of all aircrafts at the airline company park:"),

	// ---Special messages for action GET_SORT_AIRCRAFT_LIST
	MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_MIDDLE_VELOCITY(
			"---Enter '1' to show all aircrafts sorted by their middle velocity:"),

	MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_FUEL_SPEND(
			"---Enter '2' to show all aircrafts sorted by their fuel spending: "),

	MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_WEIGHT_CAPACITY(
			"---Enter '3' to show all aircrafts sorted by their maximum weight capacity:"),

	MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_PEOPLE_CAPACITY(
			"---Enter '4' to show all aircrafts sorted by their maximum people capacity:"),

	// ---Special messages for action GET_AICRAFT_LIST_BY_PARAMETR_RANGE
	MESSAGE_CHOSE_GET_AIRCRATFS_RANGE_BY_MIDDLE_VELOCITY(
			"---Enter '1' to show all aircrafts, which have a suitable middle velocity:"),

	MESSAGE_CHOSE_GET_AIRCRATFS_RANGE_BY_FUEL_SPENDING(
			"---Enter '2' to show all aircrafts, which have a suitable fuel spending:");

	private String message;

	/**
	 * @param message
	 */
	private MessagesForUserEnum(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}

	public static String getMainMenuActionsMessageInString() {

		String message = new String("----------------------------------------------------------" + "\n"
				+ MESSAGE_CREATE_AIRLINE_COMPANY + "\n" + MESSAGE_CALCULATE_TOTAL_BY_PARAMETR + "\n"

				+ MESSAGE_GET_SORT_AIRCRAFT_LIST + "\n"

				+ MESSAGE_GET_AICRAFT_LIST_BY_PARAMETR_RANGE + "\n"

				+ MESSAGE_GET_FULL_AIRCRAFT_INFORMATION_FROM_BASE + "\n"

				+ MESSAGE_ADD_NEW_AIRCRAFT + "\n"

				+ MESSAGE_REMOVE_AIRCRAFT + "\n"

				+ MESSAGE_SAVE_AIRCRAFTS_TO_FILE + "\n"
				
				+ MESSAGE_READ_AICRAFTS_FROM_FILE + "\n"

				+ MESSAGE_GET_FULL_INFORMATION_ABOUT_COMPANY + "\n"

				+ MESSAGE_EXIT_APPLICATION + "\n" + "----------------------------------------------------------");
		return message;
	}

	public static String getMenuActionGetSortAircraftsByParametrMessageInString() {
		String message = new String("----------------------------------------------------------" + "\n"
				+ MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_MIDDLE_VELOCITY + "\n"
				+ MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_FUEL_SPEND + "\n"
				+ MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_WEIGHT_CAPACITY + "\n"
				+ MESSAGE_CHOSE_GET_AIRCRAFTS_SORT_BY_PEOPLE_CAPACITY + "\n"
				+ "----------------------------------------------------------");
		return message;
	}

	public static String getMenuActionCalculateTotalByParametrMessageInString() {
		String message = new String("----------------------------------------------------------" + "\n"
				+ MESSAGE_CHOSE_TOTAL_PEOPLE_CAPACITY + "\n" + MESSAGE_CHOSE_TOTAL_WEIGHT_CAPACITY + "\n"
				+ "----------------------------------------------------------");
		return message;
	}

	public static String getMenuActionGetAircraftsByParametrRangeMessageInString() {
		String message = new String("----------------------------------------------------------" + "\n"
				+ MESSAGE_CHOSE_GET_AIRCRATFS_RANGE_BY_MIDDLE_VELOCITY + "\n"
				+ MESSAGE_CHOSE_GET_AIRCRATFS_RANGE_BY_FUEL_SPENDING + "\n"
				+ "----------------------------------------------------------");
		return message;
	}
}
