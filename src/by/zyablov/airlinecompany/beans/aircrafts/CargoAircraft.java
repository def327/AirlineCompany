
package by.zyablov.airlinecompany.beans.aircrafts;

import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 *
 * Class {@code CargoAircraft} represents an cargo aircraft,
 * {@code CargoAircraft} is a child of {@code Aircraft}, add a new field
 * cargoAircraftTechData, which represents an unique technical characteristic of
 * every {@code CargoAircraft} object.
 * 
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData
 * 
 */
public class CargoAircraft extends Aircraft {

	/**
	 * This value is genereted by JVM to serialize {@code CargoAircraft} class
	 */
	private static final long serialVersionUID = 7792314539883108495L;

	/**
	 * This value represents an unique technical characteristic of every
	 * {@code CargoAircraft} object.
	 * 
	 * @see by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData
	 */
	private CargoAircraftTechData cargoAircraftTechData;

	/**
	 * Returns an {@code CargoAircraft} object's full information, which is
	 * parsed to string
	 * 
	 * @return a full techinical information, parsed to String
	 */
	@Override
	public String getFullAircraftInformationDataToString() {

		/* Get all cargo aircraft's fields */
		String aircraftTYpe = "CARGO";
		int idAircraft = this.idAircraft;
		String nameAircraft = this.nameAircraft;
		String fuelSpending = this.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString();
		String middleVelocity = this.getBasicTechAircraftData().getMiddleVelocity().getMeasureValueInString();
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
	 * Constructor.
	 * 
	 * @param idAircraft
	 *            - a unique ID of {@code CargoAircraft} object
	 * @param nameAircraft
	 *            - a name for {@code CargoAircraft} object
	 * @param basicTechAircraftData
	 *            - a {@code BasicTechAircraftData}, which represent's basic
	 *            technical characteristic of {@code CargoAircraft} object
	 * @param cargoAircraftTechData
	 *            - a {@code CargoAircraftTechData}, which represent's a cargo
	 *            unique technical characteristic.
	 */
	public CargoAircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData,
			CargoAircraftTechData cargoAircraftTechData) {
		super(idAircraft, nameAircraft, basicTechAircraftData);
		this.cargoAircraftTechData = cargoAircraftTechData;
	}

	/**
	 * Constructor.
	 * 
	 * @param idAircraft
	 *            - a unique ID of {@code CargoAircraft} object
	 * @param nameAircraft
	 *            - a name for {@code CargoAircraft} object
	 * @param basicTechAircraftData
	 *            - a {@code BasicTechAircraftData}, which represent's basic
	 *            technical characteristic of {@code CargoAircraft} object
	 * @param cargoAircraftTechData
	 *            - a {@code CargoAircraftTechData}, which represent's a cargo
	 *            unique technical characteristic.
	 */
	public CargoAircraft() {
		super();
		this.cargoAircraftTechData = new CargoAircraftTechData();
	}

	public CargoAircraftTechData getCargoAircraftTechdata() {
		return cargoAircraftTechData;
	}

	public void setCargoAircraftTechdata(CargoAircraftTechData cargoAircraftTechData) {
		this.cargoAircraftTechData = cargoAircraftTechData;
	}

	/**
	 * Returns a string representation of {@code CargoAircraft} object.
	 * 
	 * @return a string, which is consisted of
	 *         <i>idAircraft</i>,<i>nameAircraft</i>,
	 *         <i>basicTechAircraftData</i> and <i>cargoAircraftTechData</i>
	 *         fields of {@code CargoAircraft}.
	 */
	@Override
	public String toString() {
		return (super.toString() + "\n" + this.cargoAircraftTechData.toString());
	}

	/**
	 * Indicates whether some other {@code CargoAircraft} object is "equal to "
	 * this one
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code CargoAircraft} object is the
	 *         same as obj argument; <b>{@code false}</b> otherwise.
	 * 
	 */
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

}
