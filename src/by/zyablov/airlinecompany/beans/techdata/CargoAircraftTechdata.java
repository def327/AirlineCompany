package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

public class CargoAircraftTechData implements UniqueAircraftTechDataBehavior,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -291296523782820836L;
	
	
	
	
	private CubicMeter cargoDepartmentSize;
	private boolean canTransprtDangerGoods;

	/**
	 * @param cargoDepartmentSize
	 * @param canTransprtDangerGoods
	 */
	public CargoAircraftTechData(CubicMeter cargoDepartmentSize, boolean canTransprtDangerGoods) {
		this.cargoDepartmentSize = cargoDepartmentSize;
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}

	public CargoAircraftTechData() {
		this.cargoDepartmentSize = new CubicMeter();
		this.canTransprtDangerGoods = false;
	}

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
		return ((this.canTransprtDangerGoods == other.canTransprtDangerGoods) && (this.cargoDepartmentSize.equals(other.cargoDepartmentSize)));
	}

	@Override
	public String toString() {		
		return (this.cargoDepartmentSize.toString() + "\n" +  "canTransprtDangerGoods = " + this.canTransprtDangerGoods);
	}

	/**
	 * @return the cargoDepartmentSize
	 */
	public CubicMeter getCargoDepartmentSize() {
		return cargoDepartmentSize;
	}

	/**
	 * @param cargoDepartmentSize
	 *            the cargoDepartmentSize to set
	 */
	public void setCargoDepartmentSize(CubicMeter cargoDepartmentSize) {
		this.cargoDepartmentSize = cargoDepartmentSize;
	}

	/**
	 * @return the canTransprtDangerGoods
	 */
	public boolean isCanTransprtDangerGoods() {
		return canTransprtDangerGoods;
	}

	/**
	 * @param canTransprtDangerGoods
	 *            the canTransprtDangerGoods to set
	 */
	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods) {
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}

}
