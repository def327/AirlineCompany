/**
 * 
 */
package by.zyablov.airlinecompany.beans.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import by.zyablov.airlinecompany.beans.AircraftPark;
import by.zyablov.airlinecompany.beans.aircraftcomparators.AircraftComparatorByFuelSpending;
import by.zyablov.airlinecompany.beans.aircraftcomparators.AircraftComparatorByMaxWeightCapacity;
import by.zyablov.airlinecompany.beans.aircraftcomparators.AircraftComparatorByPeopleCapacity;
import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class AirlineCompany extends Company {

	private AircraftPark aircraftPark;

	/**
	 * @param id
	 * @param name
	 * @param email
	 * @param today
	 * @param aircraftPark
	 */
	public AirlineCompany(int id, String name, String email, GregorianCalendar today, AircraftPark aircraftPark) {
		super(id, name, email, today);
		this.aircraftPark = aircraftPark;
	}

	/**
	 * 
	 */
	public AirlineCompany() {
		super();
		this.aircraftPark = new AircraftPark();
	}

	/**
	 * !!! This method @return true if new aircraft will be added to park
	 * successfully else @return false
	 */
	public boolean addAircraftToPark(Aircraft newAircraft) {
		return this.aircraftPark.addAirCraft(newAircraft);
	}

	/**
	 * !!! This method @return true if new aircraft will be removed to park
	 * successfully else @return false
	 */
	public boolean removeAircraftFromPark(Aircraft removingAircraft) {
		return (this.aircraftPark.removeAircraft(removingAircraft));
	}

	/**
	 * !!! This method calculate amount of all aircraft's people capacity
	 * 
	 */
	public PeopleCapacity getTotalAircraftsPeopleCapacity() {
		return (this.aircraftPark.getTotalAmountPeopleCapacity());
	}

	/**
	 * !!! This method calculate amount of all aircraft's maxWeightCapacity
	 * 
	 */
	public Tons getTotalAircraftsWeightCapacity() {
		return (this.aircraftPark.getTotalAmountWeigthCapacity());
	}

	/**
	 * !!! This method return a total amount of all aircrafts at the aircraft
	 * park
	 * 
	 */
	public int getTotalAmountOfAircraft() {
		return (this.aircraftPark.getTotalAmountOfAircraft());
	}

	/**
	 * !!! This method return a sort list of aicrafts by their middle velocity
	 * 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftsByMidVelocity() {

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft);
		return listOfAircraft;
	}

	/**
	 * !!! This method return a sort list of aicrafts by their people capacity
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByPeopleCapacity() {

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByPeopleCapacity());
		return listOfAircraft;
	}

	/**
	 * !!! This method return a sort list of aicrafts by their fuel spending
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByFuelSpending() {

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByFuelSpending());
		return listOfAircraft;
	}

	/**
	 * !!! This method return a sort list of aircrafts by their maximum fuel
	 * spending
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByMaxWeightCapacity() {

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByMaxWeightCapacity());
		return listOfAircraft;
	}

	/**
	 * @return the aircraftPark
	 */
	public AircraftPark getAircraftPark() {
		return this.aircraftPark;
	}

	/**
	 * @param aircraftPark
	 *            the aircraftPark to set
	 */
	public void setAircraftPark(AircraftPark aircraftPark) {
		this.aircraftPark = aircraftPark;
	}

	@Override
	public String toString() {
		return (super.toString() + "\n" + aircraftPark.toString());
	}

	/**
	 * !!! This method return a list of found aicrafts, which fuelspend per kilometer enter the range 
	 * 	fromValue to toValue
	 * 
	 * @param fromValue
	 * @param toValue
	 * @return listOfFoundAicrafts
	 */
	public List<Aircraft> getListOfFoundAicraftsByFuelSpendingRange(FuelSpendTonPerKm fromValue,
			FuelSpendTonPerKm toValue) {

		List<Aircraft> listOfFoundAicrafts = new LinkedList<>();
		Set<Aircraft> aircraftSet = this.aircraftPark.getAircraftSet();

		for (Iterator<Aircraft> iterAircraftSet = aircraftSet.iterator(); iterAircraftSet.hasNext();) {
			Aircraft aircraft = (Aircraft) iterAircraftSet.next();

			FuelSpendTonPerKm aicraftFuelSpend = (FuelSpendTonPerKm) aircraft.getBasicTechAircraftData()
					.getFuelSpending();
			if ((aicraftFuelSpend.compareTo(fromValue) >= 0) && (aicraftFuelSpend.compareTo(toValue) <= 0)) {
				listOfFoundAicrafts.add(aircraft);
			}
		}
		return listOfFoundAicrafts;
	}

}
