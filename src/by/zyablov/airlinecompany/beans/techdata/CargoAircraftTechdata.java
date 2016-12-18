package by.zyablov.airlinecompany.beans.techdata;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;

public class CargoAircraftTechdata {

	private CubicMeter cargoDepartmentSize;
	private boolean canTransprtDangerGoods;

	/**
	 * @param cargoDepartmentSize
	 * @param canTransprtDangerGoods
	 */
	public CargoAircraftTechdata(CubicMeter cargoDepartmentSize, boolean canTransprtDangerGoods) {
		this.cargoDepartmentSize = cargoDepartmentSize;
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}

	public CargoAircraftTechdata() {
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

		if (!(obj instanceof CargoAircraftTechdata)) {
			return false;
		}

		CargoAircraftTechdata other = (CargoAircraftTechdata) obj;
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
