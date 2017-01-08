
package by.zyablov.airlinecompany.beans.aircrafts;

import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 *
 * Class {@code AirlinerAircraft} represents an airliner aircraft,
 * {@code AirlinerAircraft} is a child of {@code Aircraft}, add a new field
 * airlinerTechData, which represents an unique technical characteristic of
 * every {@code CargoAircraft} object.
 * 
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see by.zyablov.airlinecompany.beans.techdata.AirlinerTechData
 * 
 */
public class AirlinerAircraft extends Aircraft {

	/**
	 * This value is genereted by JVM to serialize {@code AirlinerAircraft}
	 * class
	 */
	private static final long serialVersionUID = 6664670089448551525L;

	/**
	 * This value represents an unique technical characteristic of every
	 * {@code AirlinerAircraft} object.
	 * 
	 * @see by.zyablov.airlinecompany.beans.techdata.AirlinerTechData
	 */
	private AirlinerTechData airlinerTechData;

	/**
	 * Returns an {@code AirlinerAircraft} object's full information, which is
	 * parsed to string
	 * 
	 * @return a full techinical information, parsed to String
	 */
	@Override
	public String getFullAircraftInformationDataToString() {

		/* Get all airliner aircraft's fields */
		String aircraftTYpe = "AIRLINER";
		int idAircraft = this.idAircraft;
		String nameAircraft = this.nameAircraft;
		String fuelSpending = this.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString();
		String middleVelocity = this.getBasicTechAircraftData().getMiddleVelocity().getMeasureValueInString();
		String maxPeopleCapacity = this.getBasicTechAircraftData().getMaxPeopleCapacity().getMeasureValueInString();
		String maxWeightCapacity = this.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInString();
		String airlinerType = this.getAirlinerTechData().getAirlinerType();
		String havBusinesClass = (this.getAirlinerTechData().isHavBusinesClass()) ? "YES" : "NO";

		String airlinerAircraftDataString = ("AIRCRAFT TYPE: " + aircraftTYpe + "\n" + "ID Aircraft: " + idAircraft
				+ "\n" + "NAME: " + nameAircraft + "\n" + "MAXIMUM FUEL SPENDING: " + fuelSpending + "\n"
				+ "MIDDLE VELOCITY: " + middleVelocity + "\n" + "MAX PEOPLE CAPACITY: " + maxPeopleCapacity + "\n"
				+ "MAX WEIGHT CAPACITY: " + maxWeightCapacity + "\n" + "AIRLINER TYPE: " + airlinerType + "\n"
				+ "HAVE BUSSINESS CLASS: " + havBusinesClass);

		return airlinerAircraftDataString;
	}

	/**
	 * Constructor.
	 * 
	 * @param idAircraft
	 *            - a unique ID of {@code Aircraft} object
	 * @param nameAircraft
	 *            - a name for {@code Aircraft} object
	 * @param basicTechAircraftData
	 *            - a {@code BasicTechAircraftData}, which represent's basic
	 *            technical characteristic of {@code Aircraft} object
	 * @param airlinerTechData
	 *            - a {@code AirlinerTechData}, which represent's an airliner
	 *            unique technical characteristic.
	 * 
	 */
	public AirlinerAircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData,
			AirlinerTechData airlinerTechData) {
		super(idAircraft, nameAircraft, basicTechAircraftData);
		this.airlinerTechData = airlinerTechData;
	}

	/**
	 * Constructor.
	 * 
	 * @param idAircraft
	 *            - a unique ID of {@code Aircraft} object
	 * @param nameAircraft
	 *            - a name for {@code Aircraft} object
	 * @param basicTechAircraftData
	 *            - a {@code BasicTechAircraftData}, which represent's basic
	 *            technical characteristic of {@code Aircraft} object
	 * @param airlinerTechData
	 *            - a {@code AirlinerTechData}, which represent's an airliner
	 *            unique technical characteristic.
	 * 
	 */
	public AirlinerAircraft() {
		super();
		this.airlinerTechData = new AirlinerTechData();
	}

	public AirlinerTechData getAirlinerTechData() {
		return airlinerTechData;
	}

	public void setAirlinerTechData(AirlinerTechData airlinerTechData) {
		this.airlinerTechData = airlinerTechData;
	}

	/**
	 * Returns a string representation of {@code AirlinerAircraft} object.
	 * 
	 * @return a string, which is consisted of
	 *         <i>idAircraft</i>,<i>nameAircraft</i>,
	 *         <i>basicTechAircraftData</i> and <i>airlinerTechData</i> fields
	 *         of {@code AirlinerAircraft}.
	 */
	@Override
	public String toString() {
		return (super.toString() + "\n" + this.airlinerTechData.toString());
	}

	/**
	 * Indicates whether some other {@code AirlinerAircraft} object is "equal to
	 * " this one
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code AirlinerAircraft} object is
	 *         the same as obj argument; <b>{@code false}</b> otherwise.
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

		AirlinerAircraft other = (AirlinerAircraft) obj;
		return (this.airlinerTechData.equals(other.airlinerTechData));
	}

}
