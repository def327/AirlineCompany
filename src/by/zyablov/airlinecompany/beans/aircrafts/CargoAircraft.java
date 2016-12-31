/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts;

import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraft extends Aircraft {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7792314539883108495L;
	
	
	
	private CargoAircraftTechData cargoAircraftTechData; 
	
	/**
	 * @param idAircraft
	 * @param nameAircraft
	 * @param basicTechAircraftData
	 * @param cargoAircraftTechData
	 */
	public CargoAircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData,
			CargoAircraftTechData cargoAircraftTechData) {
		super(idAircraft, nameAircraft, basicTechAircraftData);
		this.cargoAircraftTechData = cargoAircraftTechData;
	}


	/**
	 * 
	 * @param cargoAircraftTechData
	 * 
	 */
	public CargoAircraft(){
		super();
		this.cargoAircraftTechData = new CargoAircraftTechData();
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
		return (this.cargoAircraftTechData.equals(other.cargoAircraftTechData));
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\n" + this.cargoAircraftTechData.toString());
	}

	/**
	 * @return the cargoAircraftTechdata
	 */
	public CargoAircraftTechData getCargoAircraftTechdata() {
		return cargoAircraftTechData;
	}

	/**
	 * @param cargoAircraftTechData the cargoAircraftTechdata to set
	 */
	public void setCargoAircraftTechdata(CargoAircraftTechData cargoAircraftTechData) {
		this.cargoAircraftTechData = cargoAircraftTechData;
	}
	
	

	

}
