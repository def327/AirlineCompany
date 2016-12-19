/**
 * 
 */
package by.zyablov.airlinecompany.beans.classbuilders;

import by.zyablov.airlinecompany.beans.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.beans.measures.KilometerPerHour;
import by.zyablov.airlinecompany.beans.measures.PeopleCapacity;
import by.zyablov.airlinecompany.beans.measures.Tons;
import by.zyablov.airlinecompany.beans.techdata.BasicTechAircraftData;
import by.zyablov.airlinecompany.interfaces.BuilderBehavior;

/**
 * @author Дмитрий
 *
 */
public class TechSpecificationBuilder implements BuilderBehavior {

	private BasicTechAircraftData specification;

	/**
	 * 
	 */
	public TechSpecificationBuilder() {
		specification = new BasicTechAircraftData();
	}

	public void setMaxWeigthCapacity(int maxWeigthCapacity) {
		specification.setMaxWeigthCapacity(new Tons(maxWeigthCapacity));
	}

	public void setFuelSpending(int fuelSpending) {
		specification.setFuelSpending(new FuelSpendTonPerKm(fuelSpending));
	}

	public void setMidVelocity(int midVelocity){
		specification.setMidVelocity(new KilometerPerHour(midVelocity));
	}

	public void setPeopleCapacity(int peopleCapacity){
		specification.setPeopleCapacity(new PeopleCapacity(peopleCapacity));
	}
	
	public BasicTechAircraftData getResult(){
		return specification;
	}

}
