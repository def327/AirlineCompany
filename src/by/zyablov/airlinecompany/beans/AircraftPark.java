/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.LinkedList;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;

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
	
	@Override
	public String toString() {
		return "amountOfAircraft" + this.amountOfAircraft;
	}

}
