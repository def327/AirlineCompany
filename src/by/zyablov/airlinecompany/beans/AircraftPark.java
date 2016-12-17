/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Дмитрий
 *
 */
public class AircraftPark {
	private List<Aircraft> listAircrafts;
	private int amountOfAircraft;

	/**
	 * @param listAircrafts
	 * @param amountOfAircraft
	 */
	public AircraftPark() {
		this.listAircrafts = new LinkedList<>();
		this.amountOfAircraft = 0;
	}

	public boolean addAirCraft(Aircraft newAircraft) {

		if (listAircrafts.add(newAircraft)) {
			amountOfAircraft++;
			return true;
		} else {
			return false;
		}
	}

	public boolean removeAircraft(Aircraft removingAircraft) {
		if (listAircrafts.remove(removingAircraft)) {
			amountOfAircraft--;
			return true;
		} else {
			return false;
		}
	}

	public int getAmountOfAircraft() {
		return amountOfAircraft;
	}

	public List<Aircraft> getListOfAircrafts() {
		return listAircrafts;
	}

	// *добавить в другой класс который будет искать*
	//
	//
	// public List<Aircraft> findAircraftByFuelSpend(int FuelSpending) {
	//
	// FuelSpendTonPerKm compareValue = new FuelSpendTonPerKm(FuelSpending);
	// List<Aircraft> findListAircraft = new LinkedList<>();
	//
	// for (Iterator<Aircraft> iterator = listAircrafts.iterator();
	// iterator.hasNext();) {
	//
	// Aircraft aircraft = (Aircraft) iterator.next();
	//
	// if (compareValue.equals(aircraft.getSpecification().getFuelSpending())) {
	// findListAircraft.add(aircraft);
	// }
	//
	// }
	//
	// return findListAircraft;
	// }
	
	//	public void sortListAircrafts() {
	//	// TODO
	//}

}
