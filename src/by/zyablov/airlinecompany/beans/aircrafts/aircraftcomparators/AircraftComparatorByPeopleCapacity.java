
package by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators;

import java.util.Comparator;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;

/**
 * Compares {@code Aircraft} objects by their {@code PeopleCapacity}
 * maxPeopleCapacity field from {@code BasicTechAircraftData}
 * basicTechAircraftData field of {@code Aircraft}.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 *
 */
public class AircraftComparatorByPeopleCapacity implements Comparator<Object> {

	/**
	 * Compares {@code Aircraft} objects by their {@code PeopleCapacity}
	 * maxPeopleCapacity field from {@code BasicTechAircraftData} field of
	 * {@code Aircraft}.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * 
	 * @return the value {@code 0} if the argument obj is equal to this
	 *         {@code Aircraft} object; a value less than {@code 0} if this
	 *         {@code Aircraft} object is less than the obj argument; and a
	 *         value greater than {@code 0} if this {@code Aircraft} object is
	 *         greater than the obj argument.
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Aircraft oneObj = (Aircraft) o1;
		Aircraft twoObj = (Aircraft) o2;

		PeopleCapacity oneObjPeopleCapacity = (PeopleCapacity) oneObj.getBasicTechAircraftData().getMaxPeopleCapacity();
		PeopleCapacity twoObjPeopleCapacity = (PeopleCapacity) twoObj.getBasicTechAircraftData().getMaxPeopleCapacity();

		return (oneObjPeopleCapacity.compareTo(twoObjPeopleCapacity));
	}

}
