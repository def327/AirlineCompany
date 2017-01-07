/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.*;
import by.zyablov.airlinecompany.beans.techdata.*;
import by.zyablov.airlinecompany.interfaces.AircraftBuilderBehavior;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * @author Дмитрий
 *
 */
public abstract class BuilderAircraft implements AircraftBuilderBehavior {

	protected Aircraft aircraft;

	public void setId(final int idAircraft) {
		this.aircraft.setIdAircraft(idAircraft);
	}

	public void setName(final String nameAircraft) {
		this.aircraft.setNameAircraft(nameAircraft);
	}

	public void setBasicTechSpecificationAircraft(final BasicTechAircraftData basicTechAircraftData) {
		this.aircraft.setBasicTechAircraftData(basicTechAircraftData);
	}

	public abstract void setUniqueAircraftTechData(final UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior);

	public abstract Aircraft getResult();

}
