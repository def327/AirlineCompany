/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class Airliner extends Aircraft {

	private String airlinerType;

	private boolean havBusinesClass;



	/**
	 * @param id
	 * @param name
	 * @param specification
	 * @param airlinerType
	 * @param havBusinesClass
	 */
	public Airliner(int id, String name, TechSpecificationAircraft specification, String airlinerType,
			boolean havBusinesClass) {
		super(id, name, specification);
		this.airlinerType = airlinerType;
		this.havBusinesClass = havBusinesClass;
	}

	/**
	 * @param airlinerType
	 * @param havBusinesClass
	 * 
	 */
	public Airliner() {
		super();
		this.airlinerType = null;
		this.havBusinesClass = false;
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
	 * @param havBusinesClass
	 *            the havBusinesClass to set
	 */
	public void setHavBusinesClass(boolean havBusinesClass) {
		this.havBusinesClass = havBusinesClass;
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

		Airliner other = (Airliner) obj;
		return ((this.havBusinesClass == other.havBusinesClass) && (this.airlinerType.equals(other.airlinerType)));
	}

	@Override
	public String toString() {
		return (super.toString() + "\n" + "airlinerType = " + airlinerType + "\n" + "havBusinesClass = "
					+ havBusinesClass);
	}

}
