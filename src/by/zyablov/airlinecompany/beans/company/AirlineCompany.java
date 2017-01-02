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

import by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark;
import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByFuelSpending;
import by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByMaxWeightCapacity;
import by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByPeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;

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
		return (this.aircraftPark.addAirCraft(newAircraft));
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
	 * @throws AircraftEmptyParkException 
	 * 
	 */
	public PeopleCapacity getTotalAircraftsPeopleCapacity() throws AircraftEmptyParkException {
		return (this.aircraftPark.getTotalAmountPeopleCapacity());
	}

	/**
	 * !!! This method calculate amount of all aircraft's maxWeightCapacity
	 * @throws AircraftEmptyParkException 
	 * 
	 */
	public Tons getTotalAircraftsWeightCapacity() throws AircraftEmptyParkException {
		return (this.aircraftPark.getTotalAmountWeigthCapacity());
	}

	/**
	 * !!! This method return a total amount of all aircrafts at the aircraft
	 * park
	 * 
	 */
	
	public int getTotalAmountOfAircraft() {
		return (this.aircraftPark.getTotalAircraftsAmount());
	}

	/**
	 * !!! This method return a sort list of aicrafts by their middle velocity
	 * @throws AircraftEmptyParkException 
	 * 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftsByMidVelocity() throws AircraftEmptyParkException {
		
		if(this.aircraftPark.getTotalAircraftsAmount() == 0){
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft);
		return listOfAircraft;
	}

	/**
	 * !!! This method return a sort list of aicrafts by their people capacity
	 * @throws AircraftEmptyParkException 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByPeopleCapacity() throws AircraftEmptyParkException {
		
		if(this.aircraftPark.getTotalAircraftsAmount() == 0){
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByPeopleCapacity());
		return listOfAircraft;
	}

	/**
	 * !!! This method return a sort list of aicrafts by their fuel spending
	 * @throws AircraftEmptyParkException 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByFuelSpending() throws AircraftEmptyParkException {
		
		if(this.aircraftPark.getTotalAircraftsAmount() == 0){
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByFuelSpending());
		return listOfAircraft;
	}

	/**
	 * !!! This method return a sort list of aircrafts by their maximum fuel
	 * spending
	 * @throws AircraftEmptyParkException 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByMaxWeightCapacity() throws AircraftEmptyParkException {
		
		if(this.aircraftPark.getTotalAircraftsAmount() == 0){
			throw new AircraftEmptyParkException();
		}

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
	 * !!! This method return a list of all aicrafts from airliner company park
	 * @return listOfAircraft
	 */
	public List<Aircraft> getListOfAircrafts(){
		
		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		return listOfAircraft;
	}
	

	/**
	 * !!! This method return a list of found aircrafts, which fuel spending per
	 * kilometer enter the range formed by parameters fromValue to toValue
	 * 
	 * @param fromValueFuelSpending
	 * @param toValueFuelSpending
	 * @return listOfFoundAicrafts
	 * @throws AircraftEmptyParkException 
	 */
	public List<Aircraft> getListOfFoundAicraftsByFuelSpendingRange(FuelSpendTonPerKm fromValueFuelSpending,
			FuelSpendTonPerKm toValueFuelSpending) throws AircraftEmptyParkException {
		
		if(this.aircraftPark.getTotalAircraftsAmount() == 0){
			throw new AircraftEmptyParkException();
		}
		

		List<Aircraft> listOfFoundAicrafts = new LinkedList<>();
		Set<Aircraft> aircraftSet = this.aircraftPark.getAircraftSet();

		for (Iterator<Aircraft> iterAircraftSet = aircraftSet.iterator(); iterAircraftSet.hasNext();) {
			Aircraft aircraft = (Aircraft) iterAircraftSet.next();

			FuelSpendTonPerKm aicraftFuelSpend = (FuelSpendTonPerKm) aircraft.getBasicTechAircraftData()
					.getFuelSpending();
			if ((aicraftFuelSpend.compareTo(fromValueFuelSpending) >= 0)
					&& (aicraftFuelSpend.compareTo(toValueFuelSpending) <= 0)) {
				listOfFoundAicrafts.add(aircraft);
			}
		}
		return listOfFoundAicrafts;
	}
	
	/**
	 * !!! This method return a list of found aircrafts, which middle velocity 
	 *  enter the range, formed by parameters fromValueMidVelocity to toValueMidVelocity
	 * 
	 * @param fromValueMidVelocity
	 * @param toValueMidVelocity
	 * @return listOfFoundAicrafts
	 */
	public List<Aircraft> getListOfFoundAicraftsByMidVelocityRange(KilometerPerHour fromValueMidVelocity,
			KilometerPerHour toValueMidVelocity) {
		
		List<Aircraft> listOfFoundAicrafts = new LinkedList<>();
		Set<Aircraft> aircraftSet = this.aircraftPark.getAircraftSet();

		for (Iterator<Aircraft> iterAircraftSet = aircraftSet.iterator(); iterAircraftSet.hasNext();) {
			Aircraft aircraft = (Aircraft) iterAircraftSet.next();

			KilometerPerHour aicraftMidVelocity = (KilometerPerHour) aircraft.getBasicTechAircraftData()
					.getMidVelocity();
			
			if ((aicraftMidVelocity.compareTo(fromValueMidVelocity) >= 0)
					&& (aicraftMidVelocity.compareTo(toValueMidVelocity) <= 0)) {
				listOfFoundAicrafts.add(aircraft);
			}
		}
		return listOfFoundAicrafts;
		
	}

	/**
	 * !!! This method find aircraft by unique aicraft's id and return this
	 * <b>aircraft</b> from airline company park <i>if there isn't a suitable
	 * aircraft at the park this method will return <b>null</b> </i>
	 * 
	 * @param idAircraft
	 * @return Aicraft aircraft
	 */
	public Aircraft getAircraftFormAircraftParkById(int idAircraft) {
		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());

		for (Iterator<Aircraft> iterAicraftList = listOfAircraft.iterator(); iterAicraftList.hasNext();) {
			Aircraft aircraft = (Aircraft) iterAicraftList.next();

			if (aircraft.getIdAircraft() == idAircraft) {
				return aircraft;
			}
		}
		return null;
	}


}
