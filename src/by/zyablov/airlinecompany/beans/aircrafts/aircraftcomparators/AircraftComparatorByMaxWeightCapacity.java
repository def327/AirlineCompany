/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators;

import java.util.Comparator;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class AircraftComparatorByMaxWeightCapacity implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Aircraft oneObj = (Aircraft) o1;
		Aircraft twoObj = (Aircraft) o2;
		
		Tons oneObjMaxWeightCapacity = (Tons) oneObj.getBasicTechAircraftData().getMaxWeigthCapacity();
		Tons twoObjMaxWeightCapacity = (Tons) twoObj.getBasicTechAircraftData().getMaxWeigthCapacity();
		
		return (oneObjMaxWeightCapacity.compareTo(twoObjMaxWeightCapacity));
	}

}
