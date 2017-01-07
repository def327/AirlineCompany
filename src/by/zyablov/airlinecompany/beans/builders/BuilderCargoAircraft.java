/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * @author Дмитрий
 *
 */
public class BuilderCargoAircraft extends BuilderAircraft {


	@Override
	public CargoAircraft getResult() {
		return (CargoAircraft) aircraft;
	}

	@Override
	public void setUniqueAircraftTechData(UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {
		((CargoAircraft)aircraft).setCargoAircraftTechdata((CargoAircraftTechData)uniqueAircraftTechDataBehavior);		
	}
	
	/**
	 * !!! This a constuctor without parameters
	 */
	public BuilderCargoAircraft() {
		aircraft = new CargoAircraft();
	}

}
