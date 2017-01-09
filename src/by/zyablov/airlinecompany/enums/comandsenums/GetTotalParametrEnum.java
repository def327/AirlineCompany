package by.zyablov.airlinecompany.enums.comandsenums;

/**
 * Enum {@code GetTotalParametrEnum} represents a comand for
 * {@code CalculateTotalByParametrAction} class to choose a type field to
 * calculate a summary of this field of each {@code Aircraft} objects.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.menu.actions.CalculateTotalByParametrAction
 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
 * @see by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft
 * @see by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft
 * 
 */
public enum GetTotalParametrEnum {

	TOTAL_PEOPLE_CAPACITY, TOTAL_WEIGHT_CAPACITY;

	/**
	 * Returns a type of enum to choose a parametr and to calculate a summary.
	 * 
	 * @param comandString
	 *            - a comand in String type to choose a type of parametr to
	 *            calculate summary.
	 * 
	 * @return {@code GetTotalParametrEnum} to choose a type of parametr to
	 *         calculate summary.
	 */
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
