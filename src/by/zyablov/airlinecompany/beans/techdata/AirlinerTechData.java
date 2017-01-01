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
public class AirlinerTechData implements UniqueAircraftTechDataBehavior, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -375709814509627970L;
	
	
	
	private String airlinerType;
	private boolean haveBusinesClass;

	/**
	 * @param airlinerType
	 * @param havBusinesClass
	 */
	public AirlinerTechData(String airlinerType, boolean havBusinesClass) {
		this.airlinerType = airlinerType;
		this.haveBusinesClass = havBusinesClass;
	}

	public AirlinerTechData() {
		this.airlinerType = null;
		this.haveBusinesClass = false;
	}

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

	@Override
	public String toString() {
		return "airlinerType = " + this.airlinerType + "\n" + "havBusinesClass = " + this.haveBusinesClass;
	}

	/**
	 * @return the airlinerType
	 */
	public String getAirlinerType() {
		return airlinerType;
	}

	/**
	 * @param airlinerType
	 *            the airlinerType to set
	 */
	public void setAirlinerType(String airlinerType) {
		this.airlinerType = airlinerType;
	}

	/**
	 * @return the havBusinesClass
	 */
	public boolean isHavBusinesClass() {
		return haveBusinesClass;
	}

	/**
	 * @param havBusinesClass
	 *            the havBusinesClass to set
	 */
	public void setHavBusinesClass(boolean havBusinesClass) {
		this.haveBusinesClass = havBusinesClass;
	}

}
