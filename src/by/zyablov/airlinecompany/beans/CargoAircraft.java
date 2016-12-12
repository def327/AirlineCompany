/**
 * 
 */
package by.zyablov.airlinecompany.beans;


import by.zyablov.airlinecompany.measures.CubicMeters1;
import by.zyablov.airlinecompany.techdata.SpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraft extends Aircraft {
	
	private CubicMeters cargoDepartmentSize;
	private boolean canTransprtDangerGoods;

	/**
	 * @param cargoAircraftType
	 * @param cargoDepartmentSize
	 * @param canTransprtDangerGoods
	 */
	public CargoAircraft(int id, String name, SpecificationAircraft specification,
						 	CubicMeters cargoSizeDepartment, boolean canTransprtDangerGoods) {

		super(id, name, specification);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
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
