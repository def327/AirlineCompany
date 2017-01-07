/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class BuilderAirlinerAircraftTechData implements BuilderBehavior {

	private AirlinerTechData airlinerTechData;

	public void setAirlinerType(String airlinerType) {
		airlinerTechData.setAirlinerType(airlinerType);
	}

	public void setHavBusinesClass(boolean havBusinesClass) {
		airlinerTechData.setHavBusinesClass(havBusinesClass);
	}

	public AirlinerTechData getResult() {
		return airlinerTechData;
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public BuilderAirlinerAircraftTechData() {
		airlinerTechData = new AirlinerTechData();
	}
}
