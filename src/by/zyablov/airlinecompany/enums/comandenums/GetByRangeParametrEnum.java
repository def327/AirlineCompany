package by.zyablov.airlinecompany.enums.comandenums;

public enum GetByRangeParametrEnum {
	RANGE_BY_MIDDLE_VELOCITY, RANGE_BY_FUEL_SPENDING;

	public static GetByRangeParametrEnum stringToEnum(String comandString) {
		switch (comandString) {
		case "1": {
			return RANGE_BY_MIDDLE_VELOCITY;
		}
		case "2": {
			return RANGE_BY_FUEL_SPENDING;
		}
		default: {
			throw new IllegalArgumentException();
		}
		}
	}

}
