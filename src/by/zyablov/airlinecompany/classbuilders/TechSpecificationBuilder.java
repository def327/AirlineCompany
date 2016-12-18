/**
 * 
 */
package by.zyablov.airlinecompany.classbuilders;

import by.zyablov.airlinecompany.measures.FuelSpendTonPerKm;
import by.zyablov.airlinecompany.measures.KilometerPerHour;
import by.zyablov.airlinecompany.measures.PeopleCapacity;
import by.zyablov.airlinecompany.measures.Tons;
import by.zyablov.airlinecompany.techdata.TechSpecificationAircraft;

/**
 * @author Дмитрий
 *
 */
public class TechSpecificationBuilder {

	private TechSpecificationAircraft specification;

	/**
	 * 
	 */
	public TechSpecificationBuilder() {
		specification = new TechSpecificationAircraft();
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
	
	public TechSpecificationAircraft getResult(){
		return specification;
	}

}
