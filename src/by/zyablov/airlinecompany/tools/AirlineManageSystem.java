/**
 * 
 */
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
 * @author Дмитрий
 *
 */
public class AirlineManageSystem {

	private AirlineCompany airlineCompany;

	/**
	 * !!! This method return true if airline company object was created else
	 * return false
	 * 
	 * @return
	 */
	public boolean haveAirlinerCompany() {
		return (this.airlineCompany != null);
	}

	/**
	 * !!! This method add new aircraft to airliner company park
	 * 
	 */
	public boolean addAircraft(Aircraft newAircraft) throws NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.addAircraftToPark(newAircraft));
	}

	/**
	 * !!! This method remove existing aircraft from airliner company park
	 * 
	 */
	public boolean removeAircraft(Aircraft removingAircraft) throws NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.removeAircraftFromPark(removingAircraft));
	}

	/**
	 * !!! This method get the list of all aircrafts from airline company park
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
	 * This method get the List of aircrafts from airline company park, which
	 * middle velocity parameter are included in the range formed by values
	 * fromValueMidVelocity and toValueMidVelocity
	 * 
	 */
	public List<Aircraft> getListOfFoundAircraftsByMidVelocityRange(KilometerPerHour fromValueMidVelocity,
			KilometerPerHour toValueMidVelocity) throws NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfFoundAicraftsByMidVelocityRange(fromValueMidVelocity, toValueMidVelocity));
	}

	/**
	 * !!! This method get the List of aircrafts from airline comapany park,
	 * which fuelspending parameter are included in the range formed by values
	 * fromValueFuelSpending and toValueFuelSpending
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
	 * !!! This method Get the List of sort aircrafts by their middle velocity
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
	 * !!! This method get the List of sort aircrafts by their maximum people
	 * capacity
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
	 * !!! This method get the List of sort aicrafts by their fuel spending ()
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
	 * !!! This method get the List of sort aicrafts by their maximum weight
	 * capacity
	 */
	public List<Aircraft> getListOfSortAicraftByMaxWeightCapacity()
			throws NoAirlineCompanyException, AircraftEmptyParkException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getListOfSortedAircraftByMaxWeightCapacity());
	}

	/**
	 * !!! This method get aircraft from airline company park
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
	 * !!! This method calculate a total amount people capacity of all aircrafts
	 * at the Aircraft park of airline company
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
	 * !!! This method calculate a total amount weight capacity of all aircrafts
	 * at the Aircraft park of airline company
	 * 
	 * @throws NoAirlineCompanyException
	 * 
	 */
	public Tons getTotalAircraftsWeigthCapacity() throws AircraftEmptyParkException, NoAirlineCompanyException {

		if (this.airlineCompany == null) {
			throw new NoAirlineCompanyException();
		}

		return (this.airlineCompany.getTotalAircraftsWeightCapacity());
	}

	/**
	 * !!! This method return a full airliner company information to string
	 * 
	 * @return
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
	 * !!! This method return an amount of aircrafts at the airliner company
	 * park
	 * 
	 * @return
	 */
	public int getAircraftsTotalAmount() {
		return (this.airlineCompany.getTotalAmountOfAircraft());
	}

	/**
	 * !!! This method save all aircrafts to file with path:
	 * "datafiles/datalist.dat"
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws IOException
	 * @throws AircraftEmptyParkException
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
	 * !!! This method read data information about aircrafts from file with
	 * path: "datafiles/datalist.dat"
	 * 
	 * @throws NoAirlineCompanyException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException
	 * @throws IOException
	 * @throws EmptyAircraftsFileException
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
	 * !!! This metod add aircraft form data file to airline company park with
	 * generated unique Id
	 * 
	 * @param aircraftsList
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
	 * !!! This is a constructor without parameters
	 * 
	 * @param airlineCompany
	 */
	public AirlineManageSystem() {
		this.airlineCompany = null;
	}

	public AirlineCompany getAirlineCompany() {
		return airlineCompany;
	}

	public void setAirlineCompany(AirlineCompany airlineCompany) {
		this.airlineCompany = airlineCompany;
	}

}
