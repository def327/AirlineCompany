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

	/**
	 * 
	 */
	public BuilderCargoAircraft() {
		aircraft = new CargoAircraft();
	}

//  Roll back if have problem with cast during RUN-TIME
//	public void setCargoAircraftTechdata(final CargoAircraftTechdata cargoAircraftTechdata) {
//		((CargoAircraft) aircraft).setCargoAircraftTechdata(cargoAircraftTechdata);
//	}

	@Override
	public CargoAircraft getResult() {
		return (CargoAircraft) aircraft;
	}

	@Override
	public void setUniqueAircraftTechData(UniqueAircraftTechDataBehavior uniqueAircraftTechDataBehavior) {
		((CargoAircraft)aircraft).setCargoAircraftTechdata((CargoAircraftTechData)uniqueAircraftTechDataBehavior);		
	}

}
