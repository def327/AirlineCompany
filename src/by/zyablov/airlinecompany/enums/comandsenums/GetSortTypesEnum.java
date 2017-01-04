package by.zyablov.airlinecompany.enums.comandsenums;

public enum GetSortTypesEnum {

	SORT_BY_MIDDLE_VELOCITY, SORT_BY_FUEL_SPEND, SORT_BY_WEIGHT_CAPACITY, SORT_BY_PEOPLE_CAPACITY;

	public static GetSortTypesEnum stringToEnum(String comandString) {
		switch (comandString) {
		case "1": {
			return SORT_BY_MIDDLE_VELOCITY;
		}
		case "2": {
			return SORT_BY_FUEL_SPEND;
		}
		case "3": {
			return SORT_BY_WEIGHT_CAPACITY;
		}
		case "4": {
			return SORT_BY_PEOPLE_CAPACITY;
		}
		default: {
			throw new IllegalArgumentException();
		}
		}
	}
}