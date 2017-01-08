
package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;

import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * Class {@code AirlinerTechData} represents a unique technical information for
 * {@code AirlinerAircraft} class such as airliner type depending on the flight
 * distance and opportunity to have business class on board of an aircraft.
 * <p>
 * Class {@code AirlinerTechData} implements
 * {@code UniqueAircraftTechDataBehavior} to show that's
 * {@code AirlinerAircraft} can have such unique technical information.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see UniqueAircraftTechDataBehavior
 * 
 */
public class AirlinerTechData implements UniqueAircraftTechDataBehavior, Serializable {

	/**
	 * This value is genereted by JVM to serialize {@code AirlinerTechData}
	 * class.
	 */
	private static final long serialVersionUID = -375709814509627970L;

	/**
	 * This field is a String value of airliner aircraft type depending on the
	 * flight distance.
	 * 
	 * @see by.zyablov.airlinecompany.enums.aircraftenums.AirlinerTypeEnum
	 */
	private String airlinerType;

	/**
	 * This field is a boolean value of opportunity to have business class on
	 * board.
	 */
	private boolean haveBusinesClass;

	/**
	 * Constructor.
	 * 
	 * @param airlinerType
	 *            - a String value of airliner aircraft type depending on the
	 *            flight distance.
	 * 
	 * @param havBusinesClass
	 *            - a boolean value of opportunity to have business class on
	 *            board
	 */
	public AirlinerTechData(String airlinerType, boolean havBusinesClass) {
		this.airlinerType = airlinerType;
		this.haveBusinesClass = havBusinesClass;
	}

	/**
	 * Constructor.
	 * 
	 * @param airlinerType
	 *            - a String value of airliner aircraft type depending on the
	 *            flight distance.
	 * 
	 * @param havBusinesClass
	 *            - a boolean value of opportunity to have business class on
	 *            board
	 */
	public AirlinerTechData() {
		this.airlinerType = null;
		this.haveBusinesClass = false;
	}

	public String getAirlinerType() {
		return airlinerType;
	}

	public void setAirlinerType(String airlinerType) {
		this.airlinerType = airlinerType;
	}

	public boolean isHavBusinesClass() {
		return haveBusinesClass;
	}

	public void setHavBusinesClass(boolean havBusinesClass) {
		this.haveBusinesClass = havBusinesClass;
	}

	/**
	 * Returns a string representation of {@code AirlinerTechData} object.
	 * 
	 * @return a string, which is consisted of <i>airlinerType</i> and
	 *         <i>haveBusinesClass</i> fields of {@code AirlinerTechData}.
	 */
	@Override
	public String toString() {
		return "airlinerType = " + (this.airlinerType) + "\n" + "havBusinesClass = " + (this.haveBusinesClass);
	}

	/**
	 * Indicates whether some other {@code AirlinerTechData} object is "equal to
	 * " this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code AirlinerTechData} object is
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

		if (!(obj instanceof AirlinerTechData)) {
			return false;
		}

		AirlinerTechData other = (AirlinerTechData) obj;
		return ((this.haveBusinesClass == other.haveBusinesClass) && (this.airlinerType.equals(other.airlinerType)));
	}
}
