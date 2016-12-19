/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;

import by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechdata;

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

	public void setCargoAircraftTechdata(final CargoAircraftTechdata cargoAircraftTechdata) {
		((CargoAircraft) aircraft).setCargoAircraftTechdata(cargoAircraftTechdata);
	}

	@Override
	public CargoAircraft getResult() {
		return (CargoAircraft) aircraft;
	}

}
