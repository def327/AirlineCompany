/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import java.util.ArrayList;
import java.util.List;

import by.zyablov.airlinecompany.measures.KilometerPerHour;
import by.zyablov.airlinecompany.measures.Tons;

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
		this.listAircrafts = new ArrayList<>();
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

	public void sortListAircrafts() {
		// TODO
	}

	public int getAmountOfAircraft() {
		return amountOfAircraft;
	}

	public Aircraft findAircraft(Aircraft searchAircraft) {
		// TODO by FUELCAPACITY, SPEED and FLIGTDESTINATION 
		return null;
	}

}
