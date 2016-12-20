/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.Airliner;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;

/**
 * @author Дмитрий
 *
 */
public class AirlinerBuilder extends AircraftBuilder {

	public AirlinerBuilder() {
		this.aircraft = new Airliner();
	}
	
	public void setAirlinerTechData(final AirlinerTechData airlinerTechData) {
		((Airliner)aircraft).setAirlinerTechData(airlinerTechData);
	}

	public Airliner getResult() {
		return (Airliner)aircraft;
	}

}
