/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.AircraftIdName;
import by.zyablov.airlinecompany.techdata.SpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class Airliner extends Aircraft {

	private String airlinerType;
	private boolean havBusinesClass;

	/**
	 * @param nameID
	 * @param specification
	 */
	public Airliner(AircraftIdName nameID, SpecificationAircraft specification, String airlinerType,
			boolean havBusinesClass) {
		super(nameID, specification);
		this.airlinerType = airlinerType;
		this.havBusinesClass = havBusinesClass;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(super.equals(obj))) {
			return false;
		}

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof Airliner)) {
			return false;
		}

		if (super.equals(obj)) {
			return false;
		}

		Airliner other = (Airliner) obj;
		return ((this.airlinerType.equals(other.airlinerType)) 
					&& (this.havBusinesClass == other.havBusinesClass));
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
