/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechdata;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraftTechdataBuilder implements BuilderBehavior {
	
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
