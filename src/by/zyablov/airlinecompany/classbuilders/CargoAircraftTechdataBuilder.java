/**
 * 
 */
package by.zyablov.airlinecompany.classbuilders;

import by.zyablov.airlinecompany.measures.CubicMeter;
import by.zyablov.airlinecompany.techdata.CargoAircraftTechdata;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraftTechdataBuilder {
	
	private CargoAircraftTechdata cargoAircraftTechdata;
	
	public CargoAircraftTechdataBuilder(){
		cargoAircraftTechdata = new CargoAircraftTechdata();
	}
	
	public void setCargoDepartmentSize(int cargoDepartmentSize){
		cargoAircraftTechdata.setCargoDepartmentSize( new CubicMeter(cargoDepartmentSize));
	}
	
	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods){
		cargoAircraftTechdata.setCanTransprtDangerGoods(canTransprtDangerGoods);
	}
	
	public CargoAircraftTechdata getResult(){
		return cargoAircraftTechdata;
	}
	
	

}





//	private CubicMeter cargoDepartmentSize;
//	private boolean canTransprtDangerGoods;
