/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.Airliner;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * @author Дмитрий
 *
 */
public class BuilderAirliner extends BuilderAircraft {

	public BuilderAirliner() {
		this.aircraft = new Airliner();
	}
	
//  Roll back if have problem with cast during RUN-TIME	
//	public void setAirlinerTechData(final AirlinerTechData airlinerTechData) {
//		((Airliner)aircraft).setAirlinerTechData(airlinerTechData);
//	}

	public Airliner getResult() {
		return (Airliner)aircraft;
	}

	@Override
	public void setUniqueAircraftTechData(UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {
		((Airliner)aircraft).setAirlinerTechData((AirlinerTechData)uniqueAircraftTechDataBehavior);		
	}

}
