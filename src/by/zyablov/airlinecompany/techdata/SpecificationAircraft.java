/**
 * 
 */
package by.zyablov.airlinecompany.techdata;


import by.zyablov.airlinecompany.measures.Kilometers;
import by.zyablov.airlinecompany.measures.KilometersPerHour;
import by.zyablov.airlinecompany.measures.Tons;

/**
 * @author Дмитрий
 *
 */
public class SpecificationAircraft {

	private int maxPeopleCapacity;
	private Tons maxWeigthCapacity;
	private Tons maxFuelCapacity;
	private FuelSpending fuelSpending;
	private Kilometers maxFlightDestination;
	private KilometersPerHour averageSpeed;

	/**
	 * @param maxPeopleCapacity
	 * @param maxWeigthCapacity
	 * @param fuelSpending
	 */
	public SpecificationAircraft(int maxPeopleCapacity, Tons maxWeigthCapacity, FuelSpending fuelSpending) {
		this.maxPeopleCapacity = maxPeopleCapacity;
		this.maxWeigthCapacity = maxWeigthCapacity;
		this.fuelSpending = fuelSpending;
	}

	@Override
	/*
	 * This function will use to find Aircraft by it's speed and a fuel capacity
	 */
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (!(obj instanceof SpecificationAircraft)) {
			return false;
		}

		SpecificationAircraft other = (SpecificationAircraft) obj;
		return (this.fuelSpending.equals(other.fuelSpending));
	}

}
