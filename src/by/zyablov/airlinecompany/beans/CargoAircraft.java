/**
 * 
 */
package by.zyablov.airlinecompany.beans;

import by.zyablov.airlinecompany.measures.CubicMeter;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraft extends Aircraft {

	private CubicMeter cargoDepartmentSize;
	
	private boolean canTransprtDangerGoods;
	
	/**
	 * @param id
	 * @param name
	 * @param specification
	 * @param cargoDepartmentSize
	 * @param canTransprtDangerGoods
	 */
	public CargoAircraft(int id, String name, TechSpecificationAircraft specification, CubicMeter cargoDepartmentSize,
			boolean canTransprtDangerGoods) {
		super(id, name, specification);
		this.cargoDepartmentSize = cargoDepartmentSize;
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}
	
	public CargoAircraft(){
		super(0,null,null);
		this.cargoDepartmentSize = null;
		this.canTransprtDangerGoods = false;
	}

	/**
	 * @return the cargoDepartmentSize
	 */
	public CubicMeter getCargoDepartmentSize() {
		return cargoDepartmentSize;
	}

	/**
	 * @param cargoDepartmentSize the cargoDepartmentSize to set
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
	 * @param canTransprtDangerGoods the canTransprtDangerGoods to set
	 */
	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods) {
		this.canTransprtDangerGoods = canTransprtDangerGoods;
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

		CargoAircraft other = (CargoAircraft) obj;
		return ((this.canTransprtDangerGoods == other.canTransprtDangerGoods) && (this.cargoDepartmentSize.equals(other.cargoDepartmentSize)));
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\n" + "canTransprtDangerGoods = " + canTransprtDangerGoods + "\n" + "cargoDepartmentSize = "
				+ cargoDepartmentSize);
	}

	

}
