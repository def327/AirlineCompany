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

	@Override
	public String getFullAircraftInformationDataToString() {

		/* Get all cargo aircraft's fields */
		String aircraftTYpe = "CARGO";
		int idAircraft = this.idAircraft;
		String nameAircraft = this.nameAircraft;
		String fuelSpending = this.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString();
		String middleVelocity = this.getBasicTechAircraftData().getMidVelocity().getMeasureValueInString();
		String maxPeopleCapacity = this.getBasicTechAircraftData().getMaxPeopleCapacity().getMeasureValueInString();
		String maxWeightCapacity = this.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInString();
		String cargoDepartmentSize = this.getCargoAircraftTechdata().getCargoDepartmentSize().getMeasureValueInString();
		String canTransportDangerGoods = (this.getCargoAircraftTechdata().isCanTransprtDangerGoods()) ? "YES" : "NO";

		String cargoAircraftDataString = ("AIRCRAFT TYPE: " + aircraftTYpe + "\n" + "ID Aircraft: " + idAircraft + "\n"
				+ "NAME: " + nameAircraft + "\n" + "MAXIMUM FUEL SPEND: " + fuelSpending + "\n" + "MIDDLE VELOCITY: "
				+ middleVelocity + "\n" + "MAX PEOPLE CAPACITY: " + maxPeopleCapacity + "\n" + "MAX WEIGHT CAPACITY: "
				+ maxWeightCapacity + "\n" + "CARGO DEPARTMENT SIZE: " + cargoDepartmentSize + "\n"
				+ "CAN TRANSPORT DANGER GOODS: " + canTransportDangerGoods);

		return cargoAircraftDataString;
	}

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
	public CargoAircraft() {
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
	 * @param cargoAircraftTechData
	 *            the cargoAircraftTechdata to set
	 */
	public void setCargoAircraftTechdata(CargoAircraftTechData cargoAircraftTechData) {
		this.cargoAircraftTechData = cargoAircraftTechData;
	}

}
