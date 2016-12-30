/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators;

import java.util.Comparator;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;

/**
 * @author Дмитрий
 *
 */
public class AircraftComparatorByPeopleCapacity implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {

		Aircraft oneObj = (Aircraft) o1;
		Aircraft twoObj = (Aircraft) o2;

		PeopleCapacity oneObjPeopleCapacity = (PeopleCapacity) oneObj.getBasicTechAircraftData().getPeopleCapacity();
		PeopleCapacity twoObjPeopleCapacity = (PeopleCapacity) twoObj.getBasicTechAircraftData().getPeopleCapacity();

		return (oneObjPeopleCapacity.compareTo(twoObjPeopleCapacity));
	}

}
