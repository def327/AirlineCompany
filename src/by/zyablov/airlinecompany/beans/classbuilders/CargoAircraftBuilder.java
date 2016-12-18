/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;

import by.zyablov.airlinecompany.beans.aircrafts.CargoAircraft;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.beans.techdata.TechSpecificationAircraft;
import by.zyablov.airlinecompany.interfaces.AircraftBuilder;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraftBuilder implements AircraftBuilder {

	private CargoAircraft aircraft;

	/**
	 * 
	 */
	public CargoAircraftBuilder() {
		aircraft = new CargoAircraft();
	}
	
	public void setCargoAircraftTechdata(final CargoAircraftTechdata cargoAircraftTechdata) {
		aircraft.setCargoAircraftTechdata(cargoAircraftTechdata);
	}

	@Override
	public void setId(int id) {
		aircraft.setId(id);
	}

	@Override
	public void setName(String name) {
		aircraft.setName(name);
	}

	@Override
	public void setTechSpecificationAircraft(TechSpecificationAircraft specification) {
		this.aircraft.setSpecification(specification);		
	}

	@Override
	public CargoAircraft getResult() {		
		return aircraft;
	}

}
