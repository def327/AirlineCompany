package by.zyablov.airlinecompany.enums.aircraftenums;

/**
 * Enum {@code AirlinerTypeEnum} represents an airliner aircraft type depending
 * on the flight distance for {@code AirlinerTechData} objects.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.beans.techdata.AirlinerTechData
 * 
 */
public enum AirlinerTypeEnum {

	LOCAL("Local aircraft to transport passengers over distances up to 1000 km"),

	REGIONAL("Regional aircraft to transport passengers over distances up to 3000 km"),

	HAUL("Long-haul aircraft to transport passengers over distances over 6000 km");

	/**
	 * This field is a String value of airliner aircraft type depending on the
	 * flight distance.
	 */
	private String airlinerType;

	/**
	 * Returns a type of airliner aircraft according to string argument.
	 * 
	 * @param comandString
	 *            - a comand in String type to choose a type of airliner
	 *            aircraft
	 * @return {@code AirlinerTypeEnum} type for {@code AirlinerTechData}
	 *         object.
	 * 
	 * @see by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft
	 * @see by.zyablov.airlinecompany.beans.techdata.AirlinerTechData
	 * 
	 */
	public static AirlinerTypeEnum stringToEnum(String comandString) {
		switch (comandString) {
		case "1": {
			return LOCAL;
		}
		case "2": {
			return REGIONAL;
		}
		case "3": {
			return HAUL;
		}
		default: {
			throw new IllegalArgumentException();
		}
		}
	}

	/**
	 * Constructor.
	 * 
	 * @param airlinerType
	 *            - a String value of airliner aircraft type depending on the
	 *            flight distance.
	 */
	private AirlinerTypeEnum(String airlinerType) {
		this.airlinerType = airlinerType;
	}

	public String getAirlinerType() {
		return airlinerType;
	}

	/**
	 * Returns a string representation of {@code AirlinerTypeEnum}.
	 * 
	 * @return a string, which is consisted of <i>airlinerType</i> field of
	 *         {@code AirlinerTypeEnum}.
	 */
	@Override
	public String toString() {
		return (this.airlinerType);
	}

}
