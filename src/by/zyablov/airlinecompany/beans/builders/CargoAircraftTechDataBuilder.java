/**
 * 
 */
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class CargoAircraftTechDataBuilder implements BuilderBehavior {
	
	private CargoAircraftTechData cargoAircraftTechData;
	
	public CargoAircraftTechDataBuilder(){
		cargoAircraftTechData = new CargoAircraftTechData();
	}
	
	public void setCargoDepartmentSize(int cargoDepartmentSize){
		cargoAircraftTechData.setCargoDepartmentSize( new CubicMeter(cargoDepartmentSize));
	}
	
	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods){
		cargoAircraftTechData.setCanTransprtDangerGoods(canTransprtDangerGoods);
	}
	
	public CargoAircraftTechData getResult(){
		return cargoAircraftTechData;
	}
	
	

}






