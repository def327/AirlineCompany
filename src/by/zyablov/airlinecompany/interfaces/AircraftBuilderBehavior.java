
package by.zyablov.airlinecompany.interfaces;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 * Interface {@code AircraftBuilderBehavior} creates and initializes fields of
 * {@code Aircraft} objects.
 * 
 * @author Дмитрий
 *
 */
public interface AircraftBuilderBehavior extends BuilderBehavior {

	void setId(final int id);

	void setName(final String name);

	void setBasicTechSpecificationAircraft(final BasicTechAircraftData specification);

	void setUniqueAircraftTechData(final UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior);

	/**
	 * Returns a created {@code Aircraft} object.
	 * 
	 * @return a created {@code Aircraft} object with initialized fields.
	 */
	Aircraft getResult();

}
