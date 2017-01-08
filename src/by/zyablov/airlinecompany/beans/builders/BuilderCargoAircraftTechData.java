
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * Class {@code BuilderCargoAircraftTechData} creates
 * {@code CargoAircraftTechData} object and initializes it's fields.
 * 
 * @see by.zyablov.airlinecompany.beans.techdata.CargoAircraftTechData
 *
 */
public class BuilderCargoAircraftTechData implements BuilderBehavior {

	/**
	 * A value of {@code CargoAircraftTechData} object to create and initialize
	 */
	private CargoAircraftTechData cargoAircraftTechData;

	/**
	 * Set's a cargoDepartmentSize for {@code CargoAircraftTechData} object
	 * 
	 * @param cargoDepartmentSize
	 *            - this value represents a cargo department size for goods
	 */
	public void setCargoDepartmentSize(int cargoDepartmentSize) {
		cargoAircraftTechData.setCargoDepartmentSize(new CubicMeter(cargoDepartmentSize));
	}

	/**
	 * Set's can transport danger goods field for {@code CargoAircraftTechData}
	 * object
	 * 
	 * @param canTransprtDangerGoods
	 *            - this value represents an airliner opportunity for cargo
	 *            aircraft to transport danger goods
	 */
	public void setCanTransprtDangerGoods(boolean canTransprtDangerGoods) {
		cargoAircraftTechData.setCanTransprtDangerGoods(canTransprtDangerGoods);
	}

	/**
	 * Return's a initialized {@code CargoAircraftTechData} object
	 */
	public CargoAircraftTechData getResult() {
		return cargoAircraftTechData;
	}

	/**
	 * Constructor.
	 * 
	 * @param airlinerTechData
	 *            - {@code CargoAircraftTechData} object to create and
	 *            initialize
	 */
	public BuilderCargoAircraftTechData() {
		cargoAircraftTechData = new CargoAircraftTechData();
	}

}
