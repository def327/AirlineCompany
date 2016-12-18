/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraft extends Aircraft {

	private CargoAircraftTechdata cargoAircraftTechdata; 
	

	/**
	 * @param id
	 * @param name
	 * @param specification
	 * @param cargoAircraftTechdata
	 */
	public CargoAircraft(int id, String name, TechSpecificationAircraft specification,
			CargoAircraftTechdata cargoAircraftTechdata) {
		super(id, name, specification);
		this.cargoAircraftTechdata = cargoAircraftTechdata;
	}

	/**
	 * 
	 * @param cargoAircraftTechdata
	 * 
	 */
	public CargoAircraft(){
		super();
		this.cargoAircraftTechdata = new CargoAircraftTechdata();
	}

	
	
	@Override
	public boolean equals(Object obj) {
		
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Aircraft)) {
			return false;
		}

		if (!super.equals(obj)) {
			return false;
		}

		CargoAircraft other = (CargoAircraft) obj;
		return (this.cargoAircraftTechdata.equals(other.cargoAircraftTechdata));
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\n" + this.cargoAircraftTechdata.toString());
	}

	/**
	 * @return the cargoAircraftTechdata
	 */
	public CargoAircraftTechdata getCargoAircraftTechdata() {
		return cargoAircraftTechdata;
	}

	/**
	 * @param cargoAircraftTechdata the cargoAircraftTechdata to set
	 */
	public void setCargoAircraftTechdata(CargoAircraftTechdata cargoAircraftTechdata) {
		this.cargoAircraftTechdata = cargoAircraftTechdata;
	}
	
	

	

}
