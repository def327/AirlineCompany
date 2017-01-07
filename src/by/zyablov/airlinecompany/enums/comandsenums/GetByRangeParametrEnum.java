package by.zyablov.airlinecompany.enums.comandsenums;

public enum GetByRangeParametrEnum {
	RANGE_BY_MIDDLE_VELOCITY, RANGE_BY_FUEL_SPENDING;

	/**
	 * !!! this method return range by string
	 * @param comandString
	 * @return
	 */
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
