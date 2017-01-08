
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft;
import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * Class {@code BuilderAirlinerAircraft} creates {@code AirlinerAircraft} object
 * and initializes it's fields.
 * 
 * @see by.zyablov.airlinecompany.beans.aircrafts.AirlinerAircraft
 *
 */
public class BuilderAirlinerAircraft extends BuilderAircraft {

	/**
	 * Return's a initialized {@code AirlinerAircraft} object
	 */
	public AirlinerAircraft getResult() {
		return (AirlinerAircraft) aircraft;
	}

	/**
	 * Set's a unique techinal characteristic for {@code AirlinerAircraft}
	 * object
	 * 
	 * @param uniqueAircraftTechDataBehavior
	 *            - an unique airliner technical characteristic
	 */
	@Override
	public void setUniqueAircraftTechData(UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {
		((AirlinerAircraft) aircraft).setAirlinerTechData((AirlinerTechData) uniqueAircraftTechDataBehavior);
	}

	/**
	 * Constructor.
	 * 
	 * @param aircraft
	 *            - {@code AirlinerAircraft} object to create and initialize
	 */
	public BuilderAirlinerAircraft() {
		this.aircraft = new AirlinerAircraft();
	}
}
