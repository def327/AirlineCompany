package by.zyablov.airlinecompany.enums.comandsenums;

public enum UserComandEnum {

	CREATE_AIRLINE_COMPANY,

	GET_FULL_INFORMATION_ABOUT_COMPANY,

	CALCULATE_TOTAL_BY_PARAMETR,

	GET_SORT_AIRCRAFT_LIST,

	GET_AICRAFT_LIST_BY_PARAMETR_RANGE,

	GET_FULL_AIRCRAFT_INFORMATION_FROM_BASE,

	ADD_NEW_AIRCRAFT,

	REMOVE_AIRCRAFT,

	SAVE_AIRCRAFTS_TO_FILE,

	READ_AICRAFTS_FROM_FILE,

	EXIT_APPLICATION;

	public static UserComandEnum stringToEnum(String comandString) {
		switch (comandString) {
		case "1": {
			return CREATE_AIRLINE_COMPANY;
		}
		case "2": {
			return CALCULATE_TOTAL_BY_PARAMETR;
		}
		case "3": {
			return GET_SORT_AIRCRAFT_LIST;
		}
		case "4": {
			return GET_AICRAFT_LIST_BY_PARAMETR_RANGE;
		}
		case "5": {
			return GET_FULL_AIRCRAFT_INFORMATION_FROM_BASE;
		}
		case "6": {
			return ADD_NEW_AIRCRAFT;
		}
		case "7": {
			return REMOVE_AIRCRAFT;
		}
		case "8": {
			return SAVE_AIRCRAFTS_TO_FILE;
		}
		case "9": {
			return READ_AICRAFTS_FROM_FILE;
		}
		case "10": {
			return GET_FULL_INFORMATION_ABOUT_COMPANY;
		}
		case "11": {
			return EXIT_APPLICATION;
		}
		default: {
			throw new IllegalArgumentException();
		}
		}
	}

}
