/**
 * 
 */
package by.zyablov.airlinecompany.interfaces;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 * @author Дмитрий
 *
 */
public interface AircraftBuilderBehavior extends BuilderBehavior {
	
	void setId(final int id);

	void setName(final String name);
	
	void setBasicTechSpecificationAircraft(final BasicTechAircraftData specification);
	
	void setUniqueAircraftTechData(final UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior);
	
    Aircraft getResult();
	
}
