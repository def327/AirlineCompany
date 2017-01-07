/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators;

import java.util.Comparator;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;

/**
 * @author Дмитрий
 *
 */
public class AircraftComparatorByFuelSpending implements Comparator<Object> {

	/**
	 * !!! This method originaly compare aricrafts by their fuel spending
	 */
	@Override
	public int compare(Object o1, Object o2) {
		Aircraft oneObj = (Aircraft) o1;
		Aircraft twoObj = (Aircraft) o2;

		FuelSpendTonPerKm oneObjFuelSpending = (FuelSpendTonPerKm) oneObj.getBasicTechAircraftData().getFuelSpending();
		FuelSpendTonPerKm twoObjFuelSpending = (FuelSpendTonPerKm) twoObj.getBasicTechAircraftData().getFuelSpending();

		return (oneObjFuelSpending.compareTo(twoObjFuelSpending));
	}

}
