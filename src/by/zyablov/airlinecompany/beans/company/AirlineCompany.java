
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
 * Class {@code AirlineCompany} represents a airline company, which includes id,
 * companie's name, companie's email, companie's date of found and
 * {@code AircraftPark} fields to storage {@code Aircraft} objects.
 * <p>
 * {@code AirlineCompany} class inherits {@code Company}, this class allow to
 * use {@code AircraftPark} object and works with it.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
 * @see by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark
 * 
 */
public class AirlineCompany extends Company {

	/**
	 * This value is a container, which includes {@code Aircraft} objects.
	 */
	private AircraftPark aircraftPark;

	/**
	 * 
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#addAirCraft(Aircraft newAircraft)
	 * addNewAircraft} method from {@code AircraftPark} and add a new
	 * {@code Aircraft} object to a container {@code AircraftPark}.
	 * 
	 * @param newAircraft
	 *            an {@code Aircraft} object, which needs to add to
	 *            {@code AircraftPark} container.
	 * @return <b>{@code true}</b> if an {@code Aircraft} object is added
	 *         successfully; <b>{@code false}</b> otherwise.
	 * 
	 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
	 * @see by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark
	 * 
	 */
	public boolean addAircraftToPark(Aircraft newAircraft) {
		return (this.aircraftPark.addAirCraft(newAircraft));
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#removeAircraft(Aircraft removingAircraft)
	 * removeAircraft} method from {@code AircraftPark} and remove an
	 * {@code Aircraft} object from a container {@code AircraftPark}.
	 * 
	 * 
	 * @param removingAircraft
	 *            an {@code Aircraft} object, which needs to remove from
	 *            {@code AircraftPark} container.
	 * @return <b>{@code true}</b> if an {@code Aircraft} object is removed
	 *         successfully; <b>{@code false}</b> otherwise.
	 * 
	 * @see by.zyablov.airlinecompany.beans.aircrafts.Aircraft
	 * @see by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark
	 */
	public boolean removeAircraftFromPark(Aircraft removingAircraft) {
		return (this.aircraftPark.removeAircraft(removingAircraft));
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getTotalAmountPeopleCapacity()
	 * getTotalAmountPeopleCapacity} method from {@code AircraftPark} and return
	 * a total amount of all people capacity of all {@code Aircraft} objects in
	 * a {@code AircraftPark} container.
	 * 
	 * 
	 * @return a total amount of {@code PeopleCapacity} objects of
	 *         {@code Aircraft} objects in in current {@code AircraftPark}.
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 * @see PeopleCapacity
	 * 
	 */
	public PeopleCapacity getTotalAircraftsPeopleCapacity() throws AircraftEmptyParkException {
		return (this.aircraftPark.getTotalAmountPeopleCapacity());
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getTotalAmountWeigthCapacity()
	 * getTotalAmountWeigthCapacity} method from {@code AircraftPark} and return
	 * a total weight capacity of all {@code Aircraft} objects in a
	 * {@code AircraftPark} container.
	 * 
	 * 
	 * @return {@code Tons} a total amount of weight capacity in {@code Tons}
	 *         objects of {@code Aircraft} objects in in current
	 *         {@code AircraftPark}.
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 * @see Tons
	 * 
	 */
	public Tons getTotalAircraftsWeightCapacity() throws AircraftEmptyParkException {
		return (this.aircraftPark.getTotalAmountWeigthCapacity());
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getTotalAircraftsAmount()
	 * getTotalAircraftsAmount} method from {@code AircraftPark} and return a
	 * total amount of {@code Aircraft} objects in a {@code AircraftPark}
	 * container.
	 * 
	 * @return aircraftsAmount - a total {@code Aircraft} objects in the
	 *         {@code AircraftPark} container.
	 * 
	 */
	public int getTotalAmountOfAircraft() {
		return (this.aircraftPark.getTotalAircraftsAmount());
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects , than this method uses
	 * {@link by.zyablov.airlinecompany.beans.aircrafts.Aircraft#compareTo(Object o)
	 * compareTo} method of {@code Aircraft} class and return a sorted list of
	 * {@code Aircraft} objects by their {@code KilometerPerHour} middle
	 * velocity field.
	 * 
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 * @return listOfAircraft - a List of {@code Aircraft} objects, sorted by
	 *         {@code KilometerPerHour} middle velocity field.
	 * 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftsByMiddleVelocity() throws AircraftEmptyParkException {

		if (this.aircraftPark.getTotalAircraftsAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft);
		return listOfAircraft;
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects , than this method uses
	 * {@link by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByPeopleCapacity#compare(Object o1, Object o2)
	 * compare} method of {@code AircraftComparatorByPeopleCapacity} class and
	 * return a sorted list of {@code Aircraft} objects by their
	 * {@code PeopleCapacity} people capacity field.
	 * 
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 * @return listOfAircraft - a list of {@code Aircraft} objects, sorted by
	 *         {@code PeopleCapacity} maximum people capacity field.
	 * 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByPeopleCapacity() throws AircraftEmptyParkException {

		if (this.aircraftPark.getTotalAircraftsAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByPeopleCapacity());
		return listOfAircraft;
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects , than this method uses
	 * {@link by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByFuelSpending#compare(Object o1, Object o2)
	 * compare} method of {@code AircraftComparatorByFuelSpending} class and
	 * return a sorted list of {@code Aircraft} objects by their
	 * {@code FuelSpendTonPerKm} fuel spending field.
	 * 
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 * @return listOfAircraft - a list of {@code Aircraft} objects, sorted by
	 *         {@code FuelSpendTonPerKm} fuel spending field.
	 * 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByFuelSpending() throws AircraftEmptyParkException {

		if (this.aircraftPark.getTotalAircraftsAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByFuelSpending());
		return listOfAircraft;
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects , than this method uses
	 * {@link by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByMaxWeightCapacity#compare(Object o1, Object o2)
	 * compare} method of {@code AircraftComparatorByMaxWeightCapacity} class
	 * and return a sorted list of {@code Aircraft} objects by their
	 * {@code Tons} maximum weight capacity field.
	 * 
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 * 
	 * @return listOfAircraft - a List of {@code Aircraft} objects, sorted by
	 *         {@code Tons} maximum weight capacity field.
	 * 
	 * 
	 */
	public List<Aircraft> getListOfSortedAircraftByMaxWeightCapacity() throws AircraftEmptyParkException {

		if (this.aircraftPark.getTotalAircraftsAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		Collections.sort(listOfAircraft, new AircraftComparatorByMaxWeightCapacity());
		return listOfAircraft;
	}

	/**
	 * This method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects and return this set as a list object.
	 * 
	 * @return listOfAircraft - a list of {@code Aircraft} objects.
	 * 
	 */
	public List<Aircraft> getListOfAircrafts() {

		List<Aircraft> listOfAircraft = new ArrayList<>(this.aircraftPark.getAircraftSet());
		return listOfAircraft;
	}

	/**
	 * This method returns a list of {@code Aircraft} objects, which
	 * {@code FuelSpendTonPerKm} field from {@code BasicTechAircraftData} is
	 * enter the range between {@code FuelSpendTonPerKm} fromValueFuelSpending
	 * and {@code FuelSpendTonPerKm} toValueFuelSpending values.
	 * <p>
	 * Also this method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects and uses
	 * {@link by.zyablov.airlinecompany.beans.aircrafts.aircraftcomparators.AircraftComparatorByFuelSpending#compare(Object o1, Object o2)
	 * compare} method of {@code AircraftComparatorByFuelSpending} class.
	 * 
	 * 
	 * @param fromValueFuelSpending
	 *            - a minimum {@code FuelSpendTonPerKm} value of the range
	 * 
	 * @param toValueFuelSpendinga
	 *            - maximum {@code FuelSpendTonPerKm} value of the range
	 * 
	 * @return listOfFoundAicrafts - a list of {@code Aircraft} objects, which
	 *         {@code FuelSpendTonPerKm} field enter the range between
	 *         {@code FuelSpendTonPerKm} fromValueFuelSpending and
	 *         {@code FuelSpendTonPerKm} toValueFuelSpending values.
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 */
	public List<Aircraft> getListOfFoundAicraftsByFuelSpendingRange(FuelSpendTonPerKm fromValueFuelSpending,
			FuelSpendTonPerKm toValueFuelSpending) throws AircraftEmptyParkException {

		if (this.aircraftPark.getTotalAircraftsAmount() == 0) {
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
	 * This method returns a list of {@code Aircraft} objects, which
	 * {@code KilometerPerHour} field from {@code BasicTechAircraftData} is
	 * enter the range between {@code KilometerPerHour} fromValueMidVelocity and
	 * {@code KilometerPerHour} toValueMidVelocity values.
	 * <p>
	 * Also this method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects and uses
	 * {@link by.zyablov.airlinecompany.beans.aircrafts.Aircraft#compareTo(Object)
	 * compareTo} method of {@code Aircraft} class.
	 * 
	 * 
	 * @param fromValueFuelSpending
	 *            - a minimum {@code KilometerPerHour} value of the range
	 * 
	 * @param toValueFuelSpendinga
	 *            - maximum {@code KilometerPerHour} value of the range
	 * 
	 * @return listOfFoundAicrafts - a list of {@code Aircraft} objects, which
	 *         {@code KilometerPerHour} field enter the range between
	 *         {@code KilometerPerHour} fromValueMidVelocity and
	 *         {@code KilometerPerHour} toValueMidVelocity values.
	 * 
	 * @throws AircraftEmptyParkException
	 *             indicates that {@code AircraftPark} object doesn't have
	 *             {@code Aircraft} objects.
	 */
	public List<Aircraft> getListOfFoundAicraftsByMidVelocityRange(KilometerPerHour fromValueMidVelocity,
			KilometerPerHour toValueMidVelocity) throws AircraftEmptyParkException {

		if (this.aircraftPark.getTotalAircraftsAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> listOfFoundAicrafts = new LinkedList<>();
		Set<Aircraft> aircraftSet = this.aircraftPark.getAircraftSet();

		for (Iterator<Aircraft> iterAircraftSet = aircraftSet.iterator(); iterAircraftSet.hasNext();) {
			Aircraft aircraft = (Aircraft) iterAircraftSet.next();

			KilometerPerHour aicraftMidVelocity = (KilometerPerHour) aircraft.getBasicTechAircraftData()
					.getMiddleVelocity();

			if ((aicraftMidVelocity.compareTo(fromValueMidVelocity) >= 0)
					&& (aicraftMidVelocity.compareTo(toValueMidVelocity) <= 0)) {
				listOfFoundAicrafts.add(aircraft);
			}
		}
		return listOfFoundAicrafts;
	}

	/**
	 * This method finds {@code Aircraft} object from a {@code AircraftPark}
	 * conteiner by unique aicraft's id field and returns this {@code Aircraft}
	 * object from {@code AircraftPark} conteiner. Also this method call's a
	 * {@link by.zyablov.airlinecompany.beans.aircraftpark.AircraftPark#getAircraftSet()
	 * getAircraftSet} method from {@code AircraftPark} to get a set of
	 * {@code Aircraft} objects and use this set of {@code Aircraft} objects to
	 * find a {@code Aircraft} object with suitable ID field.
	 * 
	 * @param idAircraft
	 *            - value is a unique ID for {@code Aircraft} object.
	 * 
	 * @return a found {@code Aircraft} object; <b>{@code null}</b> otherwise.
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

	/**
	 * Constructor.
	 * 
	 * @param id
	 *            - a unique ID for {@code Company} object.
	 * @param name
	 *            - a name of {@code Company} object.
	 * @param email
	 *            - a email of {@code Company} object.
	 * @param foundDate
	 *            - a email of {@code Company} object.
	 * 
	 * @param aircraftPark
	 *            - a conteiner to storage {@code Aircraft} objects
	 */
	public AirlineCompany(int id, String name, String email, GregorianCalendar today, AircraftPark aircraftPark) {
		super(id, name, email, today);
		this.aircraftPark = aircraftPark;
	}

	/**
	 * Constructor.
	 * 
	 * @param aircraftPark
	 *            - a conteiner to storage {@code Aircraft} objects
	 */
	public AirlineCompany() {
		super();
		this.aircraftPark = new AircraftPark();
	}

	public void setAircraftPark(AircraftPark aircraftPark) {
		this.aircraftPark = aircraftPark;
	}

	public AircraftPark getAircraftPark() {
		return this.aircraftPark;
	}

	/**
	 * Returns a string representation of {@code AirlineCompany} object.
	 * 
	 * @return a string, which is consisted of
	 *         <i>companyId</i>,<i>companyName</i>,<i>companyEmail</i>,
	 *         <i>companyFoundDate</i> and <i>aircraftPark</i> fields of
	 *         {@code AirlineCompany}.
	 */
	@Override
	public String toString() {
		return (super.toString() + "\n" + (this.aircraftPark.toString()));
	}

}
