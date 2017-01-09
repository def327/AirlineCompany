package by.zyablov.airlinecompany.enums.comandsenums;

/**
 * Enum {@code GetAicraftTypeToAddEnum} represents a comand for
 * {@code AddNewAirecraftAction} class to choose what type of {@code Aircraft}
 * to create.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.menu.actions.AddNewAirecraftAction
 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
 * @see by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft
 * @see by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft
 * 
 */
public enum GetAicraftTypeToAddEnum {

	ADD_NEW_AIRLINE_AIRCRAFT, ADD_NEW_CARGO_AIRCRAFT;

	/**
	 * Returns a type of enum to create a new {@code Aircraft} object according
	 * to string argument.
	 * 
	 * @param comandString
	 *            - a comand in String type to choose a type of {@code Aircraft}
	 *            object to create.
	 * @return {@code GetAicraftTypeToAddEnum} type for {@code Aircraft} object
	 *         to create.
	 */
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
