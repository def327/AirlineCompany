/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.measures.CubicMeters;
import by.zyablov.airlinecompany.measures.Tons;
import by.zyablov.airlinecompany.techdata.AircraftIdName;
import by.zyablov.airlinecompany.techdata.SpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraft extends Aircraft {

	private CubicMeters cargoDepartmentSize;
	private boolean canTransprtDangerGoods;

	/**
	 * @param nameID
	 * @param specification
	 */
	public CargoAircraft(AircraftIdName nameID, SpecificationAircraft specification, CubicMeters cargoDepartmentSize,
			boolean canTransprtDangerGoods) {
		super(nameID, specification);
		this.cargoDepartmentSize = cargoDepartmentSize;
		this.canTransprtDangerGoods = canTransprtDangerGoods;
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

		if (!(obj instanceof CargoAircraft)) {
			return false;
		}

		if (super.equals(obj)) {
			return false;
		}

		CargoAircraft other = (CargoAircraft) obj;
		return ((this.cargoDepartmentSize.equals(other.cargoDepartmentSize))
					&& (this.canTransprtDangerGoods == other.canTransprtDangerGoods));
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
