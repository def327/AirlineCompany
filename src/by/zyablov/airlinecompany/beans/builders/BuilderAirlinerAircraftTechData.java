
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * Class {@code BuilderAirlinerAircraftTechData} creates
 * {@code AirlinerTechData} object and initializes it's fields.
 * 
 * @see by.zyablov.airlinecompany.beans.techdata.AirlinerTechData
 *
 */
public class BuilderAirlinerAircraftTechData implements BuilderBehavior {

	/**
	 * A value of {@code AirlinerTechData} object to create and initialize
	 */
	private AirlinerTechData airlinerTechData;

	/**
	 * Set's an airlinerType for {@code AirlinerTechData} object
	 * 
	 * @param airlinerType
	 *            - this value represents an airliner type by distance
	 */
	public void setAirlinerType(String airlinerType) {
		airlinerTechData.setAirlinerType(airlinerType);
	}

	/**
	 * Set's have bussiness class field for {@code AirlinerTechData} object
	 * 
	 * @param havBusinesClass
	 *            - this value represents an airliner opportunity to have
	 *            bussiness class
	 */
	public void setHavBusinesClass(boolean havBusinesClass) {
		airlinerTechData.setHavBusinesClass(havBusinesClass);
	}

	/**
	 * Return's a initialized {@code AirlinerTechData} object
	 */
	public AirlinerTechData getResult() {
		return airlinerTechData;
	}

	/**
	 * Constructor.
	 * 
	 * @param airlinerTechData
	 *            - {@code AirlinerTechData} object to create and initialize
	 */
	public BuilderAirlinerAircraftTechData() {
		airlinerTechData = new AirlinerTechData();
	}
}
