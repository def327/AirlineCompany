/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * @author Дмитрий
 *
 */
public class BuilderAirlinerAircraft extends BuilderAircraft {

	public BuilderAirlinerAircraft() {
		this.aircraft = new AirlinerAircraft();
	}
	
//  Roll back if have problem with cast during RUN-TIME	
//	public void setAirlinerTechData(final AirlinerTechData airlinerTechData) {
//		((Airliner)aircraft).setAirlinerTechData(airlinerTechData);
//	}

	public AirlinerAircraft getResult() {
		return (AirlinerAircraft)aircraft;
	}

	@Override
	public void setUniqueAircraftTechData(UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {
		((AirlinerAircraft)aircraft).setAirlinerTechData((AirlinerTechData)uniqueAircraftTechDataBehavior);		
	}

}
