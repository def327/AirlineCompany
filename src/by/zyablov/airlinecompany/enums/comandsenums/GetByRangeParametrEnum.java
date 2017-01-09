package by.zyablov.airlinecompany.enums.comandsenums;

/**
 * Enum {@code GetByRangeParametrEnum} represents a comand for
 * {@code GetAircraftsByParametrRangeAction} class to choose a type of parametr
 * to range {@code Aircraft} objects by a middle velocity or a fuel spending.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.menu.actions.GetAircraftsByParametrRangeAction
 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
 * 
 */
public enum GetByRangeParametrEnum {
	RANGE_BY_MIDDLE_VELOCITY, RANGE_BY_FUEL_SPENDING;

	/**
	 * Returns a type of enum to choose a type of parametr to range
	 * {@code Aircraft} objects object according to string argument.
	 * 
	 * @param comandString
	 *            - a comand in String type to choose a type of range's
	 *            parametr.
	 * 
	 * @return {@code GetByRangeParametrEnum} type for range's parametr.
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
