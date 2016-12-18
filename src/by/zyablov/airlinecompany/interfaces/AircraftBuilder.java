/**
 * 
 */
package by.zyablov.airlinecompany.interfaces;

import by.zyablov.airlinecompany.beans.Aircraft;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public interface AircraftBuilder {
	
	void setId(final int id);

	void setName(final String name);
	
	void setTechSpecificationAircraft(final TechSpecificationAircraft specification);
	
    Aircraft getResult();
	
}
