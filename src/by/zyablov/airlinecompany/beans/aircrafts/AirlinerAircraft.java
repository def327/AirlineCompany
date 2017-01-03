/**
 * 
 */
package by.zyablov.airlinecompany.beans.aircrafts;

import by.zyablov.airlinecompany.beans.techdata.AirlinerTechData;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;

/**
 * @author Дмитрий
 *
 */
public class AirlinerAircraft extends Aircraft {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664670089448551525L;

	private AirlinerTechData airlinerTechData;

	@Override
	public String getFullAircraftInformationDataToString() {

		/* Get all airliner aircraft's fields */
		String aircraftTYpe = "AIRLINER";
		int idAircraft = this.idAircraft;
		String nameAircraft = this.nameAircraft;
		String fuelSpending = this.getBasicTechAircraftData().getFuelSpending().getMeasureValueInString();
		String middleVelocity = this.getBasicTechAircraftData().getMidVelocity().getMeasureValueInString();
		String maxPeopleCapacity = this.getBasicTechAircraftData().getMaxPeopleCapacity().getMeasureValueInString();
		String maxWeightCapacity = this.getBasicTechAircraftData().getMaxWeigthCapacity().getMeasureValueInString();
		String airlinerType = this.getAirlinerTechData().getAirlinerType();
		String havBusinesClass = (this.getAirlinerTechData().isHavBusinesClass()) ? "YES" : "NO";

		String airlinerAircraftDataString = ("AIRCRAFT TYPE: " + aircraftTYpe + "\n" + "ID Aircraft: " + idAircraft + "\n"
				+ "NAME: " + nameAircraft + "\n" + "MAXIMUM FUEL SPENDING: " + fuelSpending + "\n" + "MIDDLE VELOCITY: "
				+ middleVelocity + "\n" + "MAX PEOPLE CAPACITY: " + maxPeopleCapacity + "\n" + "MAX WEIGHT CAPACITY: "
				+ maxWeightCapacity + "\n" + "AIRLINER TYPE: " + airlinerType + "\n" + "HAVE BUSSINESS CLASS: "
				+ havBusinesClass);

		return airlinerAircraftDataString;
	}

	/**
	 * @param idAircraft
	 * @param nameAircraft
	 * @param basicTechAircraftData
	 * @param airlinerTechData
	 */
	public AirlinerAircraft(int idAircraft, String nameAircraft, BasicTechAircraftData basicTechAircraftData,
			AirlinerTechData airlinerTechData) {
		super(idAircraft, nameAircraft, basicTechAircraftData);
		this.airlinerTechData = airlinerTechData;
	}

	/**
	 * @param airlinerType
	 * @param havBusinesClass
	 * 
	 */
	public AirlinerAircraft() {
		super();
		this.airlinerTechData = new AirlinerTechData();
	}

	/**
	 * @return the airlinerTechData
	 */
	public AirlinerTechData getAirlinerTechData() {
		return airlinerTechData;
	}

	/**
	 * @param airlinerTechData
	 *            the airlinerTechData to set
	 */
	public void setAirlinerTechData(AirlinerTechData airlinerTechData) {
		this.airlinerTechData = airlinerTechData;
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

		AirlinerAircraft other = (AirlinerAircraft) obj;
		return (this.airlinerTechData.equals(other.airlinerTechData));
	}

	@Override
	public String toString() {
		return (super.toString() + "\n" + this.airlinerTechData.toString());
	}

}
