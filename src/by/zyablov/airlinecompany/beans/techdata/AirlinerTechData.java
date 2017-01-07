/**
 * 
 */
package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;

import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * @author Дмитрий
 *
 */
public class AirlinerTechData implements UniqueAircraftTechDataBehavior, Serializable {

	private static final long serialVersionUID = -375709814509627970L;

	private String airlinerType;
	private boolean haveBusinesClass;

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param airlinerType
	 * @param havBusinesClass
	 */
	public AirlinerTechData(String airlinerType, boolean havBusinesClass) {
		this.airlinerType = airlinerType;
		this.haveBusinesClass = havBusinesClass;
	}

	/**
	 * !!! This a constuctor without parameters
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
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return "airlinerType = " + this.airlinerType + "\n" + "havBusinesClass = " + this.haveBusinesClass;
	}

	/**
	 * !!! This method equals two AirlinerTechData
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
