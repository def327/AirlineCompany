package by.zyablov.airlinecompany.enums.comandsenums;

public enum GetAicraftTypeToAddEnum {
	
	ADD_NEW_AIRLINE_AIRCRAFT, ADD_NEW_CARGO_AIRCRAFT;

	public static GetAicraftTypeToAddEnum stringToEnum(String comandString) {
		switch (comandString) {
		case "1": {
			return ADD_NEW_AIRLINE_AIRCRAFT;
		}
		case "2": {
			return ADD_NEW_CARGO_AIRCRAFT;
		}
		default: {
			throw new IllegalArgumentException();
		}
		}
	}
}
