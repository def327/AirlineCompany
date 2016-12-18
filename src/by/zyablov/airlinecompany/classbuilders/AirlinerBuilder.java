/**
 * 
 */
package by.zyablov.airlinecompany.classbuilders;

import by.zyablov.airlinecompany.beans.*;
import by.zyablov.airlinecompany.interfaces.AircraftBuilder;
import by.zyablov.airlinecompany.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class AirlinerBuilder implements AircraftBuilder {

	private Airliner aircraft;

	public AirlinerBuilder() {
		aircraft = new Airliner();
	}
	
	public void setAirlinerTechData(final AirlinerTechData airlinerTechData) {
		aircraft.setAirlinerTechData(airlinerTechData);
	}

	@Override
	public void setId(final int id) {
		aircraft.setId(id);
	}

	@Override
	public void setName(final String name) {
		aircraft.setName(name);

	}

	@Override
	public void setTechSpecificationAircraft(final TechSpecificationAircraft specification) {
		aircraft.setSpecification(specification);
	}

	@Override
	public Airliner getResult() {
		return aircraft;
	}

}
