/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.beans.techdata.UniqueAircraftTechData;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraftBuilder extends AircraftBuilder {

	/**
	 * 
	 */
	public CargoAircraftBuilder() {
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
	public void setUniqueAircraftTechData(UniqueAircraftTechData uniqueAircraftTechData) {
		((CargoAircraft)aircraft).setCargoAircraftTechdata((CargoAircraftTechData)uniqueAircraftTechData);		
	}

}
