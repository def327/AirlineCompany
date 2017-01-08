
package by.zyablov.airlinecompany.beans.builders;

import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * Class {@code BuilderBasicTechAiracft} creates {@code BasicTechAircraftData}
 * object and initializes it's fields.
 * 
 * @see by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData
 *
 */
public class BuilderBasicTechAiracft implements BuilderBehavior {

	/**
	 * A value of {@code BasicTechAircraftData} object to create and initialize
	 */
	private BasicTechAircraftData specification;

	/**
	 * Set's an maxWeigthCapacity for {@code BasicTechAircraftData} object
	 * 
	 * @param maxWeigthCapacity
	 *            - this value represents a maximum weight capacity
	 */
	public void setMaxWeigthCapacity(int maxWeigthCapacity) {
		specification.setMaxWeigthCapacity(new Tons(maxWeigthCapacity));
	}

	/**
	 * Set's an fuelSpending for {@code BasicTechAircraftData} object
	 * 
	 * @param fuelSpending
	 *            - this value represents a fuel spending
	 */
	public void setFuelSpending(int fuelSpending) {
		specification.setFuelSpending(new FuelSpendTonPerKm(fuelSpending));
	}

	/**
	 * Set's an midVelocity for {@code BasicTechAircraftData} object
	 * 
	 * @param midVelocity
	 *            - this value represents a middle velocity
	 */
	public void setMiddleVelocity(int midVelocity) {
		specification.setMiddleVelocity(new KilometerPerHour(midVelocity));
	}

	/**
	 * Set's an peopleCapacity for {@code BasicTechAircraftData} object
	 * 
	 * @param peopleCapacity
	 *            - this value represents a people capacity
	 */
	public void setPeopleCapacity(int peopleCapacity) {
		specification.setMaxPeopleCapacity(new PeopleCapacity(peopleCapacity));
	}

	/**
	 * Return's a initialized {@code BasicTechAircraftData} object
	 */
	public BasicTechAircraftData getResult() {
		return specification;
	}

	/**
	 * Constructor.
	 * 
	 * @param specification
	 *            - {@code BasicTechAircraftData} object to create and
	 *            initialize
	 */
	public BuilderBasicTechAiracft() {
		specification = new BasicTechAircraftData();
	}

}
