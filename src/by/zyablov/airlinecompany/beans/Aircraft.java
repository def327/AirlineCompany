/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.techdata.*;

/**
 * @author Дмитрий
 *
 */
public abstract class Aircraft {
	private AircraftIdName nameId;
	private SpecificationAircraft specification;

	/**
	 * @param id
	 * @param name
	 * @param specification
	 */
	public Aircraft(AircraftIdName nameID, SpecificationAircraft specification) {
		this.nameId = nameID;
		this.specification = specification;
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

		Aircraft other = (Aircraft) obj;
		return ((this.nameId.equals(other.nameId)) && (this.specification.equals(other.specification)));
	}
	
	@Override
	public String toString() {
		return nameId.toString()+ " " + specification.toString();
	}	

}
