package by.zyablov.airlinecompany.enums.comandsenums;

public enum GetTotalParametrEnum {
	
	TOTAL_PEOPLE_CAPACITY,TOTAL_WEIGHT_CAPACITY;
	
	public static GetTotalParametrEnum stringToEnum(String comandString) {
		switch (comandString) {
		case "1": {
			return TOTAL_PEOPLE_CAPACITY;
		}
		case "2": {
			return TOTAL_WEIGHT_CAPACITY;
		}
		default: {
			throw new IllegalArgumentException();
		}
		}
	}

}
