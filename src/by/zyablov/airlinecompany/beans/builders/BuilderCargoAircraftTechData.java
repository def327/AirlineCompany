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
public class BuilderCargoAircraftTechData implements BuilderBehavior {

	private CargoAircraftTechData cargoAircraftTechData;

	public void setCargoDepartmentSize(int cargoDepartmentSize) {
		cargoAircraftTechData.setCargoDepartmentSize(new CubicMeter(cargoDepartmentSize));
	}

	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods) {
		cargoAircraftTechData.setCanTransprtDangerGoods(canTransprtDangerGoods);
	}

	public CargoAircraftTechData getResult() {
		return cargoAircraftTechData;
	}

	/**
	 * !!! This a constuctor without parameters
	 */
	public BuilderCargoAircraftTechData() {
		cargoAircraftTechData = new CargoAircraftTechData();
	}

}
