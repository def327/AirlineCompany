
package by.zyablov.airlinecompany.tools;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import by.zyablov.airlinecompany.beans.aircrafts.Aircraft;
import by.zyablov.airlinecompany.beans.company.AirlineCompany;
import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.exeptions.AircraftEmptyParkException;
import by.zyablov.airlinecompany.exeptions.EmptyAircraftsFileException;
import by.zyablov.airlinecompany.exeptions.NoAirlineCompanyException;
import by.zyablov.airlinecompany.files.FileAicraftsSerializeReader;
import by.zyablov.airlinecompany.files.FileAicraftsSerializeWriter;
import by.zyablov.airlinecompany.interfaces.FileAircraftsReaderable;
import by.zyablov.airlinecompany.interfaces.FileAircraftsWriterable;

/**
 * Class {@code AirlineManageSystem } manages the {@code AirlineCompany} object.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 *
 * @see by.zyablov.airlinecompany.beans.company.AirlineCompany
 */
public class AirlineManageSystem {

	/**
	 * This field is an airliner company to manage.
	 */
	private AirlineCompany airlineCompany;

	/**
	 * This method returns true if airline company object was created else
	 * return false
	 * 
	 * @return {@code true} if airlineCompany is initialized; {@code false}
	 *         otherwise.
	 */
	public boolean haveAirlinerCompany() {
		return (this.airlineCompany != null);
	}

	/**
	 * This method adds a new {@code Aircraft} object to {@code AircraftPark}
	 * container, using {@code AirlineCompany}
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#addAircraftToPark(Aircraft)
	 * addAircraftToPark()} method.
	 * 
	 * @param newAircraft
	 *            - is a {@code Aircraft} object to add to a
	 *            {@code AircraftPark} container.
	 * 
	 * @return <b>{@code true}</b> if an {@code Aircraft} object is added
	 *         successfully; <b>{@code false}</b> otherwise.
	 * 
	 * @throws NoAirlineCompanyException
	 * 
	 */
	public boolean addAircraft(Aircraft newAircraft) throws NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.addAircraftToPark(newAircraft));
	}

	/**
	 * This method removes existing a {@code Aircraft} object from
	 * {@code AircraftPark} container, using {@code AirlineCompany}
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#removeAircraftFromPark(Aircraft)
	 * removeAircraftFromPark()} method.
	 * 
	 * @param removingAircraft
	 *            - is a {@code Aircraft} object to remove form a
	 *            {@code AircraftPark} container.
	 * 
	 * @return <b>{@code true}</b> if an {@code Aircraft} object is removed
	 *         successfully; <b>{@code false}</b> otherwise.
	 * 
	 * @throws NoAirlineCompanyException
	 * 
	 */
	public boolean removeAircraft(Aircraft removingAircraft) throws NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.removeAircraftFromPark(removingAircraft));
	}

	/**
	 * This method returns a list of all {@code Aircraft} objects
	 * {@code AircraftPark} container, using {@code AirlineCompany}
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfAircrafts()
	 * getListOfAircrafts()} method.
	 * 
	 * 
	 * @return a list of {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 */
	public List<Aircraft> getListOfAicrafts() throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		if (this.airlineCompany.getTotalAmountOfAircraft() == 0) {
			throw new AircraftEmptyParkException();
		}

		return (this.airlineCompany.getListOfAircrafts());
	}

	/**
	 * This method returns a list of {@code Aircraft} objects from
	 * {@code AircraftPark} container which middle velocity parameter are
	 * included in the range formed by values fromValueMidVelocity and
	 * toValueMidVelocity, using {@code AirlineCompany}
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfFoundAicraftsByMidVelocityRange(KilometerPerHour, KilometerPerHour)
	 * getListOfFoundAicraftsByMidVelocityRange()} method.
	 * 
	 * 
	 * @param fromValueMidVelocity
	 *            - a minumum {@code KilometerPerHour} value of the range
	 * 
	 * @param toValueMidVelocity
	 *            - a maximum {@code KilometerPerHour} value of the range
	 * 
	 * @return a list of {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public List<Aircraft> getListOfFoundAircraftsByMidVelocityRange(KilometerPerHour fromValueMidVelocity,
			KilometerPerHour toValueMidVelocity) throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfFoundAicraftsByMidVelocityRange(fromValueMidVelocity, toValueMidVelocity));
	}

	/**
	 * This method returns a list of {@code Aircraft} objects from
	 * {@code AircraftPark} container which fuel spending parameter are included
	 * in the range formed by values fromValueFuelSpending and
	 * toValueFuelSpending, using {@code AirlineCompany}
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfFoundAicraftsByFuelSpendingRange(FuelSpendTonPerKm, FuelSpendTonPerKm)
	 * getListOfFoundAicraftsByFuelSpendingRange()} method.
	 * 
	 * 
	 * @param fromValueFuelSpending
	 *            - a minumum {@code FuelSpendTonPerKm}
	 * 
	 * @param toValueFuelSpending
	 *            - a maximum {@code FuelSpendTonPerKm} value of the range
	 * 
	 * @return a list of {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public List<Aircraft> getListOfFoundAircraftsByFuelSpendingRange(FuelSpendTonPerKm fromValueFuelSpending,
			FuelSpendTonPerKm toValueFuelSpending) throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfFoundAicraftsByFuelSpendingRange(fromValueFuelSpending,
				toValueFuelSpending));
	}

	/**
	 * This method returns a list of sort {@code Aircraft} objects by their
	 * middle velocity from {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfSortedAircraftsByMiddleVelocity()
	 * getListOfSortedAircraftsByMiddleVelocity()} method of
	 * {@code AirlineCompany} class.
	 * 
	 * 
	 * @return a list of sorted {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public List<Aircraft> getListOfSortAircraftsByMiddleVelocity()
			throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfSortedAircraftsByMiddleVelocity());
	}

	/**
	 * This method returns a list of sort {@code Aircraft} objects by their
	 * maximum people capacity from {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfSortedAircraftByPeopleCapacity()
	 * getListOfSortedAircraftByPeopleCapacity()} method of
	 * {@code AirlineCompany} class.
	 * 
	 * 
	 * @return a list of sorted {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public List<Aircraft> getListOfSortAircraftByPeopleCapacity()
			throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfSortedAircraftByPeopleCapacity());
	}

	/**
	 * This method returns a list of sort {@code Aircraft} objects by their fuel
	 * spending from {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfSortedAircraftByFuelSpending()
	 * getListOfSortedAircraftByFuelSpending()} method of {@code AirlineCompany}
	 * class.
	 * 
	 * 
	 * @return a list of sorted {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public List<Aircraft> getListOfSortAicraftByFuelSpending()
			throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfSortedAircraftByFuelSpending());
	}

	/**
	 * This method returns a list of sort {@code Aircraft} objects by their
	 * maximum weight capacity from {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getListOfSortedAircraftByMaxWeightCapacity()
	 * getListOfSortedAircraftByMaxWeightCapacity()} method of
	 * {@code AirlineCompany} class.
	 * 
	 * 
	 * @return a list of sorted {@code Aircraft} objects.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public List<Aircraft> getListOfSortAicraftByMaxWeightCapacity()
			throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfSortedAircraftByMaxWeightCapacity());
	}

	/**
	 * This method returns an {@code Aircraft} object from {@code AircraftPark}
	 * by it's unique id, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getAircraftFormAircraftParkById(int)
	 * getAircraftFormAircraftParkById()} method of {@code AirlineCompany}
	 * class.
	 * 
	 * 
	 * @param idAircraft
	 *            - value is a unique ID for {@code Aircraft} object.
	 * 
	 * @return {@code Aircraft} object.
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public Aircraft getAircraftkById(int idAircraft) throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		if (this.getAircraftsTotalAmount() == 0) {
			throw new AircraftEmptyParkException();
		}

		return (this.airlineCompany.getAircraftFormAircraftParkById(idAircraft));
	}

	/**
	 * This method reaturns a total amount of people capacity of all
	 * {@code Aircraft} objects from {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getTotalAircraftsPeopleCapacity()
	 * getTotalAircraftsPeopleCapacity()} method of {@code AirlineCompany}
	 * class.
	 * 
	 * @return a value of {@code PeopleCapacity} object
	 * 
	 * @throws NoAirlineCompanyException
	 * 
	 */
	public PeopleCapacity getTotalAircraftsPeopleCapacity()
			throws AircraftEmptyParkException, NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getTotalAircraftsPeopleCapacity());
	}

	/**
	 * This method reaturns a total amount of maximum weight capacity of all
	 * {@code Aircraft} objects from {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getTotalAircraftsWeightCapacity()
	 * getTotalAircraftsWeightCapacity()} method of {@code AirlineCompany}
	 * class.
	 * 
	 * @return a value of {@code Tons} object
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * 
	 */
	public Tons getTotalAircraftsWeigthCapacity() throws AircraftEmptyParkException, NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getTotalAircraftsWeightCapacity());
	}

	/**
	 * This method returns a full information about a {@code AirlineCompany}
	 * object to string, using {@code AirlineCompany} methods.
	 * 
	 * @return a full information in a String type
	 * 
	 * @throws NoAirlineCompanyException
	 */
	public String getFullAirlineCompanyInformation() {

		String fullCompanyInformation = ("Airline company name: " + this.airlineCompany.getCompanyName() + "\n"
				+ "Airline company email: " + this.airlineCompany.getCompanyEmail() + "\n"
				+ "Airline company founding date: " + this.airlineCompany.getFoundDataParsedToString() + "\n"
				+ "A total amount of aircrafts at the airliner company park: "
				+ this.airlineCompany.getTotalAmountOfAircraft() + " aircrafts");

		return fullCompanyInformation;
	}

	/**
	 * This method returns an amount of {@code Aircraft} objects in
	 * {@code AircraftPark} container, using
	 * {@link by.zyablov.airlinecompany.beans.company.AirlineCompany#getTotalAmountOfAircraft()
	 * getTotalAmountOfAircraft()} method of {@code AirlineCompany} class.
	 * 
	 * @return a total amount of {@code Aircraft} objects in int type
	 * 
	 */
	public int getAircraftsTotalAmount() {
		return (this.airlineCompany.getTotalAmountOfAircraft());
	}

	/**
	 * This method saves all {@code Aircraft} objects from {@code AircraftPark}
	 * container to file, using
	 * {@link by.zyablov.airlinecompany.interfaces.FileAircraftsWriterable#writeAircraftListToFile(List)
	 * writeAircraftListToFile} of {@code FileAircraftsWriterable} interface.
	 * 
	 * <p>
	 * Also this method uses a
	 * {@link by.zyablov.airlinecompany.files.FileAicraftsSerializeWriter#writeAircraftListToFile(List)
	 * writeAircraftListToFile} method of {@code FileAicraftsSerializeWriter}
	 * class to write information to data file about {@code Aircraft} objects.
	 * 
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * @throws IOException
	 * 
	 * @see by.zyablov.airlinecompany.interfaces.FileAircraftsWriterable
	 * @see by.zyablov.airlinecompany.files.FileAicraftsSerializeWriter
	 * 
	 */
	public void saveAircraftsToFile() throws NoAirlineCompanyException, IOException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		if (this.airlineCompany.getTotalAmountOfAircraft() == 0) {
			throw new AircraftEmptyParkException();
		}

		List<Aircraft> aircraftsList = this.getListOfAicrafts();

		FileAircraftsWriterable fileWriter = new FileAicraftsSerializeWriter();
		fileWriter.writeAircraftListToFile(aircraftsList);
	}

	/**
	 * This method reads all {@code Aircraft} objects to {@code AircraftPark}
	 * container from file, using
	 * {@link by.zyablov.airlinecompany.interfaces.FileAircraftsReaderable#readAircraftListFromFile()
	 * readAircraftListFromFile} of {@code FileAircraftsReaderable} interface.
	 * 
	 * <p>
	 * Also this method uses a
	 * {@link by.zyablov.airlinecompany.files.FileAicraftsSerializeReader#readAircraftListFromFile()
	 * readAircraftListFromFile} method of {@code FileAicraftsSerializeReader}
	 * class to read information from data file about {@code Aircraft} objects.
	 * 
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws AircraftEmptyParkException
	 * @throws IOException
	 * 
	 * @see by.zyablov.airlinecompany.interfaces.FileAircraftsReaderable
	 * @see by.zyablov.airlinecompany.files.FileAicraftsSerializeReader
	 * 
	 */
	public void readAircraftsFromFile() throws NoAirlineCompanyException, FileNotFoundException, ClassNotFoundException,
			IOException, EmptyAircraftsFileException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		FileAircraftsReaderable fileReader = new FileAicraftsSerializeReader();
		List<Aircraft> aircraftsList = fileReader.readAircraftListFromFile();

		if (aircraftsList.size() == 0) {
			throw new EmptyAircraftsFileException();
		}

		addAircraftFromFileToAirlineCompanyPark(aircraftsList);

	}

	/**
	 * This metod adds an {@code Aircraft} object from data file to
	 * {@code AircraftPark} container with a new generated unique Id, using a
	 * static
	 * {@link by.zyablov.airlinecompany.tools.IdAircraftMakeManager#getUniqueIdAircraft(String)
	 * getUniqueIdAircraft} method of {@code IdAircraftMakeManager}.
	 * 
	 * @param aircraftsList
	 *            - a list {@code Aircraft} object,that are needed to set a
	 *            unique ID.
	 * 
	 * @see by.zyablov.airlinecompany.tools.IdAircraftMakeManager
	 * 
	 */
	private void addAircraftFromFileToAirlineCompanyPark(List<Aircraft> aircraftsList) {
		for (Iterator<Aircraft> iterator = aircraftsList.iterator(); iterator.hasNext();) {
			Aircraft newAircraft = (Aircraft) iterator.next();

			// Generate a unique Id for an aircraft from file and add this
			// aircraft to airliner company park
			int uniqueId = IdAircraftMakeManager.getUniqueIdAircraft(newAircraft.getNameAircraft());

			newAircraft.setIdAircraft(uniqueId);
			if (!(this.airlineCompany.addAircraftToPark(newAircraft))) {
				System.out.println("Problems to add new aircraft to airline company park!");
				return;
			}

		}
	}

	/**
	 * Constructor.
	 * 
	 * @param airlineCompany
	 *            - an airliner company to manage.
	 */
	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}

	/**
	 * Constructor.
	 * 
	 * @param airlineCompany
	 *            - an airliner company to manage.
	 */
	public AirlineManageSystem() {
		this.airlineCompany = null;
	}

	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}

}
