
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * Class {@code BuilderCargoAircraft} creates {@code CargoAircraft} object and
 * initializes it's fields.
 * 
 * @see by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft
 *
 */
public class BuilderCargoAircraft extends BuilderAircraft {

	/**
	 * Return's a initialized {@code CargoAircraft} object
	 */
	@Override
	public CargoAircraft getResult() {
		return (CargoAircraft) aircraft;
	}

	/**
	 * Set's a unique techinal characteristic for {@code CargoAircraft} object
	 * 
	 * @param uniqueAircraftTechDataBehavior
	 *            - an unique cargo technical characteristic
	 */
	@Override
	public void setUniqueAircraftTechData(UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {
		((CargoAircraft) aircraft).setCargoAircraftTechdata((CargoAircraftTechData) uniqueAircraftTechDataBehavior);
	}

	/**
	 * Constructor.
	 * 
	 * @param aircraft
	 *            - {@code CargoAircraft} object to create and initialize
	 */
	public BuilderCargoAircraft() {
		aircraft = new CargoAircraft();
	}

}
