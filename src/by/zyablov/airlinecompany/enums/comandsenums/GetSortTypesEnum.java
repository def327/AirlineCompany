package by.zyablov.airlinecompany.enums.comandsenums;

/**
 * Enum {@code GetSortTypesEnum} represents a comand for
 * {@code GetSortAircraftsByParametrAction} class to choose a type of sorting
 * for {@code Aircraft} object's.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.menu.actions.GetSortTypesEnum
 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
 * @see by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft
 * @see by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft
 * 
 */
public enum GetSortTypesEnum {

	SORT_BY_MIDDLE_VELOCITY, SORT_BY_FUEL_SPEND, SORT_BY_WEIGHT_CAPACITY, SORT_BY_PEOPLE_CAPACITY;

	/**
	 * Returns a type of enum to sort {@code Aircraft} objects according to
	 * string argument.
	 * 
	 * @param comandString
	 *            - a comand in String type to choose a type of sorting
	 *            {@code Aircraft} objects.
	 * 
	 * @return {@code GetSortTypesEnum} type for {@code Aircraft} objects to
	 *         sort.
	 */
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