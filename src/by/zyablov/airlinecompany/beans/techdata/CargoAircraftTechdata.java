package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

public class CargoAircraftTechData implements UniqueAircraftTechDataBehavior, Serializable {

	private static final long serialVersionUID = -291296523782820836L;

	private CubicMeter cargoDepartmentSize;
	private boolean canTransprtDangerGoods;

	/**
	 * !!! This a constuctor with parameters
	 * 
	 * @param cargoDepartmentSize
	 * @param canTransprtDangerGoods
	 */
	public CargoAircraftTechData(CubicMeter cargoDepartmentSize, boolean canTransprtDangerGoods) {
		this.cargoDepartmentSize = cargoDepartmentSize;
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public CargoAircraftTechData() {
		this.cargoDepartmentSize = new CubicMeter();
		this.canTransprtDangerGoods = false;
	}

	public CubicMeter getCargoDepartmentSize() {
		return cargoDepartmentSize;
	}

	public void setCargoDepartmentSize(CubicMeter cargoDepartmentSize) {
		this.cargoDepartmentSize = cargoDepartmentSize;
	}

	public boolean isCanTransprtDangerGoods() {
		return canTransprtDangerGoods;
	}

	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods) {
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}

	/**
	 * !!! This method parse fields to string
	 */
	@Override
	public String toString() {
		return (this.cargoDepartmentSize.toString() + "\n" + "canTransprtDangerGoods = " + this.canTransprtDangerGoods);
	}

	/**
	 * !!! This method equals two CargoAircraftTechData
	 */
	@Override
	public boolean equals(Object obj) {

		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof CargoAircraftTechData)) {
			return false;
		}

		CargoAircraftTechData other = (CargoAircraftTechData) obj;
		return ((this.canTransprtDangerGoods == other.canTransprtDangerGoods)
				&& (this.cargoDepartmentSize.equals(other.cargoDepartmentSize)));
	}
}
