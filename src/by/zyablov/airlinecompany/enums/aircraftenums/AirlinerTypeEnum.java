package by.zyablov.airlinecompany.enums.aircraftenums;

public enum AirlinerTypeEnum {

	LOCAL("Local aircraft to transport passengers over distances up to 1000 km"),

	REGIONAL("Regional aircraft to transport passengers over distances up to 3000 km "),

	HAUL("Long-haul aircraft to transport passengers over distances over 6000 km;");

	private String airlinerType;

	/**
	 * 
	 * @param airlinerType
	 */
	private AirlinerTypeEnum(String airlinerType) {
		this.airlinerType = airlinerType;
	}

	/**
	 * @return the airlinerType
	 */
	public String getAirlinerType() {
		return airlinerType;
	}

	@Override
	public String toString() {
		return (this.airlinerType);
	}

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
}
