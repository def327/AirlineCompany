/**
 * 
 */
package by.zyablov.airlinecompany.classbuilders;

import by.zyablov.airlinecompany.beans.CargoAircraft;
import by.zyablov.airlinecompany.interfaces.AircraftBuilder;
import by.zyablov.airlinecompany.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

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
