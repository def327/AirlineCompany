/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts;

import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraft extends Aircraft {

	private CargoAircraftTechdata cargoAircraftTechdata; 
	
	/**
	 * @param idAircraft
	 * @param nameAircraft
	 * @param basicTechAircraftData
	 * @param cargoAircraftTechdata
	 */
	public CargoAircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData,
			CargoAircraftTechdata cargoAircraftTechdata) {
		super(idAircraft, nameAircraft, basicTechAircraftData);
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
