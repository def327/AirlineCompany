package by.zyablov.airlinecompany.beans.techdata;

import java.io.Serializable;

import by.zyablov.airlinecompany.beans.measures.CubicMeter;
import by.zyablov.airlinecompany.interfaces.UniqueAircraftTechDataBehavior;

/**
 * Class {@code CargoAircraftTechData} represents a unique technical information
 * for {@code CargoAircraft} class such as a size of cargo depatment size of a
 * cargo aircraft in cubic meters and opportunity to transport danger goods on
 * board of a cargo aircraft.
 * 
 * <p>
 * Class {@code CargoAircraftTechData} implements
 * {@code UniqueAircraftTechDataBehavior} to show that's {@code CargoAircraft}
 * can have such unique technical information.
 * 
 * @author Дмитрий
 * @version 1.0
 * @since 2016
 * 
 * @see UniqueAircraftTechDataBehavior
 * 
 */
public class CargoAircraftTechData implements UniqueAircraftTechDataBehavior, Serializable {

	/**
	 * This value is genereted by JVM to serialize {@code CargoAircraftTechData}
	 * class.
	 */
	private static final long serialVersionUID = -291296523782820836L;

	/**
	 * This field is a value of a cargo department size in {@link CubicMeter}
	 * type.
	 */
	private CubicMeter cargoDepartmentSize;

	/**
	 * This field is a boolean value of opportunity to transport danger goods on
	 * board.
	 */
	private boolean canTransprtDangerGoods;

	/**
	 * Constructor.
	 * 
	 * @param cargoDepartmentSize
	 *            - a value of a cargo department size in {@link CubicMeter}
	 * @param canTransprtDangerGoods
	 *            - a boolean value of opportunity to transport danger goods on
	 *            board
	 */
	public CargoAircraftTechData(CubicMeter cargoDepartmentSize, boolean canTransprtDangerGoods) {
		this.cargoDepartmentSize = cargoDepartmentSize;
		this.canTransprtDangerGoods = canTransprtDangerGoods;
	}

	/**
	 * Constructor.
	 * 
	 * @param cargoDepartmentSize
	 *            - a value of a cargo department size in {@link CubicMeter}
	 * @param canTransprtDangerGoods
	 *            - a boolean value of opportunity to transport danger goods on
	 *            board
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
	 * Returns a string representation of {@code CargoAircraftTechData} object.
	 * 
	 * @return a string, which is consisted of <i>cargoDepartmentSize</i> and
	 *         <i>canTransprtDangerGoods</i> fields of
	 *         {@code CargoAircraftTechData}.
	 */
	@Override
	public String toString() {
		return ((this.cargoDepartmentSize.toString()) + "\n" + "canTransprtDangerGoods = "
				+ (this.canTransprtDangerGoods));
	}

	/**
	 * Indicates whether some other {@code CargoAircraftTechData} object is
	 * "equal to " this one.
	 * 
	 * @param obj
	 *            the reference object with which to compare
	 * @return <b>{@code true}</b> if this {@code CargoAircraftTechData} object
	 *         is the same as obj argument; <b>{@code false}</b> otherwise.
	 * 
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
